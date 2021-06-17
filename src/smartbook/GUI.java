package smartbook;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;



public class GUI implements ActionListener{
 private final String filePath;
        
             DICTIONARY A=new DICTIONARY();
             SwingController controller = new SwingController() ;
            static JFrame applicationFrame = new JFrame();
             JTextField t = new JTextField (50);
              
            static JPanel panel = new JPanel();
             JButton btn =new JButton("Search Word");
             JButton ad =new JButton("Add to Dictionary");
            
             
             public GUI(String s) {
                
             this.filePath = s;
             btn.setBackground(Color.WHITE);
             applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             ad.addActionListener(new btnac(A));
             btn.addActionListener(this);
             
             panel.setSize(700,300);
             applicationFrame.setSize(700, 700);
             panel.add(ad);
             panel.add(btn);
             
            // t.setBackground(Color.GREEN);
             t.setFont(new Font("Kalpurush", Font.BOLD,15));
             panel.add(t);
             applicationFrame.add(panel,BorderLayout.SOUTH);
             SwingViewBuilder factory = new SwingViewBuilder(controller);
             JPanel viewerComponentPanel = factory.buildViewerPanel();
             controller.getDocumentViewController().setAnnotationCallback(
                new org.icepdf.ri.common.MyAnnotationCallback(
                        controller.getDocumentViewController()));
             viewerComponentPanel.setSize(500,500);
             applicationFrame.add(viewerComponentPanel,BorderLayout.NORTH);
             controller.openDocument(filePath);
             applicationFrame.setVisible(true);
             
            //AnnotationHandler mouseEvent = new AnnotationHandler(new AbstractPageViewComponent(),AbstractDocumentViewModel documentViewModel);
           
    }
      public void isSelected()
          {
              System.out.println("hi    "+controller.getDocumentViewController().getSelectedText());
          }
    @Override
    public void actionPerformed(ActionEvent ae) { 
          String s1=controller.getDocumentViewController().getSelectedText();
          String s2=A.ob.search(controller.getDocumentViewController().getSelectedText()).meaning;
          t.setText(s1+"   "+s2);
          File file=new File("SearchedWord.txt");
           FileWriter fw = null;
     try {
         fw = new FileWriter(file,true);
         PrintWriter pw=new PrintWriter(fw);
         pw.println(s1.trim());
         pw.close();
     } catch (IOException ex) {
         Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
     }
        //To change body of generated methods, choose Tools | Templates.
    }

   
        
      

   
}


class btnac implements ActionListener
{
    DICTIONARY A;
     btnac (DICTIONARY B)
     {
         A=B;
     }
    @Override
    public void actionPerformed(ActionEvent ae) {
        ADDMOREWORD addmoreword = new ADDMOREWORD(A);
    }
    
}