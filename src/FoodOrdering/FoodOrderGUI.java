package FoodOrdering;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cbPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cbBurger;
    private JCheckBox cbFries;
    private JCheckBox cbDrinks;
    private JCheckBox cbTea;
    private JCheckBox cbSundae;
    private JRadioButton rbFive;
    private JRadioButton rbTen;
    private JRadioButton rbFifteen;

    public FoodOrderGUI() {
        this.$$$setupUI$$$();
        this.btnOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DecimalFormat d = new DecimalFormat("0.00");
                float amount = 0.0F;
                float discount = 0.0F;
                if (FoodOrderGUI.this.cbPizza.isSelected()) {
                    amount += 100.0F;
                }

                if (FoodOrderGUI.this.cbBurger.isSelected()) {
                    amount += 80.0F;
                }

                if (FoodOrderGUI.this.cbFries.isSelected()) {
                    amount += 65.0F;
                }

                if (FoodOrderGUI.this.cbDrinks.isSelected()) {
                    amount += 55.0F;
                }

                if (FoodOrderGUI.this.cbTea.isSelected()) {
                    amount += 50.0F;
                }

                if (FoodOrderGUI.this.cbSundae.isSelected()) {
                    amount += 40.0F;
                }

                JButton var10000;
                String var10001;
                if (FoodOrderGUI.this.rbNone.isSelected()) {
                    var10000 = FoodOrderGUI.this.btnOrder;
                    var10001 = d.format((double)amount);
                    JOptionPane.showMessageDialog(var10000, "The total price is: " + var10001);
                } else if (FoodOrderGUI.this.rbFive.isSelected()) {
                    discount = (float)((double)amount * 0.05);
                    amount -= discount;
                    var10000 = FoodOrderGUI.this.btnOrder;
                    var10001 = d.format((double)amount);
                    JOptionPane.showMessageDialog(var10000, "The total price is: " + var10001);
                } else if (FoodOrderGUI.this.rbTen.isSelected()) {
                    discount = (float)((double)amount * 0.1);
                    amount -= discount;
                    var10000 = FoodOrderGUI.this.btnOrder;
                    var10001 = d.format((double)amount);
                    JOptionPane.showMessageDialog(var10000, "The total price is: " + var10001);
                } else if (FoodOrderGUI.this.rbFifteen.isSelected()) {
                    discount = (float)((double)amount * 0.15);
                    amount -= discount;
                    var10000 = FoodOrderGUI.this.btnOrder;
                    var10001 = d.format((double)amount);
                    JOptionPane.showMessageDialog(var10000, "The total price is: " + var10001);
                }

            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI food = new FoodOrderGUI();
        food.setContentPane(food.panel1);
        food.setTitle("Simple Calculator");
        food.setBounds(400, 100, 500, 500);
        food.setVisible(true);
        food.setDefaultCloseOperation(3);
    }
}
