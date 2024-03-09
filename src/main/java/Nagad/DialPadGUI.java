/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nagad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class DialPadGUI extends JFrame implements ActionListener {
    private JTextField textField;
    private StringBuilder str;
    private DialPadListener listener;

    public DialPadGUI(DialPadListener listener) {
        this.listener = listener;
        setTitle("Dial Pad");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        JPanel buttonsPanel = new JPanel(new GridLayout(4, 3));
        String[] buttonLabels = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonsPanel.add(button);
        }
        add(buttonsPanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout());
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(e -> deleteLastDigit());
        controlPanel.add(deleteButton);

        JButton callButton = new JButton("Call");
        callButton.addActionListener(e -> callMethod());
        controlPanel.add(callButton);

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> closeDialPad());
        controlPanel.add(closeButton);

        add(controlPanel, BorderLayout.SOUTH);

        str = new StringBuilder();
    }

    DialPadGUI() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void deleteLastDigit() {
        if (str.length() > 0) {
            str.deleteCharAt(str.length() - 1);
            updateTextField();
        }
    }

    private void callMethod() {
        listener.onCall(str.toString());
    }

    private void closeDialPad() {
        setVisible(false);
    }

    private void updateTextField() {
        textField.setText(str.toString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        str.append(command);
        updateTextField();
    }

    public interface DialPadListener {
        void onCall(String number);
    }
}