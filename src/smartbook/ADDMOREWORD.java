package smartbook;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
public class ADDMOREWORD implements ActionListener
{   
    
    JLabel l1,l2;
    JTextField t1,t2; 
    String s1,s2;
    JFrame f= new JFrame("Add Word to Dictionary");  
      DICTIONARY A;// = new Diction();
     JButton b=new JButton("OK");
ADDMOREWORD(DICTIONARY B){
    A=B;
    b.setBounds(200,250,90,30);
    l1=new JLabel("English Word");  
    l1.setBounds(50,70, 100,30);  
    l2=new JLabel("Bangla Word");  
    l2.setBounds(50,130, 100,30);  
    f.add(l1); f.add(l2);  
     
    t1=new JTextField("");  
    t1.setBounds(50,100, 200,30);  
    t2=new JTextField(""); 
    t2.setFont(new Font("Kalpurush",Font.PLAIN,14));
    t2.setBounds(50,160, 200,30);
    b.addActionListener(this);
    f.add(t1); f.add(t2);  f.add(b);
    f.getContentPane().setBackground(new Color(51,153,255));
    f.setSize(500,500);  
    f.setLayout(null);  
    f.setVisible(true);  
    } 
public void actionPerformed(ActionEvent e) {  
     
    s1=t1.getText();
     s2=t2.getText();
     
     if(s1.isEmpty()&&s2.isEmpty())
     {
         JOptionPane.showMessageDialog(f,"You didn't enter anything", "Error!",JOptionPane.ERROR_MESSAGE);
     }
     else if(s1.isEmpty())
     {
         JOptionPane.showMessageDialog(f,"You didn't enter English word", "Error",JOptionPane.ERROR_MESSAGE);
     }
    else if(s2.isEmpty())
     {
         JOptionPane.showMessageDialog(f,"You didn't enter Bengali word", "Error!",JOptionPane.ERROR_MESSAGE);
     }
    else if((A.ob.search(s1).meaning!=null&&A.ob.search(s1).key.length()==s1.length()))
    {
      
      JOptionPane.showMessageDialog(f,"Meaning already exist ", "Error!",JOptionPane.ERROR_MESSAGE);
      
    }
     else
    {
        A.ob.insert(s1,s2);
               try{
        File file=new File("NewWord.txt");
        FileWriter fw=new FileWriter(file,true);
        PrintWriter pw=new PrintWriter(fw);
        pw.println("|"+s1+"|"+s2);
        pw.close();
        }
     catch(Exception er)
     {
         
     }
        
    }
   
}


    public static void main(String[] args){
       new ADDMOREWORD(new DICTIONARY());    
    }
    }

