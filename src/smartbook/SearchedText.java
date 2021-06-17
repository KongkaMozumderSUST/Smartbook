/* Exam based on searched text*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartbook;

/**
 *
 * @author KONGKA
 *}
 * 
 * **/
package smartbook;
import java.awt.*;  
import java.awt.event.*;  
import java.io.File;
import java.io.IOException;
import javax.swing.*;  
import java.lang.String;
import java.nio.file.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
  
public class SearchedText extends JFrame implements ActionListener  
{  
    DICTIONARY A=new DICTIONARY();
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int res=0,current=0,x=1,y=1,now=0;  
    int ans[]=new int[5];  
    
    
    SearchedText(String s) throws IOException  
    {  
        super(s);  
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]); 
            jb[i].setFont(new Font("Kalpurush",Font.PLAIN,14));
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b2=new JButton("Result");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        
        add(b1);add(b2);
        b2.setEnabled(false);
        set();  
        l.setBounds(30,40,450,20);  
        jb[0].setBounds(50,80,100,20);  
        jb[1].setBounds(50,110,100,20);  
        jb[2].setBounds(50,140,100,20);  
        jb[3].setBounds(50,170,100,20);  
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,100,30);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true); 
        getContentPane().setBackground(Color.WHITE);
        setSize(600,350);  
    }  

    
    @Override
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                res=res+1;  
            current++;  
            try {    
                set();
            } catch (IOException ex) {
                Logger.getLogger(SearchedText.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(current==4)  
            {  
                b1.setEnabled(false);  
                b2.setEnabled(true); 
            }  
        }        
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                res=res+1;  
            current++;  
            //System.out.println("correct ans="+count);  
            JOptionPane.showMessageDialog(this,"correct ans="+res);  
            System.exit(0);  
        }  
    }  
    void set() throws IOException  
    {
        File f=new File("SearchedWord.txt"); 
        Path file = Paths.get("SearchedWord.txt");
        long c = Files.lines(file).count();
        Random random = new Random();   
        int line = random.nextInt((int) c);  
        String s;
        s = Files.readAllLines(Paths.get("SearchedWord.txt")).get(line);
        
         
        Path fil = Paths.get("Trash.txt");
        long co = Files.lines(fil).count();         
        int lin = random.nextInt((int) co);
        int lin1 = random.nextInt((int) co);
        int lin2 = random.nextInt((int) co);
        String st1,st2,st3;
        st1 = Files.readAllLines(Paths.get("Trash.txt")).get(lin);
        st2 = Files.readAllLines(Paths.get("Trash.txt")).get(lin1);
        st3 = Files.readAllLines(Paths.get("Trash.txt")).get(lin2);       
        String s2=A.ob.search(s).meaning;      
        jb[4].setSelected(true);  
        String[] ar = {s2,st1,st2,st3};
        int answer =0;
       for (int i = ar.length - 1; i > 0; i--)
       {
       int index = random.nextInt(i + 1);
          String a = ar[index];
          ar[index] = ar[i];
          ar[i] = a;
          if(ar[i]==s2)
              answer=i;
       }
       if(current==0)  
        {  
            l.setText("Ques1: What is the meaning of "+s+" ?");          
            jb[0].setText(ar[0]);jb[1].setText(ar[1]);jb[2].setText(ar[2]);jb[3].setText(ar[3]);
            
            ans[0]=answer;
        }  
        if(current==1)  
        {  
            l.setText("Ques2: What is the meaning of "+s+" ?");          
            jb[0].setText(ar[0]);jb[1].setText(ar[1]);jb[2].setText(ar[2]);jb[3].setText(ar[3]);
            
            ans[1]=answer;
             
        }  
        if(current==2)  
        {  
          l.setText("Ques3: What is the meaning of "+s+" ?");          
            jb[0].setText(ar[0]);jb[1].setText(ar[1]);jb[2].setText(ar[2]);jb[3].setText(ar[3]);
            
            ans[2]=answer;   
        }  
        if(current==3)  
        {  
          l.setText("Ques4: What is the meaning of "+s+" ?");          
            jb[0].setText(ar[0]);jb[1].setText(ar[1]);jb[2].setText(ar[2]);jb[3].setText(ar[3]);
            
            ans[3]=answer;
        }  
        if(current==4)  
        {  
            l.setText("Ques5: What is the meaning of "+s+" ?");          
            jb[0].setText(ar[0]);jb[1].setText(ar[1]);jb[2].setText(ar[2]);jb[3].setText(ar[3]);
            
            ans[4]=answer;
        }  
       
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[ans[0]].isSelected());  
        if(current==1)  
            return(jb[ans[1]].isSelected());  
        if(current==2)  
            return(jb[ans[2]].isSelected());  
        if(current==3)  
            return(jb[ans[3]].isSelected());  
        if(current==4)  
            return(jb[ans[4]].isSelected());    
        return false;  
    }  
    public static void main(String s[]) throws IOException  
    {  
        new SearchedText("Test");  
    }  
}
