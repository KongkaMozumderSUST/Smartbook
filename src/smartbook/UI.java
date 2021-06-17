import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.IOException;
import javax.swing.*;
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.filechooser.FileSystemView;
class MyButton extends JButton {

    Image image;
    ImageObserver imageObserver;


    MyButton(String filename) {
            super();
            ImageIcon icon = new ImageIcon(filename);
            image = icon.getImage();
            imageObserver = icon.getImageObserver();
        }

    @Override
     public void paint( Graphics g ) {
            super.paint( g );
            g.drawImage(image,  0 , 0 , getWidth() , getHeight() , imageObserver);
        }
    }
public class UI {
    DICTIONARY A=new DICTIONARY();
    JFrame frame = new JFrame();
    JPanel panel=new JPanel();
    JLabel label=new  JLabel("Page");
    JTextArea t1=new JTextArea("      ");
    JLabel label1=new  JLabel("To");
    JTextArea t2=new JTextArea("      ");
    MyButton btn=new MyButton(".\\img\\browse.jpg");
    MyButton play=new MyButton(".\\img\\play_game.jpg");
    MyButton xm = new MyButton(".\\img\\take-test.jpg");
    MyButton searchWord = new MyButton(".\\img\\search-word.jpg");
    UI()
    {
        frame.setLayout(null); 
        frame.setSize(900,700);
        frame.setBackground(new Color(255, 255, 255));
        JPanel p=new JPanel();
        p.add(label);p.add(t1);p.add(label1);p.add(t2);
        p.setBackground(Color.WHITE);
        JLabel l= new JLabel(new ImageIcon(".\\img\\background.jpg"));
        
        frame.setContentPane(l);
        frame.add(btn);
        frame.add(play);
        frame.add(xm);
        frame.add(p);
        frame.add(searchWord);
        btn.setLocation(600,240);
        btn.setSize(200,50);
        p.setLocation(600,300);
        p.setSize(200,30);
        play.setLocation(600,340);
        play.setSize(200,50);
        btn.addActionListener(new browse());
        play.addActionListener(new  playbtn(t1,t2));
        xm.setLocation(600,400);
        xm.setSize(200,50);
        xm.addActionListener(new xm());
        
        searchWord.setLocation(600,470);
        searchWord.setSize(200,50);
        searchWord.addActionListener(new search(A));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new UI();
    }

    
    
}

class xm implements ActionListener{
       @Override
    public void actionPerformed(ActionEvent ae) {
        SearchedText text;
           try {
               text = new SearchedText("Test");
           } catch (IOException ex) {
               Logger.getLogger(xm.class.getName()).log(Level.SEVERE, null, ex);
           }
    }  
}
class search implements ActionListener{
     DICTIONARY A;
     search (DICTIONARY B)
     {
         A=B;
     }
    public void actionPerformed(ActionEvent ae) {
        SearchWord text;
        new SearchWord(A);
    }  
}

class browse implements ActionListener
{
          @Override
    public void actionPerformed(ActionEvent ae) {
        
      JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
      j.showOpenDialog(null);
      String s=j.getSelectedFile().getAbsolutePath();
      if(s!=null){
      GUI gui = new GUI(s);
      gui.isSelected();
        }
    }
    
}
class playbtn implements ActionListener
{
    JTextArea t1=new JTextArea("1");
    JTextArea t2=new JTextArea("1");
     char ch='1',ch2='1';
   playbtn(JTextArea _t1,JTextArea _t2)
    {
       t1=_t1;t2=_t2; 
    }
    
          @Override
    public void actionPerformed(ActionEvent ae) {
      JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
      j.showOpenDialog(null);
      String s=j.getSelectedFile().getAbsolutePath();
              System.out.println(s+" "+t1.getText()+" \n");

          for(int i=0;i<t1.getText().length();i++)
          {
            if(t1.getText().charAt(i)>='0'&&t1.getText().charAt(i)<=9)  
            {
               ch=t1.getText().charAt(i);
            }
          }
          for(int i=0;i<t2.getText().length();i++)
          {
            if(t2.getText().charAt(i)>='0'&&t2.getText().charAt(i)<=9)  
            {
               ch2=t2.getText().charAt(i);
            }
          }

           new GAME3(s,(int)(ch-'0'),(int)(ch2-'0'));
        }
    }
    
