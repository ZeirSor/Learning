/********************************************************************************
** Form generated from reading UI file 'widget.ui'
**
** Created by: Qt User Interface Compiler version 5.9.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_WIDGET_H
#define UI_WIDGET_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QWidget>
#include <mywidget.h>

QT_BEGIN_NAMESPACE

class Ui_Widget
{
public:
    MyWidget *widget;
    MyWidget *widget_2;
    QPushButton *getValue;
    QPushButton *setHalf;

    void setupUi(QWidget *Widget)
    {
        if (Widget->objectName().isEmpty())
            Widget->setObjectName(QStringLiteral("Widget"));
        Widget->resize(400, 300);
        widget = new MyWidget(Widget);
        widget->setObjectName(QStringLiteral("widget"));
        widget->setGeometry(QRect(30, 20, 251, 51));
        widget_2 = new MyWidget(Widget);
        widget_2->setObjectName(QStringLiteral("widget_2"));
        widget_2->setGeometry(QRect(20, 140, 341, 121));
        getValue = new QPushButton(Widget);
        getValue->setObjectName(QStringLiteral("getValue"));
        getValue->setGeometry(QRect(70, 90, 91, 41));
        setHalf = new QPushButton(Widget);
        setHalf->setObjectName(QStringLiteral("setHalf"));
        setHalf->setGeometry(QRect(200, 90, 101, 41));

        retranslateUi(Widget);

        QMetaObject::connectSlotsByName(Widget);
    } // setupUi

    void retranslateUi(QWidget *Widget)
    {
        Widget->setWindowTitle(QApplication::translate("Widget", "Widget", Q_NULLPTR));
        getValue->setText(QApplication::translate("Widget", "getValue", Q_NULLPTR));
        setHalf->setText(QApplication::translate("Widget", "setHalf", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class Widget: public Ui_Widget {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_WIDGET_H
