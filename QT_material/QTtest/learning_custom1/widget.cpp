#include "widget.h"
#include "ui_widget.h"
#include <QDebug>

Widget::Widget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Widget)
{
    ui->setupUi(this);

    //getNum
    connect(ui->getValue, &QPushButton::clicked, [=](){
        qDebug() << ui->widget->getNum();
    });

    //setNum
    connect(ui->setHalf, &QPushButton::clicked, [=](){
       ui->widget->setNum(50);
    });

}

Widget::~Widget()
{
    delete ui;
}
