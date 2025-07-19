import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class question91 { // SimpleChatApp
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Chat");
        frame.setSize(500, 300);  // a bit wider for new field
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout(5, 5));
        frame.add(panel);

        // Display area
        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Bottom panel for username, password, message and send button
        JPanel inputPanel = new JPanel(new FlowLayout());

        // New Username field
        JTextField userField = new JTextField(10);

        JTextField messageField = new JTextField(15);
        JPasswordField passField = new JPasswordField(10);
        JButton sendBtn = new JButton("Send");

        inputPanel.add(new JLabel("User:"));
        inputPanel.add(userField);

        inputPanel.add(new JLabel("Pass:"));
        inputPanel.add(passField);

        inputPanel.add(new JLabel("Message:"));
        inputPanel.add(messageField);

        inputPanel.add(sendBtn);

        panel.add(inputPanel, BorderLayout.SOUTH);

        // Event handling: on button click or Enter key in message field
        ActionListener sendAction = e -> {
            String user = userField.getText().trim();
            String pass = new String(passField.getPassword());
            String msg = messageField.getText().trim();

            if (user.isEmpty()) user = "Anonymous";

            if (!msg.isEmpty()) {
                chatArea.append(user + " (pass: " + pass + "): " + msg + "\n");
                messageField.setText("");
                passField.setText("");
            }
        };

        sendBtn.addActionListener(sendAction);
        messageField.addActionListener(sendAction);

        frame.setVisible(true);
    }
}
