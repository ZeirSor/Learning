#include "mypushbutton.h"
#include <QDebug>

MyPushButton::MyPushButton(QWidget *parent) : QPushButton(parent)
{
    qDebug() << "my1";
}

MyPushButton::~MyPushButton()
{
    qDebug() << "my2";
}
