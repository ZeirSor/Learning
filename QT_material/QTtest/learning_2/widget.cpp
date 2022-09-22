#include "widget.h"
#include "ui_widget.h"
#include "QPushButton"
#include "QDebug"

Widget::Widget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Widget)
{
    ui->setupUi(this);
    setFixedSize(2000, 1000);
    setWindowTitle("图像处理");
    //tea
    this->zt = new Teacher(this);

    //stu
    this->st = new Student(this);

    //con
//    connect(zt, &Teacher::hungry, st, &Student::treat );

//    classIsover();  //先链接再触发

    //connect parameter
    //函数指针-》函数地址
    void (Teacher:: *tSignal)(QString) = &Teacher::hungry;
    void (Student:: *sSignal)(QString) = &Student::treat;
    connect(zt, tSignal, st, sSignal);


    //classIsover();
    //点击下课按钮 再下课
    QPushButton* isClassOver = new QPushButton;
    isClassOver->setParent(this);
    isClassOver->setText("下课");
    isClassOver->show();

//    connect(isClassOver, &QPushButton::clicked, this, &Widget::classIsover);

    //无参信号和槽的连接
    void (Teacher:: *tSignal2)(void ) = &Teacher::hungry;
    void (Student:: *sSignal2)(void ) = &Student::treat;
    connect(zt, tSignal2, st, sSignal2);

    connect(isClassOver, &QPushButton::clicked, zt, tSignal2);
    //  connect(isClassOver, &QPushButton::clicked, this, &Widget::classIsover);
    //断开信号 disconnect  disconnect(zt, tSignal2, st, sSignal2);

    //Lambda
    //修改失败
//    [=](){
//        isClassOver->setText("还没下课");
//    };
    //正确写法 最后加()表示函数调用
//    [=](){
//        isClassOver->setText("还没下课");
//    }();

//    isClassOver->setBackgroundRole(QPalette::Background);
//    isClassOver->show();

    //mutable关键字修改值传递 不是本身
//    QPushButton* btn = new QPushButton(this);
//    QPushButton* btn2 = new QPushButton(this);
//    btn2->move(100,100);
//    int m = 10;
//    connect(btn, &QPushButton::clicked, this, [m]()mutable{m = 100 + 10, qDebug() << m ;});
//    connect(btn2, &QPushButton::clicked, this, [=](){ qDebug() << m ; });

//    int res = []()->int{return 1000;}();
//    qDebug() << res ;


    QPushButton* btn = new QPushButton("关闭", this);
    btn->move(100,0);
    btn->show();
    connect(btn, &QPushButton::clicked, this, [=](){
        this->classIsover();
        btn->setText("666");
        this->close();
    });


}

void Widget::classIsover()
{
    //emit触发
    //emit zt->hungry();

    emit zt->hungry("宫保鸡丁");
}

Widget::~Widget()
{
    delete ui;
}
