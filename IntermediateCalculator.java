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
    private Button percent, exp, square, squareroot; 
    private Button CtoF, FtoC, CtoK, KtoC;
    //Additional buttons
    Button decimal, clear;

    String initialNumber, currentNumber, output, basicoperation, placeholder, singleoperand, temperature;
    String calcMode;
    //String currentNumber, output, basicoperation;

    
    Double operated;



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
        decimal = new Button(".");

        percent = new Button("%");
        exp = new Button("e");
        square = new Button("^2");
        squareroot = new Button("sqrt");

        CtoF = new Button("C -> F");
        FtoC = new Button("F -> C");

        CtoK = new Button("C -> K");
        KtoC = new Button("K -> C");



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
        decimal.addActionListener(this);
        clear.addActionListener(this);
        percent.addActionListener(this);
        exp.addActionListener(this);
        square.addActionListener(this);
        squareroot.addActionListener(this);
        CtoF.addActionListener(this);
        FtoC.addActionListener(this);
        CtoK.addActionListener(this);
        KtoC.addActionListener(this);



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
        calcPanel.add(decimal);

        calcPanel.add(percent);
        calcPanel.add(exp);
        calcPanel.add(square);
        calcPanel.add(squareroot);


        calcPanel.add(CtoF);
        calcPanel.add(FtoC);
        calcPanel.add(CtoK);
        calcPanel.add(KtoC);

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

        if(e.getSource() == decimal){
            initialNumber = textField.getText();
            currentNumber = ".";
            output = initialNumber + currentNumber;
            textField.setText(output);
        }


        //Dual Operand Operations

        if(e.getSource() == add){
            basicoperation = "add";
            initialNumber = textField.getText();
            placeholder = textField.getText();
            textField.setText("");
            System.out.println(initialNumber);
            calcMode = "basic";
            
        }
        if(e.getSource() == subtract){
            basicoperation = "subtract";
            initialNumber = textField.getText();
            placeholder = textField.getText();
            textField.setText("");
            calcMode = "basic";
        }
        if(e.getSource() == multiply){
            basicoperation = "multiply";
            initialNumber = textField.getText();
            placeholder = textField.getText();
            textField.setText("");
            calcMode = "basic";
        }
        if(e.getSource() == divide){
            basicoperation = "divide";
            initialNumber = textField.getText();
            placeholder = textField.getText();
            textField.setText("");
            calcMode = "basic";
        }


        //Single Operand Calculations

        if(e.getSource() == percent){
            singleoperand = "percent";
            initialNumber = textField.getText();
            //May have to input placeholder in with 
            placeholder = textField.getText();

            textField.setText("");
            calcMode = "single";
        }

        if(e.getSource() == exp){
            singleoperand = "exp";
            initialNumber = textField.getText();
            placeholder = textField.getText();
            
            textField.setText("");
            calcMode = "single";
        }

        if(e.getSource()== square){
            singleoperand = "square";
            initialNumber = textField.getText();
            placeholder = textField.getText();

            textField.setText("");
            calcMode = "single";
        }

        if(e.getSource() == squareroot){
            singleoperand = "squareroot";
            initialNumber = textField.getText();
            placeholder = textField.getText();

            textField.setText("");
            calcMode = "single";
        }



        //Temperature Calculations

        if(e.getSource() == CtoF){
            temperature = "CtoF";
            initialNumber = textField.getText();
            placeholder = textField.getText();


            textField.setText("");
            calcMode = "temperature";
        }
        if(e.getSource() == FtoC){
            temperature = "FtoC";
            initialNumber = textField.getText();
            placeholder = textField.getText();


            textField.setText("");
            calcMode = "temperature";
        }
        if(e.getSource() == CtoK){
            temperature = "CtoK";
            initialNumber = textField.getText();
            placeholder = textField.getText();


            textField.setText("");
            calcMode = "temperature";
        }
        if(e.getSource() == KtoC){
            temperature = "KtoC";
            initialNumber = textField.getText();
            placeholder = textField.getText();


            textField.setText("");
            calcMode = "temperature";
        }




        if(e.getSource() == calculate){

            if(calcMode.equals("basic")){
                currentNumber = textField.getText();

                operated = BasicOperations.calculate(basicoperation, Double.parseDouble(placeholder), Double.parseDouble(currentNumber));
                textField.setText(String.valueOf(operated));

            } else if (calcMode.equals("single")){
                operated = SingleOperandOperations.calculationLogic(singleoperand, Double.parseDouble(placeholder));
                System.out.println(operated);
                textField.setText(String.valueOf(operated));

            }
            
     




        }






        if(e.getSource() == clear){
            textField.setText("");
        }

    }

}

