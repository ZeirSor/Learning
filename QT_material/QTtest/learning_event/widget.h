#ifndef WIDGET_H
#define WIDGET_H

#include <QWidget>
#include <QTimerEvent>

namespace Ui {
class Widget;
}

class Widget : public QWidget
{
    Q_OBJECT

public:
    explicit Widget(QWidget *parent = 0);
    ~Widget();

    void timerEvent(QTimerEvent *);  //计时器

    int id1;
    int id2;

private:
    Ui::Widget *ui;
};

#endif // WIDGET_H
