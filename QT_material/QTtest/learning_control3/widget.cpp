#include "widget.h"
#include "ui_widget.h"

Widget::Widget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Widget)
{
    ui->setupUi(this);
    setFixedSize(1000,1000);
    //tableWidget
    //设置列数
    ui->tableWidget->setColumnCount(3);
    //设置水表头
    ui->tableWidget->setHorizontalHeaderLabels(QStringList() << "1" << "2" << "3");
    //设置行数
    ui->tableWidget->setRowCount(5);
    //设置正文
    ui->tableWidget->setItem(0,0,new QTableWidgetItem(QString("666")));

}

Widget::~Widget()
{
    delete ui;
}
