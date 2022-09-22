/********************************************************************************
** Form generated from reading UI file 'gaussblurdialog.ui'
**
** Created by: Qt User Interface Compiler version 5.9.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_GAUSSBLURDIALOG_H
#define UI_GAUSSBLURDIALOG_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QDialog>
#include <QtWidgets/QDialogButtonBox>
#include <QtWidgets/QDoubleSpinBox>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QSpinBox>
#include <QtWidgets/QVBoxLayout>

QT_BEGIN_NAMESPACE

class Ui_GaussianBlurDialog
{
public:
    QHBoxLayout *horizontalLayout_3;
    QVBoxLayout *verticalLayout;
    QHBoxLayout *horizontalLayout_2;
    QLabel *labelradius;
    QSpinBox *radiusSpinBox;
    QHBoxLayout *horizontalLayout;
    QLabel *labelsigma;
    QDoubleSpinBox *sigmaSpinBox;
    QDialogButtonBox *buttonOK;

    void setupUi(QDialog *GaussianBlurDialog)
    {
        if (GaussianBlurDialog->objectName().isEmpty())
            GaussianBlurDialog->setObjectName(QStringLiteral("GaussianBlurDialog"));
        GaussianBlurDialog->resize(291, 85);
        QSizePolicy sizePolicy(QSizePolicy::Fixed, QSizePolicy::Fixed);
        sizePolicy.setHorizontalStretch(0);
        sizePolicy.setVerticalStretch(0);
        sizePolicy.setHeightForWidth(GaussianBlurDialog->sizePolicy().hasHeightForWidth());
        GaussianBlurDialog->setSizePolicy(sizePolicy);
        QIcon icon;
        icon.addFile(QStringLiteral(":/img/doGauss.svg"), QSize(), QIcon::Normal, QIcon::Off);
        GaussianBlurDialog->setWindowIcon(icon);
        horizontalLayout_3 = new QHBoxLayout(GaussianBlurDialog);
        horizontalLayout_3->setObjectName(QStringLiteral("horizontalLayout_3"));
        verticalLayout = new QVBoxLayout();
        verticalLayout->setObjectName(QStringLiteral("verticalLayout"));
        horizontalLayout_2 = new QHBoxLayout();
        horizontalLayout_2->setObjectName(QStringLiteral("horizontalLayout_2"));
        labelradius = new QLabel(GaussianBlurDialog);
        labelradius->setObjectName(QStringLiteral("labelradius"));

        horizontalLayout_2->addWidget(labelradius);

        radiusSpinBox = new QSpinBox(GaussianBlurDialog);
        radiusSpinBox->setObjectName(QStringLiteral("radiusSpinBox"));
        radiusSpinBox->setValue(3);

        horizontalLayout_2->addWidget(radiusSpinBox);


        verticalLayout->addLayout(horizontalLayout_2);

        horizontalLayout = new QHBoxLayout();
        horizontalLayout->setObjectName(QStringLiteral("horizontalLayout"));
        labelsigma = new QLabel(GaussianBlurDialog);
        labelsigma->setObjectName(QStringLiteral("labelsigma"));

        horizontalLayout->addWidget(labelsigma);

        sigmaSpinBox = new QDoubleSpinBox(GaussianBlurDialog);
        sigmaSpinBox->setObjectName(QStringLiteral("sigmaSpinBox"));
        sigmaSpinBox->setFocusPolicy(Qt::StrongFocus);
        sigmaSpinBox->setDecimals(4);
        sigmaSpinBox->setValue(1);

        horizontalLayout->addWidget(sigmaSpinBox);


        verticalLayout->addLayout(horizontalLayout);


        horizontalLayout_3->addLayout(verticalLayout);

        buttonOK = new QDialogButtonBox(GaussianBlurDialog);
        buttonOK->setObjectName(QStringLiteral("buttonOK"));
        buttonOK->setOrientation(Qt::Vertical);
        buttonOK->setStandardButtons(QDialogButtonBox::Cancel|QDialogButtonBox::Ok);

        horizontalLayout_3->addWidget(buttonOK);


        retranslateUi(GaussianBlurDialog);
        QObject::connect(buttonOK, SIGNAL(accepted()), GaussianBlurDialog, SLOT(accept()));
        QObject::connect(buttonOK, SIGNAL(rejected()), GaussianBlurDialog, SLOT(reject()));

        QMetaObject::connectSlotsByName(GaussianBlurDialog);
    } // setupUi

    void retranslateUi(QDialog *GaussianBlurDialog)
    {
        GaussianBlurDialog->setWindowTitle(QApplication::translate("GaussianBlurDialog", "\351\253\230\346\226\257\346\250\241\347\263\212", Q_NULLPTR));
        labelradius->setText(QApplication::translate("GaussianBlurDialog", "<html><head/><body><p><span style=\" font-size:11pt;\">\350\214\203\345\233\264 = </span></p></body></html>", Q_NULLPTR));
        labelsigma->setText(QApplication::translate("GaussianBlurDialog", "<html><head/><body><p><span style=\" font-size:11pt;\">\345\217\202\346\225\260\317\203= </span></p></body></html>", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class GaussianBlurDialog: public Ui_GaussianBlurDialog {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_GAUSSBLURDIALOG_H
