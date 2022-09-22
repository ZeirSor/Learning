#include "mywidget.h"
#include "ui_mywidget.h"

MyWidget::MyWidget(QWidget *parent) :
    QWidget(parent),
    ui(new Ui::MyWidget)
{
    ui->setupUi(this);

    //QSpinBox -- QSlider
    void(QSpinBox:: * spSignal ) (int) = &QSpinBox::valueChanged;   //函数重载，强制类型转换
    connect(ui->spinBox, spSignal, ui->horizontalSlider, &QSlider::setValue);

    //QSlider -- QSpinBox
    connect(ui->horizontalSlider, &QSlider::valueChanged, ui->spinBox, &QSpinBox::setValue);


}

void MyWidget::setNum(int num)
{
    ui->spinBox->setValue(num);
}

int MyWidget::getNum()
{
    return ui->spinBox->value();
}


MyWidget::~MyWidget()
{
    delete ui;
}

