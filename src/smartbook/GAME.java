package smartbook;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import org.icepdf.core.exceptions.PDFException;



public class GAME implements ActionListener {
        DICTIONARY A= new DICTIONARY();
        int[][] arr=new int[9][2];
        char[][] mat=new char[3][3];
        int len=0;
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
         GAME2 ob2;
         String st;int pq,qp;
     GAME(String _s,int _pq,int _qp) {
         st=_s;pq=_pq; qp=_qp;
           for(int i=0;i<9;i++)
           {
               arr[i][0]=-1;
               arr[i][1]=-1;
             System.out.println(arr[len][0]+" hi2 "+arr[len][1]+"\n");
           }
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
       sfl.addActionListener(this);
       sfl.setActionCommand("sfl");
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
        arr[len][0]=raw;
        arr[len][1]=col;
        len++;
        }
       else
       {
           frame.setTitle("Invalid Selection");
           s="";
           len=0;
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
        arr[len][0]=raw;
        arr[len][1]=col;
        len++;
        }
       else
       {
           frame.setTitle("Invalid Selection");
           s="";
           len=0;
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
        arr[len][0]=raw;
        arr[len][1]=col;
        len++;
        }
       else
       {
         frame.setTitle("Invalid Selection");
           s="";
           len=0;
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
        arr[len][0]=raw;
        arr[len][1]=col;
        len++;
        }
       else
       {
         frame.setTitle("Invalid Selection");
           s="";
           len=0;
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
        arr[len][0]=raw;
        arr[len][1]=col;
        len++;
        }
       else
       {
         frame.setTitle("Invalid Selection");
           s="";
           for(int i=0;i<len;i++)
           {
               arr[i][0]=-1;
               arr[i][1]=-1;
           }
           len=0;
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
        arr[len][0]=raw;
        arr[len][1]=col;
        len++;
        }
       else
       {
         frame.setTitle("Invalid Selection");
           s="";
           for(int i=0;i<len;i++)
           {
               arr[i][0]=-1;
               arr[i][1]=-1;
           }
           len=0;
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
        arr[len][0]=raw;
        arr[len][1]=col;
        len++;
        }
       else
       {
          
         frame.setTitle("Invalid Selection");
           s="";
           for(int i=0;i<len;i++)
           {
               arr[i][0]=-1;
               arr[i][1]=-1;
           }
           len=0;
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
        arr[len][0]=raw;
        arr[len][1]=col;
        len++;
        }
       else
       {
         frame.setTitle("Invalid Selection");
           s="";
           for(int i=0;i<len;i++)
           {
               arr[i][0]=-1;
               arr[i][1]=-1;
           }
           len=0;
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
        arr[len][0]=raw;
        arr[len][1]=col;
        len++;
        }
       else
       {
         frame.setTitle("Invalid Selection");
           s="";
           for(int i=0;i<len;i++)
           {
               arr[i][0]=-1;
               arr[i][1]=-1;
           }
           len=0;
           raw=-1;
           col=-1;
       }
        }
    if(ae.getActionCommand()=="go")
    {
        if( A.ob.search(s).meaning!=null&&A.ob.search(s).key.length()==s.length())          
        { 
            for(int i=0;i<len;i++)
            { 
                System.out.println(arr[len][0]+" hi "+arr[len][1]+"\n");
               int p;
                Random rand = new Random();
                p=rand.nextInt(25);
                String q=new String();
               q=String.valueOf((char)('A'+p));
               if(arr[i][0]==1&&arr[i][1]==1)
               {
                   btn.setText(q);  
               }
               if(arr[i][0]==1&&arr[i][1]==2)
               {
                   btn1.setText(q);  
               }
               if(arr[i][0]==1&&arr[i][1]==3)
               {
                   btn2.setText(q);  
               }
               if(arr[i][0]==2&&arr[i][1]==1)
               {
                   btn3.setText(q);  
               }
               if(arr[i][0]==2&&arr[i][1]==2)
               {
                   btn4.setText(q);  
               }
               if(arr[i][0]==2&&arr[i][1]==3)
               {
                   btn5.setText(q);  
               }                 
               if(arr[i][0]==3&&arr[i][1]==1)
               {
                   btn6.setText(q);  
               }
               if(arr[i][0]==3&&arr[i][1]==2)
               {
                   btn7.setText(q);  
               }
               if(arr[i][0]==3&&arr[i][1]==3)
               {
                   btn8.setText(q);  
               }
            }
          
          score=score+s.length();
          s="";
           for(int i=0;i<len;i++)
           {
               arr[i][0]=-1;
               arr[i][1]=-1;
           }
           len=0;
            frame.setTitle("YOUR SCORE "+score);
            raw=-1;col=-1;
        }
        else
        {
            s="";
           for(int i=0;i<len;i++)
           {
               arr[i][0]=-1;
               arr[i][1]=-1;
           }
           len=0;
           frame.setTitle("WORD NOT FOUND ");
           raw=-1;col=-1;
        }
    }
 if(ae.getActionCommand()=="sfl")
        {
               try {
           Random rand1 = new Random();
           GAME1 ob= new GAME1(st,pq,qp,A);
            ob2=new GAME2(rand1.nextInt(4),ob.two,ob.three,ob.four,ob.tw,ob.thre,ob.fou);
               }
           catch (PDFException ex) {
                   }
            mat=ob2.mat;
                String q=new String();
                for(int _int=0;_int<3;_int++)
                {
                int p,i=0;
                Random rand = new Random();
                p=rand.nextInt(25);
                 for(int _i=0;_i<3;_i++)
                {
                    if(_int==0)
                    {
                      i=_i;  
                    }
                    else if(_int ==1)
                    {
                       i=3+_i; 
                    }
                    else
                    {
                      i=6+_i;
                    }
                     q=String.valueOf(mat[_int][_i]);
               if(i==0)
               btn.setText(q);  
               if(i==1)
               btn1.setText(q); 
               if(i==2)
               btn2.setText(q); 
               if(i==3)
               btn3.setText(q);
               if(i==4)
               btn4.setText(q); 
               if(i==5)
               btn5.setText(q); 
               if(i==6)
               btn6.setText(q);
               if(i==7)
               btn7.setText(q); 
               if(i==8)
               btn8.setText(q);
                }
                }
                           
              
            s="";
           for(int i=0;i<len;i++)
           {
               arr[i][0]=-1;
               arr[i][1]=-1;
           }
           len=0;
           raw=-1;col=-1;

        }
} 
}