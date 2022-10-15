package com.ncepu.javaHomework13;

import org.w3c.dom.css.RGBColor;

import javax.imageio.plugins.tiff.FaxTIFFTagSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShoppingQuestionnaireFrame implements ActionListener {
    private JFrame frame = null;
    private JPanel fullPanel = null;

    private JPanel titlePanel = null;
    private JLabel titleLabel = new JLabel("双十一购物问卷调查");

    private JPanel tipsPanel = new JPanel(new FlowLayout());
    private JLabel tipsLabel = new JLabel("tips");

//    private JToolBar toolBar = new JToolBar("tips");

    private JPanel mainPanel = new JPanel();
    private JScrollPane mainPane = new JScrollPane();

//    private ContentPanel contentPanel_info = new ContentPanel("一、基本信息");

//    private ContentPanel contentPanel_ques = new ContentPanel("二、问卷内容");

//    private JPanel btnPanel = new JPanel();
//    private JButton submitButton = new JButton("提交");

    public ShoppingQuestionnaireFrame(String title) {

        frame = new JFrame(title);
        frame.setSize(450, 900);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        //添加背景面板
        fullPanel = new JPanel(new BorderLayout());
        fullPanel.setBackground(new Color(47, 47, 47));


        //添加标题面板
        titlePanel = new JPanel(new FlowLayout());
        titlePanel.setSize(450, 30);
        titlePanel.setOpaque(false);
        titlePanel.setBackground(Color.BLACK);
        titleLabel.setFont(new Font("黑体", Font.PLAIN, 20));
        titleLabel.setForeground(Color.WHITE);
        titlePanel.add(titleLabel);
        fullPanel.add(titlePanel, BorderLayout.NORTH);

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));


        mainPane.setOpaque(false);
        mainPane.getViewport().setOpaque(false);
        mainPane.setBorder(null);

        JLabel infoLabel = new JLabel("一、基本信息");
        infoLabel.setOpaque(false);
        infoLabel.setForeground(Color.WHITE);
        infoLabel.setFont(new Font("楷体", Font.PLAIN, 16));
        mainPanel.add(infoLabel);
        InfoPanel infoPanel_name = new InfoPanel("姓名");
        JPanel panel_gender = new JPanel();
        panel_gender.setLayout(new BoxLayout(panel_gender, BoxLayout.Y_AXIS));
        JLabel label_gender = new JLabel("性别");
        label_gender.setForeground(Color.WHITE);
        panel_gender.add(label_gender);
        panel_gender.setOpaque(false);

        InfoPanel infoPanel_age = new InfoPanel("年龄");
        InfoPanel infoPanel_grade = new InfoPanel("年级");
        mainPanel.add(infoPanel_name);
        mainPanel.add(panel_gender);
        mainPanel.add(infoPanel_age);
        mainPanel.add(infoPanel_grade);

        JLabel quesLabel = new JLabel("二、问卷内容");
        quesLabel.setOpaque(false);
        quesLabel.setForeground(Color.WHITE);
        quesLabel.setFont(new Font("楷体", Font.PLAIN, 16));
        mainPanel.add(quesLabel);
        QuesPanel quesPanel_wish = new QuesPanel("本次“双十一”是否会购物");
        QuesPanel quesPanel_interest = new QuesPanel("感兴趣的商品种类有哪些");
        QuesPanel quesPanel_budget = new QuesPanel("预算范围");
        QuesPanel quesPanel_purpose = new QuesPanel("购物的目的");
        mainPanel.add(quesPanel_wish);
        mainPanel.add(quesPanel_interest);
        mainPanel.add(quesPanel_budget);
        mainPanel.add(quesPanel_purpose);


//        mainPanel.add(mainPane);
        fullPanel.add(mainPanel, BorderLayout.CENTER);
//        contentPanel_info.setLayout(new FlowLayout(FlowLayout.LEFT));
//        contentPanel_info.add(new InfoPanel("姓名"));

//
//        mainPanel.setOpaque(false);
//        mainPanel.add(contentPanel_info, BorderLayout.NORTH);
//        mainPanel.add(contentPanel_ques, BorderLayout.CENTER);


//        fullPanel.add(mainPanel, BorderLayout.CENTER);


//        submitButton.setOpaque(false);
//        submitButton.setSize(50, 50);
//        submitButton.setBackground(new Color(47, 47, 47));
//        submitButton.setForeground(Color.WHITE);
//        submitButton.setBorderPainted(false);
//        submitButton.setFocusPainted(false);
//        btnPanel.setOpaque(false);
//        btnPanel.add(submitButton);
//        fullPanel.add(btnPanel, BorderLayout.AFTER_LAST_LINE);

        //底部提示
        tipsPanel.setOpaque(false);
        tipsLabel.setFont(new Font("consola", Font.PLAIN, 12));
        tipsLabel.setForeground(Color.GRAY);
        tipsPanel.add(tipsLabel);
        fullPanel.add(tipsPanel, BorderLayout.SOUTH);


        frame.add(fullPanel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
