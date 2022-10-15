package com.ncepu.javaHomework13;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {
    private JLabel label = null;
    private JTextField textField = new JTextField(1);

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public InfoPanel(String info) {
        super();
        label = new JLabel(info);
        label.setOpaque(false);
        label.setForeground(Color.WHITE);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(label);
        this.add(textField);

        this.setOpaque(false);
    }
}
