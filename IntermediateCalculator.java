import java.awt.*;
import java.awt.event.*;



public class IntermediateCalculator implements ActionListener {
    //Create Frame
    Frame calcFrame;
    //Create Panel for Frame
    Panel calcPanel;
    //Buttons for numbers
    private Button zero,one,two,three,four,five,six,seven,eight,nine;
    //Operation Buttons (need to add temp, metric to imperial, modulo, exponent, etc.)
    private Button add,subtract,multiply,divide, equal;
    //Additional buttons
    Button clear;

    String num1, num2, output;



    TextField textField;
    GridLayout gridLayout;
    

    IntermediateCalculator() {
        calcFrame = new Frame("Calculator");
        calcFrame.setLayout(new FlowLayout());
        calcPanel = new Panel();

        zero = new Button("0");
        one = new Button("1");
        two = new Button("2");
        three = new Button("3");
        four = new Button("4");
        five = new Button("5");
        six = new Button("6");
        seven = new Button("7");
        eight = new Button("8");
        nine = new Button("9");
        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");
        equal = new Button("=");
        clear = new Button("Clear");


        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        equal.addActionListener(this);
        clear.addActionListener(this);


        BasicOperations.printOUT();ß

        //Needs to be played around with
        textField = new TextField(20);
        calcFrame.add(textField);

        gridLayout = new GridLayout(4,4);
        calcFrame.setLayout(gridLayout);






        calcPanel.add(zero);
        calcPanel.add(one);
        calcPanel.add(two);
        calcPanel.add(three);
        calcPanel.add(four);
        calcPanel.add(five);
        calcPanel.add(six);
        calcPanel.add(seven);
        calcPanel.add(eight);
        calcPanel.add(nine);
        calcPanel.add(add);
        calcPanel.add(subtract);
        calcPanel.add(multiply);
        calcPanel.add(divide);
        calcPanel.add(equal);
        calcPanel.add(clear);

        calcFrame.add(calcPanel);
        calcFrame.setSize(200,200);
        calcFrame.setVisible(true);
        calcFrame.setBackground(Color.WHITE);
        //calcFrame.addWindowListener(new WindowAdapter(windowClosing(WindowEvent e)));
        calcFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });














      
        


    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == zero){
            num1 = textField.getText();
            num2 = "0";
            output = num1 + num2;
            System.out.println("RECEIVED ZERO");
        }

    }

    //Put addition, subtraction, ..., into their own classes?
    /*public void windowClosing(WindowEvent e){
        System.exit(0);
    }*/



}

