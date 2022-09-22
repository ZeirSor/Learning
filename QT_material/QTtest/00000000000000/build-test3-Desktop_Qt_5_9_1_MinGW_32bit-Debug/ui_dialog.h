/********************************************************************************
** Form generated from reading UI file 'dialog.ui'
**
** Created by: Qt User Interface Compiler version 5.9.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_DIALOG_H
#define UI_DIALOG_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QCheckBox>
#include <QtWidgets/QDialog>
#include <QtWidgets/QGridLayout>
#include <QtWidgets/QGroupBox>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QPlainTextEdit>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QRadioButton>
#include <QtWidgets/QSpacerItem>
#include <QtWidgets/QVBoxLayout>

QT_BEGIN_NAMESPACE

class Ui_Dialog
{
public:
    QVBoxLayout *verticalLayout;
    QGroupBox *zitiYangShi;
    QGridLayout *gridLayout;
    QCheckBox *checkBox;
    QCheckBox *checkBox_2;
    QCheckBox *checkBox_4;
    QGroupBox *groupBox;
    QHBoxLayout *horizontalLayout;
    QPushButton *pushButton;
    QLabel *label_2;
    QLabel *label;
    QLineEdit *lineEdit;
    QGroupBox *zitiYanse;
    QHBoxLayout *horizontalLayout_2;
    QRadioButton *radioButton;
    QRadioButton *radioButton_2;
    QRadioButton *radioButton_3;
    QPlainTextEdit *plainTextEdit;
    QHBoxLayout *BtnFunction;
    QSpacerItem *horizontalSpacer;
    QPushButton *OK;
    QPushButton *cancel;
    QSpacerItem *horizontalSpacer_2;
    QPushButton *quit;

    void setupUi(QDialog *Dialog)
    {
        if (Dialog->objectName().isEmpty())
            Dialog->setObjectName(QStringLiteral("Dialog"));
        Dialog->resize(582, 189);
        verticalLayout = new QVBoxLayout(Dialog);
        verticalLayout->setSpacing(6);
        verticalLayout->setContentsMargins(11, 11, 11, 11);
        verticalLayout->setObjectName(QStringLiteral("verticalLayout"));
        zitiYangShi = new QGroupBox(Dialog);
        zitiYangShi->setObjectName(QStringLiteral("zitiYangShi"));
        gridLayout = new QGridLayout(zitiYangShi);
        gridLayout->setSpacing(6);
        gridLayout->setContentsMargins(11, 11, 11, 11);
        gridLayout->setObjectName(QStringLiteral("gridLayout"));
        checkBox = new QCheckBox(zitiYangShi);
        checkBox->setObjectName(QStringLiteral("checkBox"));

        gridLayout->addWidget(checkBox, 0, 0, 1, 1);

        checkBox_2 = new QCheckBox(zitiYangShi);
        checkBox_2->setObjectName(QStringLiteral("checkBox_2"));

        gridLayout->addWidget(checkBox_2, 0, 1, 1, 1);

        checkBox_4 = new QCheckBox(zitiYangShi);
        checkBox_4->setObjectName(QStringLiteral("checkBox_4"));

        gridLayout->addWidget(checkBox_4, 0, 2, 1, 1);


        verticalLayout->addWidget(zitiYangShi);

        groupBox = new QGroupBox(Dialog);
        groupBox->setObjectName(QStringLiteral("groupBox"));
        horizontalLayout = new QHBoxLayout(groupBox);
        horizontalLayout->setSpacing(6);
        horizontalLayout->setContentsMargins(11, 11, 11, 11);
        horizontalLayout->setObjectName(QStringLiteral("horizontalLayout"));
        pushButton = new QPushButton(groupBox);
        pushButton->setObjectName(QStringLiteral("pushButton"));

        horizontalLayout->addWidget(pushButton);

        label_2 = new QLabel(groupBox);
        label_2->setObjectName(QStringLiteral("label_2"));

        horizontalLayout->addWidget(label_2);

        label = new QLabel(groupBox);
        label->setObjectName(QStringLiteral("label"));

        horizontalLayout->addWidget(label);

        lineEdit = new QLineEdit(groupBox);
        lineEdit->setObjectName(QStringLiteral("lineEdit"));

        horizontalLayout->addWidget(lineEdit);


        verticalLayout->addWidget(groupBox);

        zitiYanse = new QGroupBox(Dialog);
        zitiYanse->setObjectName(QStringLiteral("zitiYanse"));
        horizontalLayout_2 = new QHBoxLayout(zitiYanse);
        horizontalLayout_2->setSpacing(6);
        horizontalLayout_2->setContentsMargins(11, 11, 11, 11);
        horizontalLayout_2->setObjectName(QStringLiteral("horizontalLayout_2"));
        radioButton = new QRadioButton(zitiYanse);
        radioButton->setObjectName(QStringLiteral("radioButton"));

        horizontalLayout_2->addWidget(radioButton);

        radioButton_2 = new QRadioButton(zitiYanse);
        radioButton_2->setObjectName(QStringLiteral("radioButton_2"));

        horizontalLayout_2->addWidget(radioButton_2);

        radioButton_3 = new QRadioButton(zitiYanse);
        radioButton_3->setObjectName(QStringLiteral("radioButton_3"));

        horizontalLayout_2->addWidget(radioButton_3);


        verticalLayout->addWidget(zitiYanse);

        plainTextEdit = new QPlainTextEdit(Dialog);
        plainTextEdit->setObjectName(QStringLiteral("plainTextEdit"));
        QFont font;
        font.setPointSize(15);
        plainTextEdit->setFont(font);

        verticalLayout->addWidget(plainTextEdit);

        BtnFunction = new QHBoxLayout();
        BtnFunction->setSpacing(6);
        BtnFunction->setObjectName(QStringLiteral("BtnFunction"));
        horizontalSpacer = new QSpacerItem(40, 20, QSizePolicy::Expanding, QSizePolicy::Minimum);

        BtnFunction->addItem(horizontalSpacer);

        OK = new QPushButton(Dialog);
        OK->setObjectName(QStringLiteral("OK"));

        BtnFunction->addWidget(OK);

        cancel = new QPushButton(Dialog);
        cancel->setObjectName(QStringLiteral("cancel"));

        BtnFunction->addWidget(cancel);

        horizontalSpacer_2 = new QSpacerItem(40, 20, QSizePolicy::Expanding, QSizePolicy::Minimum);

        BtnFunction->addItem(horizontalSpacer_2);

        quit = new QPushButton(Dialog);
        quit->setObjectName(QStringLiteral("quit"));

        BtnFunction->addWidget(quit);


        verticalLayout->addLayout(BtnFunction);


        retranslateUi(Dialog);
        QObject::connect(cancel, SIGNAL(clicked()), Dialog, SLOT(reject()));
        QObject::connect(OK, SIGNAL(clicked()), Dialog, SLOT(accept()));
        QObject::connect(quit, SIGNAL(clicked()), Dialog, SLOT(close()));

        QMetaObject::connectSlotsByName(Dialog);
    } // setupUi

    void retranslateUi(QDialog *Dialog)
    {
        Dialog->setWindowTitle(QApplication::translate("Dialog", "Dialog", Q_NULLPTR));
        zitiYangShi->setTitle(QApplication::translate("Dialog", "\345\255\227\344\275\223\346\240\267\345\274\217", Q_NULLPTR));
        checkBox->setText(QApplication::translate("Dialog", "underline", Q_NULLPTR));
        checkBox_2->setText(QApplication::translate("Dialog", "Italic", Q_NULLPTR));
        checkBox_4->setText(QApplication::translate("Dialog", "Bold", Q_NULLPTR));
        groupBox->setTitle(QApplication::translate("Dialog", "GroupBox", Q_NULLPTR));
        pushButton->setText(QApplication::translate("Dialog", "openimage", Q_NULLPTR));
        label_2->setText(QString());
        label->setText(QApplication::translate("Dialog", "file path", Q_NULLPTR));
        zitiYanse->setTitle(QApplication::translate("Dialog", "\345\255\227\344\275\223\351\242\234\350\211\262", Q_NULLPTR));
        radioButton->setText(QApplication::translate("Dialog", "Blue", Q_NULLPTR));
        radioButton_2->setText(QApplication::translate("Dialog", "Red", Q_NULLPTR));
        radioButton_3->setText(QApplication::translate("Dialog", "Black", Q_NULLPTR));
        plainTextEdit->setPlainText(QApplication::translate("Dialog", "Hello World!", Q_NULLPTR));
        OK->setText(QApplication::translate("Dialog", "\347\241\256\345\256\232", Q_NULLPTR));
        cancel->setText(QApplication::translate("Dialog", "\345\217\226\346\266\210", Q_NULLPTR));
        quit->setText(QApplication::translate("Dialog", "\351\200\200\345\207\272", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class Dialog: public Ui_Dialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_DIALOG_H
