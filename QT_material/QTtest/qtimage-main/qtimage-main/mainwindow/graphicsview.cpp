#include "graphicsview.h"
#include <QDebug>
//重写QGraphicsView实现图像的缩放

GraphicsView::GraphicsView(QWidget *parent) : QGraphicsView(parent)
{
}

GraphicsView::~GraphicsView()
{
}

//使得鼠标能够实现放大缩小
//void GraphicsView::wheelEvent(QWheelEvent *e)
//{
//    int distance = e->delta()/66;
//    double val;

//    if (distance != 0)
//    {
//        val = pow(1.2, distance);
//        this->scale(val, val);
//    }

////    qDebug() << "111";
////    qDebug() << "456";
//}

void GraphicsView::wheelEvent(QWheelEvent *event)
{
    // 获取鼠标滚轮的距离
    int wheelDeltaValue = event->delta();

    // 向上滚动，放大
    if (wheelDeltaValue > 0)
    {
        this->scale(1.2, 1.2);
    }

    // 向下滚动，缩小
    else
    {
        this->scale(1.0 / 1.2, 1.0 / 1.2);
    }
}
