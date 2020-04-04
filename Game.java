package smartbook;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;



public class Game implements ActionListener {
          Diction A= new Diction();
           String s="";int raw=-1,col=-1,score=0 ;
           JFrame frame = new JFrame("YOUR SCORE "+score);
        JButton btn = new JButton("S");
        JButton btn1= new JButton("O");
        JButton btn2= new JButton("D");
        JButton btn3= new JButton("H");
        JButton btn4= new JButton("O");
        JButton btn5= new JButton("F");
        JButton btn6= new JButton("I");
        JButton btn7= new JButton("F");
        JButton btn8= new JButton("T");
        JButton btn9= new JButton("J");
     Game() {

        frame.setLayout(null);
       frame.setSize(500,500);
       JPanel panel =new JPanel();
       panel.add(btn);
       panel.add(btn1);
       panel.add(btn2);
        panel.setLocation(0,0);
       panel.setSize(200,50);
       panel.setBackground(Color.black);
       frame.add(panel);
       JPanel panel1 =new JPanel();
       panel1.add(btn3);
       panel1.add(btn4);
       panel1.add(btn5);
       panel1.setLocation(0,51);
       panel1.setSize(200,50);
       panel1.setBackground(Color.black);
       frame.add(panel1);
       JPanel panel2 =new JPanel();
       panel2.add(btn6);
       panel2.add(btn7);
       panel2.add(btn8);
        panel2.setLocation(0,102);
       panel2.setSize(200,50);
       panel2.setBackground(Color.black);
       frame.add(panel2);
       JButton sfl= new JButton("Suffle");
        sfl.setLocation(30,153);
        sfl.setSize(70,30);
       JButton go= new JButton("GO");
        go.setLocation(101,153);
        go.setSize(70,30);
        frame.add(sfl);
        frame.add(go);
       btn.addActionListener(this);
       btn.setActionCommand("btn");
       btn1.addActionListener(this);
       btn1.setActionCommand("btn1");
       btn2.addActionListener(this);
       btn2.setActionCommand("btn2");
      btn3.addActionListener(this);
       btn3.setActionCommand("btn3");
       btn4.addActionListener(this);
       btn4.setActionCommand("btn4");
       btn5.addActionListener(this);
       btn5.setActionCommand("btn5");
      btn6.addActionListener(this);
       btn6.setActionCommand("btn6");
       btn7.addActionListener(this);
       btn7.setActionCommand("btn7");
       btn8.addActionListener(this);
       btn8.setActionCommand("btn8");
         go.addActionListener(this);
       go.setActionCommand("go");     
       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
         System.out.println(s.length());
       frame.setVisible(true);
        
    }
    public static void main(String args[])
    {
     new Game();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand()=="btn")
        {
       if((raw==2&&col==1)||(raw==1&&col==2)||(raw==-1&&col==-1))   
        {
            frame.setTitle("YOUR SCORE "+score);
        s=s+btn.getText();
        raw=1;
        col=1;
        }
       else
       {
           frame.setTitle("Invalid Selection");
           s="";
           raw=-1;
           col=-1;
       }
        }
        if(ae.getActionCommand()=="btn1")
        {
       if((raw==1&&col==1)||(raw==2&&col==2)||(raw==1&&col==3)||(raw==-1&&col==-1))   
        {
         frame.setTitle("YOUR SCORE "+score);
        s=s+btn1.getText();
        raw=1;
        col=2;
        }
       else
       {
           frame.setTitle("Invalid Selection");
           s="";
           raw=-1;
           col=-1;
       }
        }
        if(ae.getActionCommand()=="btn2")
        {
       if((raw==1&&col==2)||(raw==2&&col==3)||(raw==-1&&col==-1))   
        {
         frame.setTitle("YOUR SCORE "+score);
        s=s+btn2.getText();
        raw=1;
        col=3;
        }
       else
       {
         frame.setTitle("Invalid Selection");
           s="";
           raw=-1;
           col=-1;
       }
        }
              if(ae.getActionCommand()=="btn3")
        {
       if((raw==1&&col==1)||(raw==2&&col==2)||(raw==3&&col==1)||(raw==-1&&col==-1))   
        {
          frame.setTitle("YOUR SCORE "+score);
        s=s+btn3.getText();
        raw=2;
        col=1;
        }
       else
       {
         frame.setTitle("Invalid Selection");
           s="";
           raw=-1;
           col=-1;
       }
        }
        if(ae.getActionCommand()=="btn4")
        {
       if((raw==1&&col==2)||(raw==2&&col==1)||(raw==2&&col==3)||(raw==3&&col==2)||(raw==-1&&col==-1))   
        {
        frame.setTitle("YOUR SCORE "+score);
        s=s+btn4.getText();
        raw=2;
        col=2;
        }
       else
       {
         frame.setTitle("Invalid Selection");
           s="";
           raw=-1;
           col=-1;
       }
        }
    if(ae.getActionCommand()=="btn5")
        {
       if((raw==1&&col==3)||(raw==2&&col==2)||(raw==3&&col==3)||(raw==-1&&col==-1))   
        {
       frame.setTitle("YOUR SCORE "+score);
        s=s+btn5.getText();
        raw=2;
        col=3;
        }
       else
       {
         frame.setTitle("Invalid Selection");
           s="";
           raw=-1;
           col=-1;
       }
        }
    if(ae.getActionCommand()=="btn6")
        {
       if((raw==2&&col==1)||(raw==3&&col==2)||(raw==-1&&col==-1))   
        {
        frame.setTitle("YOUR SCORE "+score);
        s=s+btn6.getText();
        raw=3;
        col=1;
        }
       else
       {
          
         frame.setTitle("Invalid Selection");
           s="";
           raw=-1;
           col=-1;
       }
        }
    if(ae.getActionCommand()=="btn7")
        {
       if((raw==3&&col==1)||(raw==2&&col==2)||(raw==3&&col==3)||(raw==-1&&col==-1))   
        {
                 frame.setTitle("YOUR SCORE "+score);

        s=s+btn7.getText();
        raw=3;
        col=2;
        }
       else
       {
         frame.setTitle("Invalid Selection");
           s="";
           raw=-1;
           col=-1;
       }
        }
    if(ae.getActionCommand()=="btn8")
        {
       if((raw==2&&col==3)||(raw==3&&col==2)||(raw==-1&&col==-1))   
        {
                frame.setTitle("YOUR SCORE "+score);
        s=s+btn8.getText();
        raw=3;
        col=3;
        }
       else
       {
         frame.setTitle("Invalid Selection");
           s="";
           raw=-1;
           col=-1;
       }
        }
    if(ae.getActionCommand()=="go")
    {
        if(A.ob.search(s).meaning!=null)
        {  System.out.println(s+" "+s.length());
          score=score+s.length();
          s="";
            frame.setTitle("YOUR SCORE "+score);
        }
        else
        {
            s="";
           frame.setTitle("WORD NOT FOUND ");//+score);  
        }
    }
        


}
} 
class sflac implements ActionListener
{ 

    @Override
    public void actionPerformed(ActionEvent ae) {
              
    }
}



