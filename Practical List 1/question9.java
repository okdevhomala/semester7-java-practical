//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class question9 { // FormDemo
//    public static void main(String[] args) {
//        // Create frame
//        JFrame frame = new JFrame("User Form");
//        frame.setSize(350, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Create panel
//        JPanel panel = new JPanel();
//        panel.setLayout(null); // using absolute layout
//        frame.add(panel);
//
//        // Labels
//        JLabel nameLabel = new JLabel("Name:");
//        nameLabel.setBounds(20, 20, 80, 25);
//        panel.add(nameLabel);
//
//        JLabel passLabel = new JLabel("Password:");
//        passLabel.setBounds(20, 60, 80, 25);
//        panel.add(passLabel);
//
//        // Input fields
//        JTextField nameField = new JTextField();
//        nameField.setBounds(100, 20, 200, 25);
//        panel.add(nameField);
//
//        JPasswordField passField = new JPasswordField();
//        passField.setBounds(100, 60, 200, 25);
//        panel.add(passField);
//
//        // Button
//        JButton submitBtn = new JButton("Submit");
//        submitBtn.setBounds(100, 100, 100, 25);
//        panel.add(submitBtn);
//
//        // Text area
//        JTextArea outputArea = new JTextArea();
//        outputArea.setBounds(20, 140, 280, 100);
//        outputArea.setEditable(false);
//        panel.add(outputArea);
//
//        // Event handling
//        submitBtn.addActionListener(e -> {
//            String name = nameField.getText();
//            String pass = new String(passField.getPassword());
//            outputArea.setText("Submitted Info:\nName: " + name + "\nPassword: " + pass);
//        });
//
//        frame.setVisible(true);
//    }
//}
