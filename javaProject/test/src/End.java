package src;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class De implements ActionListener {

    JFrame frame;
    JTextArea textArea1, textArea2, textArea3;
    JLabel label1, label2, label3;
    JButton button1, button2, button3;
    String str2, str3;

    public De(String title) {

        frame = new JFrame(title);
        frame.setSize(500, 500);

        textArea1 = new JTextArea(9, 40);
        textArea1.setLineWrap(true);
        JScrollPane scrollPane1 = new JScrollPane(textArea1);

        textArea2 = new JTextArea(9, 20);
        textArea2.setLineWrap(true);
        JScrollPane scrollPane2 = new JScrollPane(textArea2);

        textArea3 = new JTextArea(9, 20);
        textArea3.setLineWrap(true);
        JScrollPane scrollPane3 = new JScrollPane(textArea3);

        button1 = new JButton("显示队员");
        button2 = new JButton("开始组队");
        button3 = new JButton("保存名单");

        label1 = new JLabel("                            队员                          ");
        label2 = new JLabel("                          一队                        ");
        label3 = new JLabel("                         二队                           ");

        frame.add(label1);
        frame.add(scrollPane1);
        frame.add(label2);
        frame.add(label3);
        frame.add(scrollPane2);
        frame.add(scrollPane3);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            textArea1.setText("1. 张晓刚, 男\n2. 段立明, 男\n3. 王强, 男\n4. 赵思力, 男\n5. 孙晓龙, 男\n6. 李永刚, 男\n7. 戴海楠, 男\n8. 于永, 男\n9. 李敏, 女\n10. 钱海燕, 女\n11. 范晓萌, 女\n12. 李思涵, 女\n13. 王若琪, 女\n14. 耿萱然, 女\n15. 侯佳辰, 女\n16. 王路鑫, 女");

        }
        if (e.getSource() == button2) {
            String str[] = {
                    "1. 张晓刚, 男", "2. 段立明, 男", "3. 王强, 男", "4. 赵思力, 男", "5. 孙晓龙, 男", "6. 李永刚, 男",
                    "7. 戴海楠, 男", "8. 于永, 男", "9. 李敏, 女", "10. 钱海燕, 女", "11. 范晓萌, 女", "12. 李思涵, 女", "13. 王若琪, 女", "14. 耿萱然, 女",
                    "15. 侯佳辰, 女", "16. 王路鑫, 女"
            };

            boolean flag[] = new boolean[16];
//          用flag标记是否已经被组进队 初始没赋值为flase 表示还没被组进队
//            这里的flag是共享的 待会要用synchronized同步

            textArea2.setText(" ");
            textArea3.setText(" ");
            str2 = " ";
            str3 = " ";
            class Mythread implements Runnable {
//                传递一个textArea进来，方便setText
                private JTextArea textArea;
                Mythread(JTextArea textArea) {
                    this.textArea = textArea;
                }

                public void run() {
                    System.out.println("线程" + Thread.currentThread().getName() + "开始！");
//                    int count1 = 0;

                    int manCount = 0, womanCount = 0;
//                    要4男4女 用两个count变量数一下已经组进去几男几女

                    while (manCount < 4 || womanCount < 4) {
//                        4男
                        if (manCount < 4) {
                            int index = (int) (Math.random() * 8);
//                            下面这段要操作到共享的flag[] 所以用synchronized
                            synchronized (this) {
                                if (!flag[index]) {
                                    flag[index] = true;
//                                    这里setText 就是之前的getText再加上新选上的
                                    this.textArea.setText(this.textArea.getText() + str[index] + '\n');
                                    manCount ++;
                                }
                            }
                        }
//                        4女
                        if (womanCount < 4) {
                            int index = (int) (Math.random() * 8 + 8);
//                            下面这段要操作到共享的flag[] 所以用synchronized
                            synchronized (this) {
                                if (!flag[index]) {
                                    flag[index] = true;
                                    this.textArea.setText(this.textArea.getText() + str[index] + '\n');
                                    womanCount ++;
                                }
                            }
                        }
                    }
//                    for (int i = 0; i < 8; i++) {
//                        a[count1] = (int) (Math.random() * 16);
//                        for (int j = 0; j < count1; j++) {
//                            if (a[j] == a[count1]) {
//                                a[count1] = (int) (Math.random() * 8);
//                                j = 0;
//                            }
//                        }
////                        str2 += str[a[count1]] + "\n";
////                        count1++;
//                    }
//                    textArea2.setText(str2 + "\n");
                    System.out.println("线程"  + Thread.currentThread().getName() + "结束！");
                }
            }

            Thread t1 = new Thread(new Mythread(this.textArea2), "1");
            Thread t2 = new Thread(new Mythread(this.textArea3), "2");
            t1.start();
            t2.start();
        }
        if (e.getSource() == button3) {
            try {
                File f1 = new File("D:\\x1.txt");
                File f2 = new File("D:\\x2.txt");
                FileWriter fw1 = new FileWriter(f1);
                FileWriter fw2 = new FileWriter(f2);
                fw1.write(textArea2.getText());
                fw2.write(textArea3.getText());
                fw1.close();
                fw2.close();
                System.out.println("文件保存成功！");
            } catch (FileNotFoundException e2) {
                System.out.println("文件打开失败!");
            } catch (IOException e2) {
                e2.printStackTrace();
                System.out.println("文件输出失败！");
            }

        }

    }

}

public class End {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        De de = new De("羽毛球队员");
    }

}
