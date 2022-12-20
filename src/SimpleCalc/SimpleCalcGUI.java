package SimpleCalc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalcGUI extends JFrame {
    private JPanel pMain;
    private JTextField tfFirstNo;
    private JComboBox cbOperation;
    private JButton btnCompute;
    private JPanel pFirstNo;
    private JPanel pSecondNo;
    private JPanel pResult;
    private JTextField tfSecondNo;
    private JTextField tfResult;

    public SimpleCalcGUI() {
        this.$$$setupUI$$$();
        this.btnCompute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(SimpleCalcGUI.this.tfFirstNo.getText());
                    int num2 = Integer.parseInt(SimpleCalcGUI.this.tfSecondNo.getText());
                    int result = 0;
                    String remain = "";
                    String operation = SimpleCalcGUI.this.cbOperation.getSelectedItem().toString();
                    if (operation == "+") {
                        result = num1 + num2;
                    } else if (operation == "-") {
                        result = num1 - num2;
                    } else if (operation == "*") {
                        result = num1 * num2;
                    } else if (operation == "/") {
                        result = num1 / num2;
                        remain = " r." + Integer.toString(num1 % num2);
                    }

                    JTextField var10000 = SimpleCalcGUI.this.tfResult;
                    String var10001 = Integer.toString(result);
                    var10000.setText(var10001 + remain);
                    SimpleCalcGUI.this.tfResult.setEditable(false);
                } catch (NumberFormatException var7) {
                    JOptionPane.showMessageDialog(SimpleCalcGUI.this.btnCompute, "Enter a numeric value!", "ERROR", 0);
                } catch (ArithmeticException var8) {
                    JOptionPane.showMessageDialog(SimpleCalcGUI.this.btnCompute, "Enter a nonzero value!", "ERROR", 0);
                }

            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI calc = new SimpleCalcGUI();
        calc.setContentPane(calc.pMain);
        calc.setTitle("Simple Calculator");
        calc.setBounds(400, 200, 500, 200);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(3);
    }
}
