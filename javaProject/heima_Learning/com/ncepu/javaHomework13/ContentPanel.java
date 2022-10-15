package com.ncepu.javaHomework13;

import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {

    private JLabel label = null;
    private JPanel panel = null;

    public ContentPanel(String title) {
        super(new FlowLayout());
        this.setOpaque(false);
        label = new JLabel(title);
        label.setForeground(Color.WHITE);

        label.setFont(new Font("楷体", Font.PLAIN, 16));
        this.add(label);

        panel = new JPanel(new FlowLayout());
        panel.setOpaque(false);
        this.add(panel);
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
}
