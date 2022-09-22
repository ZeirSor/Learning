#include "widget.h"
#include "ui_widget.h"

Widget::Widget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::Widget)
{
    ui->setupUi(this);

    //树控件使用
    
    //设置水平头
    ui->treeWidget->setHeaderLabels(QStringList() << "hero" << " introduction");

    QTreeWidgetItem* item = new QTreeWidgetItem(QStringList() << "force");
    QTreeWidgetItem* item2 = new QTreeWidgetItem(QStringList() << "mj");
    QTreeWidgetItem* item3 = new QTreeWidgetItem(QStringList() << "zl");
    //加载顶层节点
    ui->treeWidget->addTopLevelItem(item);
    ui->treeWidget->addTopLevelItem(item2);
    ui->treeWidget->addTopLevelItem(item3);

    //添加子节点
    QStringList h1;
    h1 << "123" << "456" ;
    QTreeWidgetItem *l1 = new QTreeWidgetItem(h1);
    item->addChild((l1));
}

Widget::~Widget()
{
    delete ui;
}
