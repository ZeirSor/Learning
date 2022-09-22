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
    void on_textEdit_destroyed();

    void on_pushButton_clicked(bool checked);

    void on_zitiYangShi_clicked(bool checked);

private:
    Ui::Dialog *ui;
};

#endif // DIALOG_H
