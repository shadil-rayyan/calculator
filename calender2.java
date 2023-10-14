import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    private String oldvalue = "0";
    private boolean isOperatorClicked = false;
    private char operator = '+';

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenButton) {
            if (isOperatorClicked) {
                displaylabel.setText("7");
            } else {
                displaylabel.setText(displaylabel.getText() + "7");
            }
        } else if (e.getSource() == eightButton) {
            displaylabel.setText(displaylabel.getText() + "8");
        } else if (e.getSource() == nineButton) {
            displaylabel.setText(displaylabel.getText() + "9");
        } else if (e.getSource() == fourButton) {
            displaylabel.setText(displaylabel.getText() + "4");
        } else if (e.getSource() == fiveButton) {
            displaylabel.setText(displaylabel.getText() + "5");
        } else if (e.getSource() == sixButton) {
            displaylabel.setText(displaylabel.getText() + "6");
        } else if (e.getSource() == oneButton) {
            displaylabel.setText(displaylabel.getText() + "1");
        } else if (e.getSource() == twoButton) {
            displaylabel.setText(displaylabel.getText() + "2");
        } else if (e.getSource() == threeButton) {
            displaylabel.setText(displaylabel.getText() + "3");
        } else if (e.getSource() == zeroButton) {
            displaylabel.setText(displaylabel.getText() + "0");
        } else if (e.getSource() == equalButton) {
            String newValue = displaylabel.getText();

            float oldValueF = Float.parseFloat(oldvalue);
            float newValueF = Float.parseFloat(newValue);

            float result = 0.0f;
            switch (operator) {
                case '+':
                    result = oldValueF + newValueF;
                    break;
                case '-':
                    result = oldValueF - newValueF;
                    break;
                case '*':
                    result = oldValueF * newValueF;
                    break;
                case '/':
                    result = oldValueF / newValueF;
                    break;
            }

            displaylabel.setText(result + "");
        } else if (e.getSource() == slashButton) {
            operator = '/';
            isOperatorClicked = true;
        } else if (e.getSource() == dotButton) {
            displaylabel.setText(displaylabel.getText() + ".");
        } else if (e.getSource() == xButton) {
            operator = '*';
            isOperatorClicked = true;
        } else if (e.getSource() == plusButton) {
            operator = '+';
            isOperatorClicked = true;
        } else if (e.getSource() == minusButton) {
            operator = '-';
            isOperatorClicked = true;
        } else if (e.getSource() == clearButton) {
            displaylabel.setText("");
        }
    }
}
