#include "dialog.h"
#include "ui_dialog.h"
#include <QPixmap>
#include <QImage>
#include <QPainter>

Dialog::Dialog(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::Dialog)
{
    ui->setupUi(this);
}

Dialog::~Dialog()
{
    delete ui;
}


void Dialog::on_checkBox_clicked(bool checked)
{
    QFont font = ui->plainTextEdit->font();
    font.setUnderline(checked);
    ui->plainTextEdit->setFont(font);
}

void Dialog::on_checkBox_2_clicked(bool checked)
{
    QFont font = ui->plainTextEdit->font();
    font.setItalic(checked);
    ui->plainTextEdit->setFont(font);
}

void Dialog::on_checkBox_4_clicked(bool checked)
{
    QFont font = ui->plainTextEdit->font();
    font.setBold(checked);
    ui->plainTextEdit->setFont(font);
}


void Dialog::paintEvent(QPaintEvent *)
{
    QPainter painter(this);
    QImage img;
    int nImageWidth = width() / 2;

    img.load("D:/Users/Cngsh/Desktop/QTtest/Image/8ec59982ded61774fd478b01443718a.png");

    painter.drawImage(nImageWidth,0,img);

}
