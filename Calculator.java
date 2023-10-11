import javax.swing.Jframe;
import javax.swing.Jlabel;
Jlabel displaylabel;
JButton sevenButton,sixButton,nineButton,oneButton,twoButton,threeButton,fourButton;
JButton eightButton,fiveButton,equalButton,plusButton,minusButton,slashButton,zeroButton;
JButton xButton,clearButton; 
public class Calculator implements addActionListner
{
    boolean isOperatorClicked=false;
}
public class  Calculator
{
    public Calculator()
    {
        Jframe jf = new Jframe("Calculator");
        jf.setlayout(null);
        jf.setSize(100,600);
        // where to display the size
        jf.setLocation(100,200);
        //to make text enter
        display label = new Jlabel ();
        // the x,y,width,height of display label
        displaylabel.setBounds(30,50,540,40);
        // setting its colour it show it we set oopaque to true
        displaylabel.setBackground(color.grey);
        displaylabel.setOpaque(true);
        // to show the label to the right
        displaylabel.setHorizontalAlignment(SwingConstants.Right):
        // to change the text color to white
        displaylabel.setForeground(color.white)
        jf.add(displaylabel());
        
        sevenButton  = new JButton("7");
        sevenButton.setBound(30,130,80,80);
        sevenButton.addActionListner(this);
        sevenButton.setFont(new font('Ariel',font.PlAIN,40));
        jf.add(sevenButton):

        eightButton  = new JButton("8");
        eightButton.setBound(130,130,80,80);
        Button.addActionListner(this);
        jf.add(eightButton):

        nineButton = new JButton("9");
        nineButton.setBound(230,130,80,80);
        nineButton.addActionListner(this);
        jf.add(nineButton):

        fourButton = new JButton("4");
        fourButton.setBound(30,130,80,80);
        fourButton.addActionListner(this)
        jf.add(fourButton):

        fiveButton = new JButton("5");
        fiveButton.setBound(130,230,80,80);
        fiveButton.addActionListner(this);
        jf.add(fiveButton):

        sixButton = new JButton("6");
        sixButton.setBound(230,230,80,80);
        sixButton.addActionListner(this);
        jf.add(sixButton):

        oneButton = new JButton("1");
        oneButton.setBound(30,330,80,80);
        oneButton.addActionListner(this);
        jf.add(oneButton):

        twoButton = new JButton("2");
        twoButton.setBound(130,330,80,80);
        twoButton.addActionListner(this);
        jf.add(twoButton):

        threeButton = new JButton("3");
        threeButton.setBound(230,330,80,80);
        threeButton.addActionListner(this);
        jf.add(threeButton):

        dotButton  = new JButton(".");
        dotButton.setBound(30,430,80,80);
        dotButton.addActionListner(this);
        jf.add(dotButton):

        zeroButton = new JButton("0");
        zeroButton.setBound(130,430,80,80);
        zeroButton.addActionListner(this);
        jf.add(zeroButton):

        equalButton = new JButton("=");
        equalButton.setBound(230,430,80,80);
        equalButton.addActionListner(this);
        jf.add(equalButton):

        
        slashButton  = new JButton("/");
        slashButton.setBound(330,130,80,80);
        slashButton.addActionListner(this);
        jf.add(slashButton):

        xButton = new JButton("x");
        xButton.setBound(330,230,80,80);
        xButton.addActionListner(this);
        jf.add(xButton):

        minusButton = new JButton("-");
        minusButton.setBound(330,330,80,80);
        minusButton.addActionListner(this);
        jf.add(minusButton):

        plusButton = new JButton("+");
        plusButton.setBound(330,330,80,80);
        plushButton.addActionListner(this);
        jf.add(plusButton):

        clearButton = new JButton("+");
        clearButton.setBound(330,330,80,80);
        clearButton.addActionListner(this);
        jf.add(plusButton):



        jf.setVisible(true);
        jf.setDefaultCloseOperation(Jframe.EXIT_ON-CLOSE)

    }
    public static void main (String[]args)
    {
        new Calculator;
    }
    @override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==sevenButton)
        {
         if(isOperatorClicked){
            displaylabel.setText("7");
         }
         else{
           displaylabel.setText(displaylabel.getText()+"7");
         }
        }
        else if (e.getSource()== eightButton)
        {
            displaylabel.setText(displaylabel.getText()+"8")
        }
         else if (e.getSource()== nineButton)
        {
            displaylabel.setText(displaylabel.getText()+"9")
        }
         else if (e.getSource()== fourButton)
        {
            displaylabel.setText(displaylabel.getText()+"4")
        }
         else if (e.getSource()== fiveButton)
        {
            displaylabel.setText(displaylabel.getText()+"5")
        }
         else if (e.getSource()== sixButton)
        {
            displaylabel.setText(displaylabel.getText()+"6")
        }
         else if (e.getSource()== oneButton)
        {
            displaylabel.setText(displaylabel.getText()+"1")
        }
         else if (e.getSource()== twoButton)
        {
            displaylabel.setText(displaylabel.getText()+"2")
        }
         else if (e.getSource()== threeButton)
        {
            displaylabel.setText(displaylabel.getText()+"3")
        }
         else if (e.getSource()== zeroButton)
        {
            displaylabel.setText(displaylabel.getText()+"0")
        }
         else if (e.getSource()== equalButton)
        {
            String newValue =displaylabel.getText();

            float oldvalueF=float.parseFloat(oldvalue);
            float newValueF=float.parseFloat(newValue)

            float result=oldvalueF+newValueF;
            displaylabel.setText(result+"");
        }
         else if (e.getSource()== slashButton)
        {
            displaylabel.setText(displaylabel.getText()+"/")
        }
         else if (e.getSource()== dotButton)
        {
            displaylabel.setText(displaylabel.getText()+".")
        }
         else if (e.getSource()== xButton)
        {
            displaylabel.setText(displaylabel.getText()+"x")
        }
         else if (e.getSource()== plusButton)
        {
            isOperatorClicked=true;
            oldvalue=displaylabel.getText();
         else if (e.getSource()== minusButton)
        {
            displaylabel.setText(displaylabel.getText()+"-")
        }
         else if (e.getSource()== clearButton)
        {
            displaylabel.setText("")
        }
    }
}