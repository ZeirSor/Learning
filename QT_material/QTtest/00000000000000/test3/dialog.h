#ifndef DIALOG_H
#define DIALOG_H

#include <QDialog>

namespace Ui {
class Dialog;
}

class Dialog : public QDialog
{
    Q_OBJECT

public:
    explicit Dialog(QWidget *parent = 0);
    ~Dialog();

private slots:
    void on_checkBox_clicked(bool checked);

    void on_checkBox_2_clicked(bool checked);

    void on_checkBox_4_clicked(bool checked);

    void on_pushButton_clicked();

private:
    void paintEvent(QPaintEvent *);

private:
    Ui::Dialog *ui;
};

#endif // DIALOG_H
