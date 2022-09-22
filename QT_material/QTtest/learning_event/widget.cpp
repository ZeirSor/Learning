#include "widget.h"
#include "ui_widget.h"
#include <QTimer>

Widget::Widget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Widget)
{
    ui->setupUi(this);

    //启动计时器
    id1 = startTimer(1000);   //参数1 时间间隔(毫秒)
    id2 = startTimer(2000);

    //定时器2
    QTimer *ti = new QTimer(this);
    ti->start(500);
    connect(ti, &QTimer::timeout, [=](){
        static int s = 1;
        ui->label_3->setText(QString::number(s ++));
    });

    connect(ui->pushButton, &QPushButton::clicked, [=](){
       ti->stop();
    });

}

void Widget::timerEvent(QTimerEvent *ev)  //计时器
{
    if (ev->timerId() == id1) {
        static int s = 1;
        ui->label->setText(QString::number(s ++));
    }

    if (ev->timerId() == id2) {
        static int s2 = 1;
        ui->label_2->setText(QString::number(s2 ++));
    }
}
Widget::~Widget()
{
    delete ui;
}
