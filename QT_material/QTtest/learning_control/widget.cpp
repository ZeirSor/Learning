#include "widget.h"
#include "ui_widget.h"
#include <QDebug>
#include <QListWidget>
#include <QStringList>

Widget::Widget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Widget)
{
    ui->setupUi(this);

    //设置单选默认选中
    ui->radioButton->setChecked(true);

    //监听选中
    connect(ui->radioButton_2, &QRadioButton::clicked, [=](){
        qDebug() << "select woman";
    });

    connect(ui->checkBox_4, &QCheckBox::stateChanged, [=](int state){
        qDebug() << state;  //2是选中 0未选中 （1是待选, 要在.ui点击tristate, 选中需要点两下
    });

    //利用listWidget写诗
    QListWidgetItem * item = new QListWidgetItem("锄禾日当午");
    ui->listWidget->addItem(item);
    item->setTextAlignment(Qt::AlignHCenter);

    QStringList list;
    list << "chu" << "he" << "ri" << "dang" << "wu";
    ui->listWidget->addItems(list);


}

Widget::~Widget()
{
    delete ui;
}
