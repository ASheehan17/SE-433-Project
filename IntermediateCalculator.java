import java.awt.*;
import java.awt.event.*;
import java.security.DigestInputStream;



public class IntermediateCalculator implements ActionListener {
    //Create Frame
    Frame calcFrame;
    //Create Panel for Frame
    Panel calcPanel;
    //Buttons for numbers
    private Button zero,one,two,three,four,five,six,seven,eight,nine;
    //Operation Buttons (need to add temp, metric to imperial, modulo, exponent, etc.)
    private Button add,subtract,multiply,divide, calculate;
    //Additional buttons
    Button clear;

    String initialNumber, currentNumber, output, basicoperation, placeholder;
    //String currentNumber, output, basicoperation;

    
    Float operated;



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
        calculate = new Button("=");
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
        calculate.addActionListener(this);
        clear.addActionListener(this);



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
        calcPanel.add(calculate);
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
        //String initialNumber = "0";
        if(e.getSource() == zero){
            initialNumber = textField.getText();
            currentNumber = "0";
            output = initialNumber + currentNumber;
            System.out.println("RECEIVED ZERO");
            textField.setText(output);
        }
        if(e.getSource() == one){
            initialNumber = textField.getText();
            currentNumber = "1";
            output = initialNumber + currentNumber;
            System.out.println("RECEIVED ONE");
            textField.setText(output);
        }
        if(e.getSource() == two){
            initialNumber = textField.getText();
            currentNumber = "2";
            output = initialNumber + currentNumber;
            textField.setText(output);
        }
        if(e.getSource() == three){
            initialNumber = textField.getText();
            currentNumber = "3";
            output = initialNumber + currentNumber;
            textField.setText(output);
        }
        if(e.getSource() == four){
            initialNumber = textField.getText();
            currentNumber = "4";
            output = initialNumber + currentNumber;
            textField.setText(output);
        }
        if(e.getSource() == five){
            initialNumber = textField.getText();
            currentNumber = "5";
            output = initialNumber + currentNumber;
            textField.setText(output);
        }
        if(e.getSource() == six){
            initialNumber = textField.getText();
            currentNumber = "6";
            output = initialNumber + currentNumber;
            textField.setText(output);
        }
        if(e.getSource() == seven){
            initialNumber = textField.getText();
            currentNumber = "7";
            output = initialNumber + currentNumber;
            textField.setText(output);
        }
        if(e.getSource() == eight){
            initialNumber = textField.getText();
            currentNumber = "8";
            output = initialNumber + currentNumber;
            textField.setText(output);
        }
        if(e.getSource() == nine){
            initialNumber = textField.getText();
            currentNumber = "9";
            output = initialNumber + currentNumber;
            textField.setText(output);
        }









        if(e.getSource() == add){
            basicoperation = "add";
            initialNumber = textField.getText();
            placeholder = textField.getText();
            textField.setText("");
            //textField.setText("");
            System.out.println(initialNumber);
            
        }
        if(e.getSource() == subtract){
            basicoperation = "subtract";
            initialNumber = textField.getText();
        }
        if(e.getSource() == multiply){
            basicoperation = "multiply";
            initialNumber = textField.getText();
        }
        if(e.getSource() == divide){
            basicoperation = "divide";
            initialNumber = textField.getText();
        }
        if(e.getSource() == calculate){
            currentNumber = textField.getText();
            System.out.println(placeholder);
            System.out.println(Float.parseFloat(currentNumber)+ Float.parseFloat(placeholder));

            System.out.println("HELLO");

            //System.out.println(Float.parseFloat(initialNumber));
            //System.out.println(Float.parseFloat(currentNumber));
            //float operated = BasicOperations.calculate(basicoperation, Float.parseFloat(initialNumber), Float.parseFloat(currentNumber));
            //textField.setText(String.valueOf(operated));
            System.out.println(operated);
            //Pass in basic operations, initial Number, and current Number
            //float operated = BasicOperations(basicoperation, initialNumber, currentNumber)
        }

    }

}

