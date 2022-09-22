/********************************************************************************
** Form generated from reading UI file 'mainwindow.ui'
**
** Created by: Qt User Interface Compiler version 5.9.1
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MAINWINDOW_H
#define UI_MAINWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenu>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QToolBar>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>
#include <graphicsview.h>

QT_BEGIN_NAMESPACE

class Ui_MainWindow
{
public:
    QAction *doOpen;
    QAction *doClose;
    QAction *doSave;
    QAction *doSave_As;
    QAction *doExit;
    QAction *doAbout;
    QAction *doRestore;
    QAction *doZoom;
    QAction *doGrayscale;
    QAction *doWarm;
    QAction *doCool;
    QAction *doMovie_frame;
    QAction *doClassic_frame;
    QAction *doFlower_frame;
    QAction *doBrightness;
    QAction *doHorizontal;
    QAction *doVertical;
    QAction *doSimple;
    QAction *doGauss;
    QAction *doMeida_Filter;
    QAction *doLaplace;
    QAction *doBinaryzation;
    QAction *doContour_extraction;
    QAction *doDilate;
    QAction *doExpansion;
    QAction *doOpening;
    QAction *doClosing;
    QAction *doRotate;
    QAction *do_adjust;
    QAction *do_adjust_left;
    QAction *do_adjust_right;
    QAction *doRotate_left;
    QAction *doRotate_right;
    QWidget *centralwidget;
    QVBoxLayout *verticalLayout_2;
    QVBoxLayout *verticalLayout;
    QHBoxLayout *horizontalLayout;
    GraphicsView *leftGraphicsView;
    GraphicsView *rightGraphicsView;
    QStatusBar *statusBar;
    QMenuBar *menuBar;
    QMenu *menuFile;
    QMenu *menuEdit;
    QMenu *menuHelp;
    QMenu *menuGeometric;
    QMenu *menuFlip;
    QMenu *menuArtistic_Effect;
    QMenu *menuFrame;
    QMenu *menuTemperature;
    QMenu *menu_mh;
    QMenu *menu_zq;
    QMenu *menu_ts;
    QToolBar *toolBar_File;
    QToolBar *toolBar_Edit;
    QToolBar *toolBar_Change;
    QToolBar *toolBar_Special;
    QToolBar *toolBar_Cal;
    QToolBar *toolBar_About;

    void setupUi(QMainWindow *MainWindow)
    {
        if (MainWindow->objectName().isEmpty())
            MainWindow->setObjectName(QStringLiteral("MainWindow"));
        MainWindow->resize(1400, 800);
        QIcon icon;
        icon.addFile(QStringLiteral(":/img/SimpleImage.svg"), QSize(), QIcon::Normal, QIcon::Off);
        MainWindow->setWindowIcon(icon);
        doOpen = new QAction(MainWindow);
        doOpen->setObjectName(QStringLiteral("doOpen"));
        QIcon icon1;
        icon1.addFile(QStringLiteral(":/img/doOpen.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doOpen->setIcon(icon1);
        doClose = new QAction(MainWindow);
        doClose->setObjectName(QStringLiteral("doClose"));
        QIcon icon2;
        icon2.addFile(QStringLiteral(":/img/doClose.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doClose->setIcon(icon2);
        doSave = new QAction(MainWindow);
        doSave->setObjectName(QStringLiteral("doSave"));
        QIcon icon3;
        icon3.addFile(QStringLiteral(":/img/doSave.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doSave->setIcon(icon3);
        doSave_As = new QAction(MainWindow);
        doSave_As->setObjectName(QStringLiteral("doSave_As"));
        QIcon icon4;
        icon4.addFile(QStringLiteral(":/img/doSave_As.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doSave_As->setIcon(icon4);
        doExit = new QAction(MainWindow);
        doExit->setObjectName(QStringLiteral("doExit"));
        QIcon icon5;
        icon5.addFile(QStringLiteral(":/img/doExit.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doExit->setIcon(icon5);
        doAbout = new QAction(MainWindow);
        doAbout->setObjectName(QStringLiteral("doAbout"));
        QIcon icon6;
        icon6.addFile(QStringLiteral(":/img/doAbout.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doAbout->setIcon(icon6);
        doRestore = new QAction(MainWindow);
        doRestore->setObjectName(QStringLiteral("doRestore"));
        QIcon icon7;
        icon7.addFile(QStringLiteral(":/img/doRestore.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doRestore->setIcon(icon7);
        doZoom = new QAction(MainWindow);
        doZoom->setObjectName(QStringLiteral("doZoom"));
        QIcon icon8;
        icon8.addFile(QStringLiteral(":/img/doZoom.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doZoom->setIcon(icon8);
        doGrayscale = new QAction(MainWindow);
        doGrayscale->setObjectName(QStringLiteral("doGrayscale"));
        QIcon icon9;
        icon9.addFile(QStringLiteral(":/img/doGrayscale.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doGrayscale->setIcon(icon9);
        doWarm = new QAction(MainWindow);
        doWarm->setObjectName(QStringLiteral("doWarm"));
        QIcon icon10;
        icon10.addFile(QStringLiteral(":/img/doWarm.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doWarm->setIcon(icon10);
        doCool = new QAction(MainWindow);
        doCool->setObjectName(QStringLiteral("doCool"));
        QIcon icon11;
        icon11.addFile(QStringLiteral(":/img/doCool.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doCool->setIcon(icon11);
        doMovie_frame = new QAction(MainWindow);
        doMovie_frame->setObjectName(QStringLiteral("doMovie_frame"));
        QIcon icon12;
        icon12.addFile(QStringLiteral(":/img/doMovie_frame.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doMovie_frame->setIcon(icon12);
        doClassic_frame = new QAction(MainWindow);
        doClassic_frame->setObjectName(QStringLiteral("doClassic_frame"));
        QIcon icon13;
        icon13.addFile(QStringLiteral(":/img/doClassic_frame.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doClassic_frame->setIcon(icon13);
        doFlower_frame = new QAction(MainWindow);
        doFlower_frame->setObjectName(QStringLiteral("doFlower_frame"));
        QIcon icon14;
        icon14.addFile(QStringLiteral(":/img/doFlower_frame.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doFlower_frame->setIcon(icon14);
        doBrightness = new QAction(MainWindow);
        doBrightness->setObjectName(QStringLiteral("doBrightness"));
        QIcon icon15;
        icon15.addFile(QStringLiteral(":/img/doBrightness.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doBrightness->setIcon(icon15);
        doHorizontal = new QAction(MainWindow);
        doHorizontal->setObjectName(QStringLiteral("doHorizontal"));
        QIcon icon16;
        icon16.addFile(QStringLiteral(":/img/doHorizontal.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doHorizontal->setIcon(icon16);
        doVertical = new QAction(MainWindow);
        doVertical->setObjectName(QStringLiteral("doVertical"));
        QIcon icon17;
        icon17.addFile(QStringLiteral(":/img/doVertical.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doVertical->setIcon(icon17);
        doSimple = new QAction(MainWindow);
        doSimple->setObjectName(QStringLiteral("doSimple"));
        QIcon icon18;
        icon18.addFile(QStringLiteral(":/img/doSimple.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doSimple->setIcon(icon18);
        doGauss = new QAction(MainWindow);
        doGauss->setObjectName(QStringLiteral("doGauss"));
        QIcon icon19;
        icon19.addFile(QStringLiteral(":/img/doGauss.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doGauss->setIcon(icon19);
        doMeida_Filter = new QAction(MainWindow);
        doMeida_Filter->setObjectName(QStringLiteral("doMeida_Filter"));
        QIcon icon20;
        icon20.addFile(QStringLiteral(":/img/doMeida_Filter.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doMeida_Filter->setIcon(icon20);
        doLaplace = new QAction(MainWindow);
        doLaplace->setObjectName(QStringLiteral("doLaplace"));
        QIcon icon21;
        icon21.addFile(QStringLiteral(":/img/doLaplace.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doLaplace->setIcon(icon21);
        doBinaryzation = new QAction(MainWindow);
        doBinaryzation->setObjectName(QStringLiteral("doBinaryzation"));
        QIcon icon22;
        icon22.addFile(QStringLiteral(":/img/doBinaryzation.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doBinaryzation->setIcon(icon22);
        doContour_extraction = new QAction(MainWindow);
        doContour_extraction->setObjectName(QStringLiteral("doContour_extraction"));
        QIcon icon23;
        icon23.addFile(QStringLiteral(":/img/doContour_extraction.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doContour_extraction->setIcon(icon23);
        doDilate = new QAction(MainWindow);
        doDilate->setObjectName(QStringLiteral("doDilate"));
        QIcon icon24;
        icon24.addFile(QStringLiteral(":/img/doDilate.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doDilate->setIcon(icon24);
        doExpansion = new QAction(MainWindow);
        doExpansion->setObjectName(QStringLiteral("doExpansion"));
        QIcon icon25;
        icon25.addFile(QStringLiteral(":/img/doExpansion.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doExpansion->setIcon(icon25);
        doOpening = new QAction(MainWindow);
        doOpening->setObjectName(QStringLiteral("doOpening"));
        QIcon icon26;
        icon26.addFile(QStringLiteral(":/img/doOpening.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doOpening->setIcon(icon26);
        doClosing = new QAction(MainWindow);
        doClosing->setObjectName(QStringLiteral("doClosing"));
        QIcon icon27;
        icon27.addFile(QStringLiteral(":/img/doClosing.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doClosing->setIcon(icon27);
        doRotate = new QAction(MainWindow);
        doRotate->setObjectName(QStringLiteral("doRotate"));
        QIcon icon28;
        icon28.addFile(QStringLiteral(":/img/doRotate.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doRotate->setIcon(icon28);
        do_adjust = new QAction(MainWindow);
        do_adjust->setObjectName(QStringLiteral("do_adjust"));
        QIcon icon29;
        icon29.addFile(QStringLiteral(":/img/do_adjust.svg"), QSize(), QIcon::Normal, QIcon::Off);
        do_adjust->setIcon(icon29);
        do_adjust_left = new QAction(MainWindow);
        do_adjust_left->setObjectName(QStringLiteral("do_adjust_left"));
        QIcon icon30;
        icon30.addFile(QStringLiteral(":/img/do_adjust_left.svg"), QSize(), QIcon::Normal, QIcon::Off);
        do_adjust_left->setIcon(icon30);
        do_adjust_right = new QAction(MainWindow);
        do_adjust_right->setObjectName(QStringLiteral("do_adjust_right"));
        QIcon icon31;
        icon31.addFile(QStringLiteral(":/img/do_adjust_right.svg"), QSize(), QIcon::Normal, QIcon::Off);
        do_adjust_right->setIcon(icon31);
        doRotate_left = new QAction(MainWindow);
        doRotate_left->setObjectName(QStringLiteral("doRotate_left"));
        QIcon icon32;
        icon32.addFile(QStringLiteral(":/img/doRotate_left.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doRotate_left->setIcon(icon32);
        doRotate_right = new QAction(MainWindow);
        doRotate_right->setObjectName(QStringLiteral("doRotate_right"));
        QIcon icon33;
        icon33.addFile(QStringLiteral(":/img/doRotate_right.svg"), QSize(), QIcon::Normal, QIcon::Off);
        doRotate_right->setIcon(icon33);
        centralwidget = new QWidget(MainWindow);
        centralwidget->setObjectName(QStringLiteral("centralwidget"));
        verticalLayout_2 = new QVBoxLayout(centralwidget);
        verticalLayout_2->setSpacing(6);
        verticalLayout_2->setContentsMargins(11, 11, 11, 11);
        verticalLayout_2->setObjectName(QStringLiteral("verticalLayout_2"));
        verticalLayout = new QVBoxLayout();
        verticalLayout->setSpacing(6);
        verticalLayout->setObjectName(QStringLiteral("verticalLayout"));
        horizontalLayout = new QHBoxLayout();
        horizontalLayout->setSpacing(6);
        horizontalLayout->setObjectName(QStringLiteral("horizontalLayout"));
        leftGraphicsView = new GraphicsView(centralwidget);
        leftGraphicsView->setObjectName(QStringLiteral("leftGraphicsView"));

        horizontalLayout->addWidget(leftGraphicsView);

        rightGraphicsView = new GraphicsView(centralwidget);
        rightGraphicsView->setObjectName(QStringLiteral("rightGraphicsView"));

        horizontalLayout->addWidget(rightGraphicsView);


        verticalLayout->addLayout(horizontalLayout);


        verticalLayout_2->addLayout(verticalLayout);

        MainWindow->setCentralWidget(centralwidget);
        statusBar = new QStatusBar(MainWindow);
        statusBar->setObjectName(QStringLiteral("statusBar"));
        MainWindow->setStatusBar(statusBar);
        menuBar = new QMenuBar(MainWindow);
        menuBar->setObjectName(QStringLiteral("menuBar"));
        menuBar->setGeometry(QRect(0, 0, 1400, 26));
        menuFile = new QMenu(menuBar);
        menuFile->setObjectName(QStringLiteral("menuFile"));
        menuEdit = new QMenu(menuBar);
        menuEdit->setObjectName(QStringLiteral("menuEdit"));
        menuHelp = new QMenu(menuBar);
        menuHelp->setObjectName(QStringLiteral("menuHelp"));
        menuGeometric = new QMenu(menuBar);
        menuGeometric->setObjectName(QStringLiteral("menuGeometric"));
        menuFlip = new QMenu(menuGeometric);
        menuFlip->setObjectName(QStringLiteral("menuFlip"));
        menuArtistic_Effect = new QMenu(menuBar);
        menuArtistic_Effect->setObjectName(QStringLiteral("menuArtistic_Effect"));
        menuFrame = new QMenu(menuArtistic_Effect);
        menuFrame->setObjectName(QStringLiteral("menuFrame"));
        menuTemperature = new QMenu(menuArtistic_Effect);
        menuTemperature->setObjectName(QStringLiteral("menuTemperature"));
        QIcon icon34;
        icon34.addFile(QStringLiteral(":/img/src/temperature_72px.png"), QSize(), QIcon::Normal, QIcon::Off);
        menuTemperature->setIcon(icon34);
        menu_mh = new QMenu(menuBar);
        menu_mh->setObjectName(QStringLiteral("menu_mh"));
        menu_zq = new QMenu(menuBar);
        menu_zq->setObjectName(QStringLiteral("menu_zq"));
        menu_ts = new QMenu(menuBar);
        menu_ts->setObjectName(QStringLiteral("menu_ts"));
        MainWindow->setMenuBar(menuBar);
        toolBar_File = new QToolBar(MainWindow);
        toolBar_File->setObjectName(QStringLiteral("toolBar_File"));
        MainWindow->addToolBar(Qt::TopToolBarArea, toolBar_File);
        toolBar_Edit = new QToolBar(MainWindow);
        toolBar_Edit->setObjectName(QStringLiteral("toolBar_Edit"));
        MainWindow->addToolBar(Qt::TopToolBarArea, toolBar_Edit);
        toolBar_Change = new QToolBar(MainWindow);
        toolBar_Change->setObjectName(QStringLiteral("toolBar_Change"));
        MainWindow->addToolBar(Qt::TopToolBarArea, toolBar_Change);
        toolBar_Special = new QToolBar(MainWindow);
        toolBar_Special->setObjectName(QStringLiteral("toolBar_Special"));
        MainWindow->addToolBar(Qt::TopToolBarArea, toolBar_Special);
        toolBar_Cal = new QToolBar(MainWindow);
        toolBar_Cal->setObjectName(QStringLiteral("toolBar_Cal"));
        MainWindow->addToolBar(Qt::TopToolBarArea, toolBar_Cal);
        toolBar_About = new QToolBar(MainWindow);
        toolBar_About->setObjectName(QStringLiteral("toolBar_About"));
        MainWindow->addToolBar(Qt::TopToolBarArea, toolBar_About);

        menuBar->addAction(menuFile->menuAction());
        menuBar->addAction(menuEdit->menuAction());
        menuBar->addAction(menuGeometric->menuAction());
        menuBar->addAction(menuArtistic_Effect->menuAction());
        menuBar->addAction(menu_mh->menuAction());
        menuBar->addAction(menu_zq->menuAction());
        menuBar->addAction(menu_ts->menuAction());
        menuBar->addAction(menuHelp->menuAction());
        menuFile->addAction(doOpen);
        menuFile->addAction(doClose);
        menuFile->addAction(doSave);
        menuFile->addAction(doSave_As);
        menuFile->addSeparator();
        menuFile->addAction(doExit);
        menuEdit->addAction(doRestore);
        menuEdit->addAction(do_adjust);
        menuEdit->addAction(do_adjust_left);
        menuEdit->addAction(do_adjust_right);
        menuHelp->addAction(doAbout);
        menuGeometric->addAction(doZoom);
        menuGeometric->addAction(menuFlip->menuAction());
        menuGeometric->addAction(doRotate);
        menuGeometric->addAction(doRotate_left);
        menuGeometric->addAction(doRotate_right);
        menuFlip->addAction(doHorizontal);
        menuFlip->addAction(doVertical);
        menuArtistic_Effect->addAction(doBrightness);
        menuArtistic_Effect->addAction(menuFrame->menuAction());
        menuArtistic_Effect->addAction(menuTemperature->menuAction());
        menuArtistic_Effect->addSeparator();
        menuFrame->addAction(doMovie_frame);
        menuFrame->addAction(doClassic_frame);
        menuFrame->addAction(doFlower_frame);
        menuTemperature->addAction(doCool);
        menuTemperature->addAction(doWarm);
        menu_mh->addAction(doSimple);
        menu_mh->addAction(doGauss);
        menu_zq->addAction(doMeida_Filter);
        menu_zq->addAction(doLaplace);
        menu_ts->addAction(doGrayscale);
        menu_ts->addAction(doContour_extraction);
        menu_ts->addAction(doBinaryzation);
        menu_ts->addAction(doDilate);
        menu_ts->addAction(doExpansion);
        menu_ts->addAction(doOpening);
        menu_ts->addAction(doClosing);

        retranslateUi(MainWindow);

        QMetaObject::connectSlotsByName(MainWindow);
    } // setupUi

    void retranslateUi(QMainWindow *MainWindow)
    {
        MainWindow->setWindowTitle(QApplication::translate("MainWindow", "ImageQt", Q_NULLPTR));
        doOpen->setText(QApplication::translate("MainWindow", "\346\211\223\345\274\200(&O)", Q_NULLPTR));
#ifndef QT_NO_TOOLTIP
        doOpen->setToolTip(QApplication::translate("MainWindow", "\346\211\223\345\274\200\344\270\200\345\274\240\345\233\276\347\211\207", Q_NULLPTR));
#endif // QT_NO_TOOLTIP
#ifndef QT_NO_SHORTCUT
        doOpen->setShortcut(QApplication::translate("MainWindow", "Ctrl+O", Q_NULLPTR));
#endif // QT_NO_SHORTCUT
        doClose->setText(QApplication::translate("MainWindow", "\345\205\263\351\227\255\345\233\276\347\211\207(&W)", Q_NULLPTR));
#ifndef QT_NO_SHORTCUT
        doClose->setShortcut(QApplication::translate("MainWindow", "Ctrl+W", Q_NULLPTR));
#endif // QT_NO_SHORTCUT
        doSave->setText(QApplication::translate("MainWindow", "\344\277\235\345\255\230(&S)", Q_NULLPTR));
#ifndef QT_NO_SHORTCUT
        doSave->setShortcut(QApplication::translate("MainWindow", "Ctrl+S", Q_NULLPTR));
#endif // QT_NO_SHORTCUT
        doSave_As->setText(QApplication::translate("MainWindow", "\345\217\246\345\255\230\344\270\272(F12)", Q_NULLPTR));
#ifndef QT_NO_SHORTCUT
        doSave_As->setShortcut(QApplication::translate("MainWindow", "F12", Q_NULLPTR));
#endif // QT_NO_SHORTCUT
        doExit->setText(QApplication::translate("MainWindow", "\351\200\200\345\207\272(&Q)", Q_NULLPTR));
#ifndef QT_NO_SHORTCUT
        doExit->setShortcut(QApplication::translate("MainWindow", "Ctrl+Q", Q_NULLPTR));
#endif // QT_NO_SHORTCUT
        doAbout->setText(QApplication::translate("MainWindow", "\345\205\263\344\272\216(F1)", Q_NULLPTR));
#ifndef QT_NO_SHORTCUT
        doAbout->setShortcut(QApplication::translate("MainWindow", "F1", Q_NULLPTR));
#endif // QT_NO_SHORTCUT
        doRestore->setText(QApplication::translate("MainWindow", "\346\201\242\345\244\215(&Z)", Q_NULLPTR));
#ifndef QT_NO_SHORTCUT
        doRestore->setShortcut(QApplication::translate("MainWindow", "Ctrl+Z", Q_NULLPTR));
#endif // QT_NO_SHORTCUT
        doZoom->setText(QApplication::translate("MainWindow", "\347\274\251\346\224\276(&+)", Q_NULLPTR));
#ifndef QT_NO_SHORTCUT
        doZoom->setShortcut(QApplication::translate("MainWindow", "Ctrl+-", Q_NULLPTR));
#endif // QT_NO_SHORTCUT
        doGrayscale->setText(QApplication::translate("MainWindow", "\347\201\260\345\272\246", Q_NULLPTR));
        doWarm->setText(QApplication::translate("MainWindow", "Warm", Q_NULLPTR));
        doCool->setText(QApplication::translate("MainWindow", "Cool", Q_NULLPTR));
        doMovie_frame->setText(QApplication::translate("MainWindow", "\347\224\265\345\275\261\347\233\270\346\241\206", Q_NULLPTR));
        doClassic_frame->setText(QApplication::translate("MainWindow", "\347\273\217\345\205\270\347\233\270\346\241\206", Q_NULLPTR));
        doFlower_frame->setText(QApplication::translate("MainWindow", "\345\260\217\350\212\261\347\233\270\346\241\206", Q_NULLPTR));
        doBrightness->setText(QApplication::translate("MainWindow", "\344\272\256\345\272\246", Q_NULLPTR));
        doHorizontal->setText(QApplication::translate("MainWindow", "\346\260\264\345\271\263\347\277\273\350\275\254", Q_NULLPTR));
        doVertical->setText(QApplication::translate("MainWindow", "\345\236\202\347\233\264\347\277\273\350\275\254", Q_NULLPTR));
        doSimple->setText(QApplication::translate("MainWindow", "\347\256\200\345\215\225\346\250\241\347\263\212", Q_NULLPTR));
        doGauss->setText(QApplication::translate("MainWindow", "\351\253\230\346\226\257\346\250\241\347\263\212", Q_NULLPTR));
        doMeida_Filter->setText(QApplication::translate("MainWindow", "\344\270\255\345\200\274\346\273\244\346\263\242", Q_NULLPTR));
        doLaplace->setText(QApplication::translate("MainWindow", "\346\213\211\346\231\256\346\213\211\346\226\257\351\224\220\345\214\226", Q_NULLPTR));
        doBinaryzation->setText(QApplication::translate("MainWindow", "\344\272\214\345\200\274\345\214\226", Q_NULLPTR));
        doContour_extraction->setText(QApplication::translate("MainWindow", "\350\275\256\345\273\223\346\217\220\345\217\226", Q_NULLPTR));
        doDilate->setText(QApplication::translate("MainWindow", "\350\205\220\350\232\200", Q_NULLPTR));
        doExpansion->setText(QApplication::translate("MainWindow", "\350\206\250\350\203\200", Q_NULLPTR));
        doOpening->setText(QApplication::translate("MainWindow", "\345\274\200\350\277\220\347\256\227", Q_NULLPTR));
        doClosing->setText(QApplication::translate("MainWindow", "\351\227\255\350\277\220\347\256\227", Q_NULLPTR));
        doRotate->setText(QApplication::translate("MainWindow", "\346\227\213\350\275\254", Q_NULLPTR));
        do_adjust->setText(QApplication::translate("MainWindow", "\351\200\202\345\272\224\345\261\217\345\271\225(&D)", Q_NULLPTR));
#ifndef QT_NO_SHORTCUT
        do_adjust->setShortcut(QApplication::translate("MainWindow", "Ctrl+D", Q_NULLPTR));
#endif // QT_NO_SHORTCUT
        do_adjust_left->setText(QApplication::translate("MainWindow", "\345\267\246\345\233\276\351\200\202\345\272\224(&L)", Q_NULLPTR));
#ifndef QT_NO_SHORTCUT
        do_adjust_left->setShortcut(QApplication::translate("MainWindow", "Ctrl+Left", Q_NULLPTR));
#endif // QT_NO_SHORTCUT
        do_adjust_right->setText(QApplication::translate("MainWindow", "\345\217\263\345\233\276\351\200\202\345\272\224(&R)", Q_NULLPTR));
#ifndef QT_NO_SHORTCUT
        do_adjust_right->setShortcut(QApplication::translate("MainWindow", "Ctrl+Right", Q_NULLPTR));
#endif // QT_NO_SHORTCUT
        doRotate_left->setText(QApplication::translate("MainWindow", "\351\200\206\346\227\266\351\222\210\346\227\213\350\275\254(&L)", Q_NULLPTR));
#ifndef QT_NO_TOOLTIP
        doRotate_left->setToolTip(QApplication::translate("MainWindow", "\351\200\206\346\227\266\351\222\210\346\227\213\350\275\254", Q_NULLPTR));
#endif // QT_NO_TOOLTIP
#ifndef QT_NO_SHORTCUT
        doRotate_left->setShortcut(QApplication::translate("MainWindow", "Ctrl+L", Q_NULLPTR));
#endif // QT_NO_SHORTCUT
        doRotate_right->setText(QApplication::translate("MainWindow", "\351\241\272\346\227\266\351\222\210\346\227\213\350\275\254(&R)", Q_NULLPTR));
#ifndef QT_NO_TOOLTIP
        doRotate_right->setToolTip(QApplication::translate("MainWindow", "\351\241\272\346\227\266\351\222\210\346\227\213\350\275\254", Q_NULLPTR));
#endif // QT_NO_TOOLTIP
#ifndef QT_NO_SHORTCUT
        doRotate_right->setShortcut(QApplication::translate("MainWindow", "Ctrl+R", Q_NULLPTR));
#endif // QT_NO_SHORTCUT
        menuFile->setTitle(QApplication::translate("MainWindow", "\346\226\207\344\273\266(&F)", Q_NULLPTR));
        menuEdit->setTitle(QApplication::translate("MainWindow", "\347\274\226\350\276\221", Q_NULLPTR));
        menuHelp->setTitle(QApplication::translate("MainWindow", "\345\270\256\345\212\251", Q_NULLPTR));
        menuGeometric->setTitle(QApplication::translate("MainWindow", "\345\217\230\346\215\242", Q_NULLPTR));
        menuFlip->setTitle(QApplication::translate("MainWindow", "\347\277\273\350\275\254\n"
"", Q_NULLPTR));
        menuArtistic_Effect->setTitle(QApplication::translate("MainWindow", "\346\225\210\346\236\234", Q_NULLPTR));
        menuFrame->setTitle(QApplication::translate("MainWindow", "\347\233\270\346\241\206", Q_NULLPTR));
        menuTemperature->setTitle(QApplication::translate("MainWindow", "\350\211\262\346\270\251", Q_NULLPTR));
        menu_mh->setTitle(QApplication::translate("MainWindow", "\346\250\241\347\263\212", Q_NULLPTR));
        menu_zq->setTitle(QApplication::translate("MainWindow", "\345\242\236\345\274\272", Q_NULLPTR));
        menu_ts->setTitle(QApplication::translate("MainWindow", "\347\211\271\346\256\212", Q_NULLPTR));
        toolBar_File->setWindowTitle(QApplication::translate("MainWindow", "\346\226\207\344\273\266", Q_NULLPTR));
        toolBar_Edit->setWindowTitle(QApplication::translate("MainWindow", "\345\217\230\345\271\273", Q_NULLPTR));
        toolBar_Change->setWindowTitle(QApplication::translate("MainWindow", "\347\263\273\346\225\260", Q_NULLPTR));
        toolBar_Special->setWindowTitle(QApplication::translate("MainWindow", "\347\211\271\346\256\212\345\244\204\347\220\206", Q_NULLPTR));
        toolBar_Cal->setWindowTitle(QApplication::translate("MainWindow", "\350\256\241\347\256\227", Q_NULLPTR));
        toolBar_About->setWindowTitle(QApplication::translate("MainWindow", "\345\205\263\344\272\216\345\222\214\351\200\200\345\207\272", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class MainWindow: public Ui_MainWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H
