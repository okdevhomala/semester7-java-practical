//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//public class question8 {
//    public static void main(String[] args) {
//        // -------- AWT Login --------
//        Frame awtFrame = new Frame("AWT Login");
//        awtFrame.setLayout(null);
//        awtFrame.setSize(250, 180);
//        awtFrame.setLocation(100, 100);
//
//        Label awtUser = new Label("Username:");
//        TextField awtUserField = new TextField();
//        Label awtPass = new Label("Password:");
//        TextField awtPassField = new TextField();
//        Button awtLogin = new Button("Login");
//
//        awtUser.setBounds(20, 40, 60, 20);
//        awtUserField.setBounds(90, 40, 120, 20);
//        awtPass.setBounds(20, 70, 60, 20);
//        awtPassField.setBounds(90, 70, 120, 20);
//        awtPassField.setEchoChar('*');
//        awtLogin.setBounds(90, 100, 60, 25);
//
//        awtFrame.add(awtUser); awtFrame.add(awtUserField);
//        awtFrame.add(awtPass); awtFrame.add(awtPassField);
//        awtFrame.add(awtLogin);
//        awtFrame.setVisible(true);
//
//        awtLogin.addActionListener(e ->
//                System.out.println("AWT Login: " + awtUserField.getText())
//        );
//
//        awtFrame.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                awtFrame.dispose();
//            }
//        });
//
//        // -------- Swing Login --------
//        JFrame swingFrame = new JFrame("Swing Login");
//        swingFrame.setLayout(null);
//        swingFrame.setSize(270, 200);
//        swingFrame.setLocation(400, 100);
//
//        JLabel swingUser = new JLabel("Username:");
//        JTextField swingUserField = new JTextField();
//        JLabel swingPass = new JLabel("Password:");
//        JPasswordField swingPassField = new JPasswordField();
//        JButton swingLogin = new JButton("Login");
//
//        swingUser.setBounds(20, 40, 70, 20);
//        swingUserField.setBounds(100, 40, 120, 20);
//        swingPass.setBounds(20, 70, 70, 20);
//        swingPassField.setBounds(100, 70, 120, 20);
//        swingLogin.setBounds(100, 100, 80, 25);
//
//        swingFrame.add(swingUser); swingFrame.add(swingUserField);
//        swingFrame.add(swingPass); swingFrame.add(swingPassField);
//        swingFrame.add(swingLogin);
//        swingFrame.setVisible(true);
//        swingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        swingLogin.addActionListener(e ->
//                System.out.println("Swing Login: " + swingUserField.getText())
//        );
//    }
//}
