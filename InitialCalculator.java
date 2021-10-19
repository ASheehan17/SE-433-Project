import javax.swing.*;
class gui{
    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton btton = new JButton("Press");
        frame.getContentPane().add(btton);
        frame.setVisible(true);
    }
}