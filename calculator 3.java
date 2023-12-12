import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    private JFrame frame;
    private JLabel displayLabel;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalButton, clearButton, dotButton;
    private String oldvalue = "";
    private boolean isOperatorClicked = false;

    public Calculator() {
        // Create and configure the frame
        frame = new JFrame("Calculator");
        frame.setLayout(null);
        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the display label
        displayLabel = new JLabel("");
        displayLabel.setBounds(30, 50, 340, 40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);
        frame.add(displayLabel);

        // Create and configure the number buttons
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setBounds(30 + (i % 3) * 80, 130 + (i / 3) * 80, 70, 70);
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 24));
            numberButtons[i].addActionListener(this);
            frame.add(numberButtons[i]);
        }

        // Create and configure the operator buttons
        operatorButtons = new JButton[]{
                new JButton("+"),
                new JButton("-"),
                new JButton("*"),
                new JButton("/")
        };
        for (int i = 0; i < operatorButtons.length; i++) {
            operatorButtons[i].setBounds(300, 130 + (i * 80), 70, 70);
            operatorButtons[i].setFont(new Font("Arial", Font.PLAIN, 24));
            operatorButtons[i].addActionListener(this);
            frame.add(operatorButtons[i]);
        }

        // Create and configure additional buttons
        dotButton = new JButton(".");
        dotButton.setBounds(30, 410, 70, 70);
        dotButton.addActionListener(this);
        frame.add(dotButton);

        equalButton = new JButton("=");
        equalButton.setBounds(110, 410, 70, 70);
        equalButton.addActionListener(this);
        frame.add(equalButton);

        clearButton = new JButton("C");
        clearButton.setBounds(190, 410, 70, 70);
        clearButton.addActionListener(this);
        frame.add(clearButton);

        // Make the frame visible
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();

            // Handle number buttons
            if (isDigit(button)) {
                if (isOperatorClicked) {
                    displayLabel.setText(button.getText());
                    isOperatorClicked = false;
                } else {
                    displayLabel.setText(displayLabel.getText() + button.getText());
                }
            }

            // Handle operator buttons
            if (isOperator(button)) {
                isOperatorClicked = true;
                oldvalue = displayLabel.getText();
            }

            // Handle dot button
            if (button == dotButton) {
                if (!displayLabel.getText().contains(".")) {
                    displayLabel.setText(displayLabel.getText() + ".");
                }
            }

            // Handle equal button
            if (button == equalButton) {
                try {
                    double result = calculate(oldvalue, displayLabel.getText());
                    displayLabel.setText(String.valueOf(result));
                    oldvalue = String.valueOf(result);
                } catch (NumberFormatException exception) {
                    displayLabel.setText("Invalid input");
                }
            }

            // Handle clear button
                        if (button == clearButton) {
                displayLabel.setText("");
                oldvalue = "";
                isOperatorClicked = false;
            }
        }
    }

    private boolean isDigit(JButton button) {
        for (int i = 0; i < 10; i++) {
            if (button == numberButtons[i]) {
                return true;
            }
        }
        return false;
    }

    private boolean isOperator(JButton button) {
        for (JButton operatorButton : operatorButtons) {
            if (button == operatorButton) {
                return true;
            }
        }
        return false;
    }

    private double calculate(String oldValue, String newValue) throws NumberFormatException {
        double oldNumber = Double.parseDouble(oldValue);
        double newNumber = Double.parseDouble(newValue);

        switch (oldvalue) {
            case "+":
                return oldNumber + newNumber;
            case "-":
                return oldNumber - newNumber;
            case "*":
                return oldNumber * newNumber;
            case "/":
                if (newNumber == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return oldNumber / newNumber;
            default:
                throw new NumberFormatException("Invalid operation");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

