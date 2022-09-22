#include "student.h"
#include <QDebug>

Student::Student(QObject *parent) : QObject(parent)
{

}

void Student::treat()
{
    qDebug() << "请老师吃饭";
}

void Student::treat(QString foodName)
{
    //先toUtf8() QbyteArray 再char * data() 去除双引号
    qDebug() << "请老师吃" << foodName.toUtf8().data();
}
