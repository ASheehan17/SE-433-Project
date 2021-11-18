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

    //Dual Operation Buttons
    private Button add,subtract,multiply,divide, calculate;

    //Single operand Buttons
    private Button percent, exp, square, squareroot; 

    //Temperature Buttons

    private Button CtoF, FtoC, CtoK, KtoC;

    //Weight Buttons
    private Button LBtoKG, KGtoLB, OZtoG, GtoOZ; 

    //Additional buttons
    Button decimal, negative, clear;


    String initialNumber, currentNumber, output, basicoperation, placeholder, singleoperand, temperature, weight;
    String calcMode;

    
    Double operated;
    TextField textField;
    GridLayout gridLayout;
    

    IntermediateCalculator() {
        //Initalize Buttons
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
        subtract = new Button("- (sub)");
        multiply = new Button("*");
        divide = new Button("/");
        calculate = new Button("=");

        clear = new Button("Clear");
        decimal = new Button(".");
        negative  = new Button("- (neg)");

        percent = new Button("%");
        exp = new Button("e");
        square = new Button("^2");
        squareroot = new Button("sqrt");

        CtoF = new Button("C° -> F°");
        FtoC = new Button("F° -> C°");

        CtoK = new Button("C° -> K°");
        KtoC = new Button("K° -> C°");

        LBtoKG = new Button("lb -> kg");
        KGtoLB = new Button("kg -> lb");
        OZtoG = new Button("oz -> g");
        GtoOZ = new Button("g -> oz");



        //Add Listeners
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
        negative.addActionListener(this);
        clear.addActionListener(this);
        percent.addActionListener(this);
        exp.addActionListener(this);
        square.addActionListener(this);
        squareroot.addActionListener(this);
        CtoF.addActionListener(this);
        FtoC.addActionListener(this);
        CtoK.addActionListener(this);
        KtoC.addActionListener(this);
        LBtoKG.addActionListener(this);
        KGtoLB.addActionListener(this);
        OZtoG.addActionListener(this);
        GtoOZ.addActionListener(this);



        //Needs to be played around with
        textField = new TextField(700);
        calcFrame.add(textField);

        gridLayout = new GridLayout(5,5);
        calcFrame.setLayout(gridLayout);


        //Add our buttons to the panel
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
        calcPanel.add(negative);

        //Add Single Operand Buttons
        calcPanel.add(percent);
        calcPanel.add(exp);
        calcPanel.add(square);
        calcPanel.add(squareroot);

        //Add Temperature Buttons
        calcPanel.add(CtoF);
        calcPanel.add(FtoC);
        calcPanel.add(CtoK);
        calcPanel.add(KtoC);


        //Add Weight Buttons
        calcPanel.add(LBtoKG);
        calcPanel.add(KGtoLB);
        calcPanel.add(OZtoG);
        calcPanel.add(GtoOZ);



        //GroupLayout g = new GroupLayout(calcPanel);
        //calcPanel.setLayout(g);


        calcFrame.add(calcPanel);
        calcFrame.setSize(700,700);
        calcFrame.setVisible(true);
        calcFrame.setBackground(Color.WHITE);


        //Handler for window closing
        calcFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }


    //Listeners for each button
    public void actionPerformed(ActionEvent e){
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

        if(e.getSource() == negative){
            initialNumber = textField.getText();
            currentNumber = "-";
            output = initialNumber+currentNumber;
            textField.setText(output);
        }


        //Dual Operand Calculations

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

        //Weight Calculations
        if(e.getSource()==LBtoKG){
            weight = "LBtoKG";
            initialNumber = textField.getText();
            placeholder = textField.getText();

            textField.setText("");
            calcMode = "weight";
        }

        if(e.getSource()==KGtoLB){
            weight = "KGtoLB";
            initialNumber = textField.getText();
            placeholder = textField.getText();

            textField.setText("");
            calcMode = "weight";
        }

        if(e.getSource()==OZtoG){
            weight = "OZtoG";
            initialNumber = textField.getText();
            placeholder = textField.getText();

            textField.setText("");
            calcMode = "weight";

        }

        if(e.getSource()== GtoOZ){
            weight = "GtoOZ";
            initialNumber = textField.getText();
            placeholder = textField.getText();

            textField.setText("");
            calcMode = "weight";
        }








        //Logic for calling various operations when "=" is clicked
        if(e.getSource() == calculate){

            if(calcMode.equals("basic")){
                currentNumber = textField.getText();

                operated = BasicOperations.calculate(basicoperation, Double.parseDouble(placeholder), Double.parseDouble(currentNumber));
                textField.setText(String.valueOf(operated));

            } else if (calcMode.equals("single")){
                operated = SingleOperandOperations.calculationLogic(singleoperand, Double.parseDouble(placeholder));
                System.out.println(operated);
                textField.setText(String.valueOf(operated));

            } else if (calcMode.equals("temperature")){
                operated = TemperatureOperations.temperatureLogic(temperature, Double.parseDouble(placeholder));
                System.out.println(operated);
                textField.setText(String.valueOf(operated));
            } else if (calcMode.equals("weight")){
                operated = WeightConversion.weightLogic(weight, Double.parseDouble(placeholder));
                System.out.println(operated);
                textField.setText(String.valueOf(operated));
            }
        }

        if(e.getSource() == clear){
            textField.setText("");
        }

    }

}

