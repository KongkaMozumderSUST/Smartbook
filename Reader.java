package Gui;
import javax.swing.*;
import java.io.IOException;
import com.gnostice.pdfone.PdfDocument;
import com.gnostice.pdfone.PdfException;
import com.gnostice.pdfone.PdfViewer;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import javafx.scene.effect.Light.Point;
import javax.swing.text.View;
public class Reader implements ActionListener{
          Diction A = new Diction();
        JFrame frame = new JFrame();
         JPanel p = new JPanel();
         JPanel p2 = new JPanel();
       
        JButton button = new JButton("Search");
        JTextField t = new JTextField ("Search PDF or Word");
        JButton t2= new JButton ("Open");
        PdfViewer View;
      public void main() {
       
          Font banglaFont=new Font("Arial Unicode MS",Font.BOLD,15);
          t.setFont(banglaFont); 
          View = new PdfViewer();
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setLocation(0,0);
          frame.setSize(700, 700); 
          p.add(button);
          p.add(t);
          p.add(t2);
          frame.add(p,BorderLayout.NORTH);
           frame.add(View);
          frame.setVisible(true);
        //  View.addMouseListener(this);
          button.addActionListener( this);
          button.setActionCommand("good");
          t2.addActionListener(this); 
           t2.setActionCommand("better");
    }
     public static void main(String[] args) {
          Reader ob = new Reader();
         ob.main();
    }
          @Override
          
 public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        if (action.equals("good")) {
            System.out.println("Button pressed!");
             Font f;
         
          String s=t.getText();
            System.out.println(s);
          t.setText(A.ob.search(s).key+" "+ A.ob.search(s).meaning);
        
        }
        else if(action.equals("better"))
        {
            System.out.println("Button 2 pressed!");
             String s=t.getText();
             System.out.println(s);
            PdfDocument d;
            d = new PdfDocument();
            File  infile;
            infile = new File(s);
            try
               {
                   d.load(infile);
                   View.loadDocument(d);
               }
               catch(PdfException | IOException e)
                       {
                           
                       }
               
        
        }
    }
 
}




