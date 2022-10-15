package com.ncepu.javaHomework13;

import javax.swing.*;
import java.awt.*;

public class QuesPanel extends JPanel {
    private JLabel label = null;
    private TextField textField = new TextField(1);

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public TextField getTextField() {
        return textField;
    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }

    public QuesPanel(String ques) {
        super();
        label = new JLabel(ques);
        label.setOpaque(false);
        label.setForeground(Color.WHITE);
//        this.setForeground(Color.WHITE);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(label);
        this.add(textField);

        this.setOpaque(false);
    }
}
