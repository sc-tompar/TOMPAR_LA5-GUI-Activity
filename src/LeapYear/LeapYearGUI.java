package LeapYear;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LeapYearGUI extends JFrame {
    private JPanel mainPanel;
    private JPanel panelLeapYear;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        this.$$$setupUI$$$();
        this.btnCheckYear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(LeapYearGUI.this.tfYear.getText());
                    if (year % 400 == 0) {
                        JOptionPane.showMessageDialog(LeapYearGUI.this.btnCheckYear, "Leap year");
                    } else if (year % 100 == 0) {
                        JOptionPane.showMessageDialog(LeapYearGUI.this.btnCheckYear, "Not a leap year");
                    } else if (year % 4 == 0) {
                        JOptionPane.showMessageDialog(LeapYearGUI.this.btnCheckYear, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(LeapYearGUI.this.btnCheckYear, "Not a leap year");
                    }
                } catch (NumberFormatException var3) {
                    JOptionPane.showMessageDialog(LeapYearGUI.this.btnCheckYear, "Enter a numeric value!", "ERROR", 0);
                }

            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI leap = new LeapYearGUI();
        leap.setContentPane(leap.mainPanel);
        leap.setTitle("Leap Year");
        leap.setBounds(600, 200, 400, 400);
        leap.setVisible(true);
        leap.setDefaultCloseOperation(3);
    }
}
