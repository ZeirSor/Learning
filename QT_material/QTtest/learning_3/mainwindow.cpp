#include "mainwindow.h"
#include <QMenuBar>
#include <QToolBar>
#include <QDebug>
#include <QPushButton>
#include <QStatusBar>
#include <QLabel>
#include <QDockWidget>
#include <QTextEdit>

MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
{
    //重置窗口大小
    setFixedSize(1200,800);

    //创建菜单栏 一个
    QMenuBar *bar = menuBar();
    //放入窗口
    setMenuBar(bar);

    //创建菜单
    QMenu * fileMenu = bar->addMenu("File");    //fileMenu->setFixedSize(40,20);
    QMenu * editMenu = bar->addMenu("Edit");
    QMenu * quitMenu = bar->addMenu("Quit");

    //创建菜单项
    QAction * newAction = fileMenu->addAction("New");
    //添加分隔符
    fileMenu->addSeparator();
    QAction * openAction = fileMenu->addAction("Open");


    //工具栏 多个
    QToolBar * toolBar = new QToolBar;
    //addToolBar(toolBar);
    addToolBar(Qt::LeftToolBarArea, toolBar);

    //只允许左右停靠
    toolBar->setAllowedAreas(Qt::LeftToolBarArea | Qt::RightToolBarArea);
    toolBar->setFloatable(false);
    //toolBar->setMovable(false);

    //工具栏内容
    toolBar->addAction(newAction);
    toolBar->addSeparator();
    toolBar->addAction(openAction);

    QPushButton* btn = new QPushButton("Quit", this);
    toolBar->addWidget(btn);

    //状态栏   一个
    QStatusBar * stBar = new QStatusBar();
    setStatusBar(stBar);
    //放标签控件 多个
    QLabel* label = new QLabel("提示信息: ", this);
    stBar->addWidget(label);

    QLabel* label2 = new QLabel("Right提示信息: ", this);
    stBar->addPermanentWidget(label2);

    //浮动窗口  多个
    QDockWidget * dw = new QDockWidget;
    addDockWidget(Qt::BottomDockWidgetArea, dw);
    dw->setAllowedAreas(Qt::TopDockWidgetArea | Qt::BottomDockWidgetArea);

    //设置中心部件 只能一个
    QTextEdit * te = new QTextEdit(this);
    setCentralWidget(te);


    //规律：只能一个用set  多个用add

}

MainWindow::~MainWindow()
{

}
