#include "mainwindow.h"
#include "ui_mainwindow.h"
#include <QDir>

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    QLabel *lb = new QLabel(this);
    QImage ximage;

    QDir xdir(":/Image");
    QStringList xlist;
    xlist << "xpng";
    xdir.setNameFilters(xlist);
    int k = xdir.count();
    for(int i = 0; i < k; i ++ )
    {
        ximage = QImage(":/Image/"+xdir[i]);
    }
    lb->setPixmap(QPixmap::fromImage(ximage));
    lb->setGeometry(ximage.rect());
    lb->show();
}

MainWindow::~MainWindow()
{
    delete ui;
}
