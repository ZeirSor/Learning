#include "widget.h"
#include <QPushButton>

Widget::Widget(QWidget *parent)
    : QWidget(parent)
{
    QPushButton *btn = new QPushButton;
    btn->setParent(this);
    btn->setText("MyBtn");
    btn->show();

    //resize(1200,800);
    setFixedSize(2000, 1000);
    setWindowTitle("图像处理");

    QPushButton* btn2 = new QPushButton;
    btn2->setParent(this);
    btn2->setText("MyBtn2");
    btn2->move(100,100);
    btn2->setFixedSize(100,100);
    btn2->show();

    //connext(sent, signal, accept, handle);
    connect(btn, &QPushButton::clicked, this, &Widget::close);

}

Widget::~Widget()
{

}
