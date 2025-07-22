//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class question10 { // ComboBoxAndListDemo
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Aayush Chandra Pradhan");
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new FlowLayout());
//
//        // JComboBox with items
//        String[] comboItems = {"Apple", "Banana", "Cherry", "Date"};
//        JComboBox<String> comboBox = new JComboBox<>(comboItems);
//        frame.add(new JLabel("Select a fruit:"));
//        frame.add(comboBox);
//
//        // JList with items
//        String[] listItems = {"Red", "Green", "Blue", "Yellow"};
//        JList<String> list = new JList<>(listItems);
//        list.setVisibleRowCount(4);
//        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        JScrollPane listScrollPane = new JScrollPane(list);
//        listScrollPane.setPreferredSize(new Dimension(100, 80));
//        frame.add(new JLabel("Select a color:"));
//        frame.add(listScrollPane);
//
//        // Label to show selections
//        JLabel selectionLabel = new JLabel("Your selection will appear here.");
//        frame.add(selectionLabel);
//
//        // Event handling for JComboBox
//        comboBox.addActionListener(e -> {
//            String selectedFruit = (String) comboBox.getSelectedItem();
//            selectionLabel.setText("Selected fruit: " + selectedFruit);
//        });
//
//        // Event handling for JList
//        list.addListSelectionListener(e -> {
//            if (!e.getValueIsAdjusting()) {
//                String selectedColor = list.getSelectedValue();
//                if (selectedColor != null) {
//                    selectionLabel.setText("Selected color: " + selectedColor);
//                }
//            }
//        });
//
//        frame.setVisible(true);
//    }
//}
