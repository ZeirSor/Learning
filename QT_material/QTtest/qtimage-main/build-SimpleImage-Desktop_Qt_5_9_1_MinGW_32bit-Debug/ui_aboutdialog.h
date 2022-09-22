/********************************************************************************
** Form generated from reading UI file 'aboutdialog.ui'
**
** Created by: Qt User Interface Compiler version 5.9.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_ABOUTDIALOG_H
#define UI_ABOUTDIALOG_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QPushButton>

QT_BEGIN_NAMESPACE

class Ui_AboutDialog
{
public:
    QLabel *label_Pic;
    QLabel *label_Text;
    QPushButton *pushButton;
    QPushButton *pushButton_2;
    QPushButton *pushButton_3;

    void setupUi(QDialog *AboutDialog)
    {
        if (AboutDialog->objectName().isEmpty())
            AboutDialog->setObjectName(QStringLiteral("AboutDialog"));
        AboutDialog->setEnabled(true);
        AboutDialog->resize(500, 350);
        AboutDialog->setMinimumSize(QSize(500, 350));
        AboutDialog->setMaximumSize(QSize(500, 350));
        QIcon icon;
        icon.addFile(QStringLiteral(":/img/SimpleImage.svg"), QSize(), QIcon::Normal, QIcon::Off);
        AboutDialog->setWindowIcon(icon);
        label_Pic = new QLabel(AboutDialog);
        label_Pic->setObjectName(QStringLiteral("label_Pic"));
        label_Pic->setGeometry(QRect(10, 10, 233, 233));
        label_Text = new QLabel(AboutDialog);
        label_Text->setObjectName(QStringLiteral("label_Text"));
        label_Text->setGeometry(QRect(10, 273, 233, 51));
        pushButton = new QPushButton(AboutDialog);
        pushButton->setObjectName(QStringLiteral("pushButton"));
        pushButton->setGeometry(QRect(320, 40, 150, 50));
        pushButton->setStyleSheet(QLatin1String("QPushButton\n"
"{\n"
"    border-image: url(:/img/ButtonNormal.png);\n"
"}\n"
"QPushButton:hover\n"
"{\n"
"    border-image: url(:/img/ButtonHover.png);\n"
"}\n"
"QPushButton:pressed\n"
"{\n"
"    border-image: url(:/img/ButtonPressed.png);\n"
"}\n"
""));
        pushButton_2 = new QPushButton(AboutDialog);
        pushButton_2->setObjectName(QStringLiteral("pushButton_2"));
        pushButton_2->setGeometry(QRect(320, 140, 150, 50));
        pushButton_2->setAutoFillBackground(false);
        pushButton_2->setStyleSheet(QLatin1String("QPushButton\n"
"{\n"
"    border-image: url(:/img/ButtonNormal.png);\n"
"}\n"
"QPushButton:hover\n"
"{\n"
"    border-image: url(:/img/ButtonHover.png);\n"
"}\n"
"QPushButton:pressed\n"
"{\n"
"    border-image: url(:/img/ButtonPressed.png);\n"
"}\n"
"color:rgb(18, 188, 255);\n"
""));
        pushButton_2->setCheckable(false);
        pushButton_3 = new QPushButton(AboutDialog);
        pushButton_3->setObjectName(QStringLiteral("pushButton_3"));
        pushButton_3->setGeometry(QRect(320, 240, 150, 50));
        pushButton_3->setStyleSheet(QLatin1String("QPushButton\n"
"{\n"
"    border-image: url(:/img/ButtonNormal.png);\n"
"}\n"
"QPushButton:hover\n"
"{\n"
"    border-image: url(:/img/ButtonHover.png);\n"
"}\n"
"QPushButton:pressed\n"
"{\n"
"    border-image: url(:/img/ButtonPressed.png);\n"
"}"));

        retranslateUi(AboutDialog);

        QMetaObject::connectSlotsByName(AboutDialog);
    } // setupUi

    void retranslateUi(QDialog *AboutDialog)
    {
        AboutDialog->setWindowTitle(QApplication::translate("AboutDialog", "\345\205\263\344\272\216-SimpleImage", Q_NULLPTR));
        label_Pic->setText(QApplication::translate("AboutDialog", "\345\233\276\347\211\207", Q_NULLPTR));
        label_Text->setText(QApplication::translate("AboutDialog", "Simple Image", Q_NULLPTR));
        pushButton->setText(QApplication::translate("AboutDialog", "\346\243\200\346\237\245\346\233\264\346\226\260", Q_NULLPTR));
        pushButton_2->setText(QApplication::translate("AboutDialog", "\346\212\200\346\234\257\346\224\257\346\214\201", Q_NULLPTR));
        pushButton_3->setText(QApplication::translate("AboutDialog", "\347\211\210\346\235\203\345\217\212\346\235\241\346\254\276", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class AboutDialog: public Ui_AboutDialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_ABOUTDIALOG_H
