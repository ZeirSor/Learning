#include "mainwindow.h"
#include "ui_mainwindow.h"

#include <opencv2/opencv.hpp>

using namespace cv;

#include <opencv2/opencv.hpp>
#define _USE_MATH_DEFINES
#include <math.h>
#include <iostream>

using namespace std;
using namespace cv;

// ----- 全局参数
// PAI值
double PI = M_PI;
// 设置输入图像固定尺寸（必要）
double HEIGHT = 300;
double WIDTH = 300;
// 输入图像圆的半径，一般是宽高一半
int CIRCLE_RADIUS = int(HEIGHT / 2);
// 圆心坐标
cv::Point CIRCLE_CENTER = cv::Point(int(WIDTH / 2), int(HEIGHT / 2));
// 极坐标转换后图像的高，可自己设置
int LINE_HEIGHT = int(CIRCLE_RADIUS / 1.5);
// 极坐标转换后图像的宽，一般是原来圆形的周长
int LINE_WIDTH = int(2 * CIRCLE_RADIUS * PI);

// Define a pixel
typedef Point3_<uint8_t> Pixel;

cv::Mat create_line_image(cv::Mat img)
{
    cv::Mat line_image = cv::Mat::zeros(Size(LINE_WIDTH, LINE_HEIGHT), CV_8UC3);
    // 角度
    double theta;
    // 半径
    double rho;

    // 按照圆的极坐标赋值
    for (int row = 0; row < line_image.rows; row++)
    {
        for (int col = 0; col < line_image.cols; col++)
        {
            // 最后的-0.1是用于优化结果，可以自行调整
            theta = PI * 2 / LINE_WIDTH * (col + 1) - 0.2;
            rho = CIRCLE_RADIUS - row - 1;

            int x = int(CIRCLE_CENTER.x + rho * std::cos(theta) + 0);
            int y = int(CIRCLE_CENTER.y - rho * std::sin(theta) + 0);

            // Obtain pixel at(y,x)直接访问像素数据(效率不高，可以修改）
            Pixel pixel = img.at<Pixel>(y, x);
            // 赋值
            line_image.at<Pixel>(row, col) = pixel;
        }
    }
    // 如果想改变输出图像方向，旋转就行了
    // cv::rotate(line_image, line_image, cv::ROTATE_90_CLOCKWISE);
    return line_image;
}

// ----- 主程序
MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
//    ui->setupUi(this);
//    Mat src = imread("C:/Users/ASUS/Desktop/OIP-C.jpg");
//    imshow("6666", src);
//    waitKey(0);

    // 输入图像路径
    //String imgpath = ":/defectionImage/defectionImage_1.png";
    // 读取图像
    if (1 == 0)
    {
        cv::Mat img = cv::imread("C:/Users/ASUS/Desktop/QTtest/opencvTest_1/defectionImage/defectionImage_1.png");
        if (img.empty())
        {
            printf("please check image path");
            return ;
        }
        // 图像重置为固定大小
        cv::resize(img, img, Size(WIDTH, HEIGHT));
        printf("shape is: %d,%d", img.rows, img.cols);
        // 展示原图
        cv::imshow("src", img);
        cv::Mat output = create_line_image(img);
        // 展示结果
        cv::imshow("dst", output);
        cv::waitKey();
        cv::destroyAllWindows();
    }
    if (1 == 1)
    {
        // log_polar_img 半对数极坐标变换结果
        // lin_polar_img 极坐标变换结果
        // recovered_log_polar 半对数极坐标逆变换结果
        // recovered_lin_polar_img 极坐标逆变换结果
        Mat log_polar_img, lin_polar_img, recovered_log_polar, recovered_lin_polar_img;
        // INTER_LINEAR 双线性插值，WARP_FILL_OUTLIERS填充所有目标图像像素
        int flags = INTER_LINEAR + WARP_FILL_OUTLIERS;

        // 读图
        String imagepath = "C:/Users/ASUS/Desktop/QTtest/opencvTest_1/defectionImage/defectionImage_1.png";
        Mat src = imread(imagepath);
        if (src.empty())
        {
            fprintf(stderr, "Could not initialize capturing...\n");
            return ;
        }

        // 圆心坐标
        Point2f center((float)src.cols / 2, (float)src.rows / 2);
        // 圆的半径
        double maxRadius = min(center.y, center.x);

        // direct transform
        // linear Polar 极坐标变换, Size()表示OpenCV根据输入自行决定输出图像尺寸
        warpPolar(src, lin_polar_img, Size(), center, maxRadius, flags);
        // semilog Polar 半对数极坐标变换, Size()表示OpenCV根据输入自行决定输出图像尺寸
        warpPolar(src, log_polar_img, Size(), center, maxRadius, flags + WARP_POLAR_LOG);
        // inverse transform 逆变换
        warpPolar(lin_polar_img, recovered_lin_polar_img, src.size(), center, maxRadius, flags + WARP_INVERSE_MAP);
        warpPolar(log_polar_img, recovered_log_polar, src.size(), center, maxRadius, flags + WARP_POLAR_LOG + WARP_INVERSE_MAP);

        // 改变结果方向
        // rotate(lin_polar_img, lin_polar_img, ROTATE_90_CLOCKWISE);

        // 展示图片
        imshow("Src frame", src);
        imshow("Log-Polar", log_polar_img);
        imshow("Linear-Polar", lin_polar_img);
        imshow("Recovered Linear-Polar", recovered_lin_polar_img);
        imshow("Recovered Log-Polar", recovered_log_polar);
        waitKey(0);
    }

}

MainWindow::~MainWindow()
{
    delete ui;
}
