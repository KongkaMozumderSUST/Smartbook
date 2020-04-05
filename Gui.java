
package smartbook;
import smartbook.Diction;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

public class Gui implements ActionListener {
 private String filePath;
             Diction A=new Diction();
             SwingController controller = new SwingController() ;
             JFrame applicationFrame = new JFrame();
             JTextField t = new JTextField ("Search PDF or Word");
             JPanel panel = new JPanel();
             JButton btn =new JButton("OKKK");
             JButton ad =new JButton("ADD");
             public Gui(String s) {
             this.filePath = s;
             btn.setBackground(Color.BLACK);
             applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             ad.addActionListener(new btnac(A));
             btn.addActionListener(this);
             panel.setSize(700,300);
             applicationFrame.setSize(700, 700);
             panel.add(ad);
             panel.add(btn);
            // t.setBackground(Color.GREEN);
             t.setFont(new Font("kalpurush", Font.BOLD,9));
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
           
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
           System.out.println(controller.getDocumentViewController().getSelectedText()); 
             t.setText(controller.getDocumentViewController().getSelectedText()+"   "+A.ob.search(controller.getDocumentViewController().getSelectedText()).meaning); //To change body of generated methods, choose Tools | Templates.
    }
}
class btnac implements ActionListener
{
    Diction A;
     btnac (Diction B)
     {
         A=B;
     }
    @Override
    public void actionPerformed(ActionEvent ae) {
                 new AddMoreWord(A);
    }
    
}