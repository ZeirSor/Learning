#ifndef STUDENT_H
#define STUDENT_H

#include <QObject>

class Student : public QObject
{
    Q_OBJECT
public:
    explicit Student(QObject *parent = nullptr);

signals:

public slots:
    //void 声明+实现
    void treat();

    void treat(QString foodName);
};

#endif // STUDENT_H
