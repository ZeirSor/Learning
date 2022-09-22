#include "mylabel.h"
#include <QDebug>
#include <QString>
#include <QMouseEvent>

MyLabel::MyLabel(QWidget *parent) : QLabel(parent)
{

}

//鼠标进入事件
void MyLabel::enterEvent(QEvent *event)
{
    qDebug() << "mouse enter";
}

//鼠标离开事件
void MyLabel::leaveEvent(QEvent *event)
{
    qDebug() << "mouse leave";
}

//move
void MyLabel::mouseMoveEvent(QMouseEvent *ev)
{
    QString str = QString( "mouse move to x = %1, y = %2 " ).arg(ev->x()).arg(ev->y());
    qDebug() << str ;
}

//press
void MyLabel::mousePressEvent(QMouseEvent *ev)
{
    //leftButton press
    if(ev->button() == Qt::LeftButton)
    {
        QString str = QString( "mouse press at x = %1, y = %2 " ).arg(ev->x()).arg(ev->y());
        qDebug() << str ;
    }
}
//lease
void MyLabel::mouseReleaseEvent(QMouseEvent *ev)
{
    QString str = QString( "mouse release at x = %1, y = %2 " ).arg(ev->x()).arg(ev->y());
    qDebug() << str ;
}
