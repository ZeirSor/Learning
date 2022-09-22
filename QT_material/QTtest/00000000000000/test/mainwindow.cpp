#include "mainwindow.h"
#include <QPushButton>
#include <mypushbutton.h>


MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
{
    QPushButton *btn = new QPushButton;
    //btn->show();
    //btn->setParent(this);

    //btn->setText("Button");

    QPushButton *btn2 = new QPushButton("Button_2", this);

    btn2->move(200,200);

    //按钮大小
    btn->resize(20,10);

    //设置窗口大小
    resize(800,600);

    //设置固定窗口大小
//    setFixedSize(600,400);

    //设置窗口标题
    setWindowTitle("Window title");

    MyPushButton *myBtn = new MyPushButton;
    myBtn->setText("myBtn");
    myBtn->setParent(this);
    myBtn->resize(80,40);
    myBtn->move(100,100);

}


MainWindow::~MainWindow()
{

}
