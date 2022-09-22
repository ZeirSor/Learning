#ifndef TEACHER_H
#define TEACHER_H

#include <QObject>

class Teacher : public QObject
{
    Q_OBJECT
public:
    explicit Teacher(QObject *parent = nullptr);

signals:
    //自定义信号
    //void 只声明 不实现
    void hungry();

    void hungry(QString foodName);
public slots:
};

#endif // TEACHER_H
