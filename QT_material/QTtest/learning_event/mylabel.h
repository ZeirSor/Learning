#ifndef MYLABEL_H
#define MYLABEL_H

#include <QWidget>
#include <QLabel>

class MyLabel : public QLabel
{
    Q_OBJECT
public:
    explicit MyLabel(QWidget *parent = nullptr);

    //鼠标进入事件
    void enterEvent(QEvent *event);
    //鼠标离开事件
    void leaveEvent(QEvent *event);

    //move
    void mouseMoveEvent(QMouseEvent *ev);

    //press
    void mousePressEvent(QMouseEvent *ev);

    //lease
    void mouseReleaseEvent(QMouseEvent *ev);

signals:

public slots:
};

#endif // MYLABEL_H
