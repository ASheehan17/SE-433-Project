import javax.swing.*;
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
    JButton button;
    MyFrame(){
        button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);

    }



    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("PEE PEE");

        }

    }
}