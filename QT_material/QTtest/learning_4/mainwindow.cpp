#include "mainwindow.h"
#include "ui_mainwindow.h"
#include <QDialog>
#include <QDebug>
#include <QMessageBox>
#include <QColorDialog>
#include <QFileDialog>
#include <QFont>

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);

    //添加资源  “：” + “前缀名” + “文件名”
    //ui->actionNew->setIcon(QIcon(":/Image/1.png"));

    connect(ui->actionNew, &QAction::triggered, [=](){
    //对话框
        //模态对话框（不可以对其他窗口进行操作）

//模态创建 阻塞
//    QDialog dlg(this);
//    dlg.setWindowTitle("Dialog");
//    dlg.resize(400, 200);
//    dlg.exec();   //模态
//    qDebug() << "模态对话框弹出 ";

        //非模态对话框（可以对其他窗口进行操作）
//非模态创建
//      QDialog * dlg2 = new QDialog(this);
//      dlg2->setWindowTitle("Dialog");
//      dlg2->resize(400, 200);
//      dlg2->show();   //非模态
//      dlg2->setAttribute(Qt::WA_DeleteOnClose); //防止内存泄漏 55号属性
//      qDebug() << "模态对话框弹出 ";

        //消息对话框
//            //错误对话框
//        QMessageBox * mb = new QMessageBox(this);
//        mb->critical(this, "critical", "error");
//            //信息对话框
//        mb->information(this, "info", "yes");
//            //提问对话框
//                //参数1 父亲; 参数2 标题; 参数3 提示内容; 参数4 按键类型; 参数5 默认关联回车按键
//        if (mb->Save == mb->question(this, "ques", "que", mb->Save | mb->Cancel, mb->Save))
//            qDebug() << "Save";
//        else qDebug() << "Cancel";
//            //警告对话框
//        mb->warning(this, "warning", "warn");

        //颜色对话框
        QColor color = QColorDialog::getColor(QColor(0,255,0));
        qDebug() << "r = " << color.red() << "g = " << color.green() << "b = " << color.blue();

        //文件对话框
        QString str =  QFileDialog::getOpenFileName(this, "openFile", "C:", "(*.jpg)" );
        qDebug() << "path: " << str.toUtf8().data() << endl;

        //字体对话框
        //QFont
    });
}

MainWindow::~MainWindow()
{
    delete ui;
}
