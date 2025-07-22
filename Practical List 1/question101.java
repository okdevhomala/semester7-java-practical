import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class question101 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aayush Chandra Pradhan");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // JComboBox for size
        String[] sizes = {"Small", "Medium", "Large", "Extra Large"};
        JComboBox<String> sizeComboBox = new JComboBox<>(sizes);
        frame.add(new JLabel("Select Size:"));
        frame.add(sizeComboBox);

        // JList for styles (multiple selection)
        String[] styles = {"Casual", "Formal", "Sporty", "Vintage", "Bohemian"};
        JList<String> styleList = new JList<>(styles);
        styleList.setVisibleRowCount(5);
        styleList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane styleScrollPane = new JScrollPane(styleList);
        styleScrollPane.setPreferredSize(new Dimension(120, 100));
        frame.add(new JLabel("Select Styles:"));
        frame.add(styleScrollPane);

        // Label to show selection summary
        JLabel resultLabel = new JLabel("Choose your size and styles.");
        frame.add(resultLabel);

        // Method to update label text based on selections
        Runnable updateSelection = () -> {
            String size = (String) sizeComboBox.getSelectedItem();
            java.util.List<String> selectedStyles = styleList.getSelectedValuesList();

            String stylesText = selectedStyles.isEmpty() ? "None" : String.join(", ", selectedStyles);
            resultLabel.setText("Size: " + size + " | Styles: " + stylesText);
        };

        // Add event listeners
        sizeComboBox.addActionListener(e -> updateSelection.run());
        styleList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                updateSelection.run();
            }
        });

        frame.setVisible(true);
    }
}
