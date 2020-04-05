package smartbook;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import smartbook.Gui;


public class Ui implements ActionListener {
          JTextField t = new JTextField("TEXT PATH HERE ");
              Ui()
              {
                   JFrame frame = new JFrame();
                   JPanel panel= new JPanel();
                   JButton button = new JButton("OPEN");
                   button.addActionListener(this);
                   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                   frame.setSize(700,700);
                   panel.add(button);
                   panel.add(t);
                   frame.add(panel,BorderLayout.NORTH);//C:\\Users\\Hridoy\\Documents\\NetBeansProjects\\java_tutorial.pdf//,
                   frame.setVisible(true);
                   
              }
           public static void main(String[] args) {
               new Ui();

    }
 
          

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Gui gui = new Gui(t.getText());
    }

   
}

