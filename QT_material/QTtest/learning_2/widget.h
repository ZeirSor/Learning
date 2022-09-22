#ifndef WIDGET_H
#define WIDGET_H
#include <teacher.h>
#include <student.h>

#include <QWidget>

namespace Ui {
class Widget;
}

class Widget : public QWidget
{
    Q_OBJECT

public:
    explicit Widget(QWidget *parent = 0);
    ~Widget();

private:
    Ui::Widget *ui;
    Teacher *zt;
    Student *st;

    void classIsover();

};

#endif // WIDGET_H
