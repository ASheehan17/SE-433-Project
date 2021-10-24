import javax.swing.*;

//import org.graalvm.compiler.hotspot.replacements.NewObjectSnippets;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//public class MyFrame extends JFrame implements ActionListener{
public class MyFrame extends JFrame implements ActionListener{

    /*\\public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton btton = new JButton("Press");
        frame.getContentPane().add(btton);
        frame.setVisible(true);
    }*/
    JButton one,two,three,four,five;
    MyFrame(){
        JFrame frame = new JFrame("Calc");
        one = new JButton("1");
        one.setBounds(200,100,100,50);
        one.addActionListener(this);
      

        two = new JButton("2");
        two.setBounds(200,100,100,50);
        two.addActionListener(this);







        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(one);
        frame.add(two);

    }



    public void actionPerformed(ActionEvent e){
        if(e.getSource() == one){
            System.out.println("PEE PEE");

        }
        if(e.getSource() == two){
            System.out.println("Yeah I wrote pee pee whoopsie");
        }

    }
}