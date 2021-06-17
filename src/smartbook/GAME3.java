
package smartbook;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.util.Random;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import org.icepdf.core.exceptions.PDFException;



public class GAME3 implements ActionListener {
        DICTIONARY A= new DICTIONARY();
        int[][] arr=new int[9][2];
        int[][] mat1=new int[3][3];
        char[][] mat=new char[3][3];
        int len=0;
        String s="";int raw=-1,col=-1,score=0 ;
        JFrame frame = new JFrame("YOUR SCORE "+score);
        JButton[][] btn = new JButton[3][3];
        JPanel[] panel =new JPanel[3];
       JButton sfl= new JButton("Suffle");
       MyButton go= new MyButton("C:\\Users\\Hridoy\\Downloads\\go.jpg");
        GAME2 ob2;
        String st;int pq,qp;
     GAME3(String _s,int _pq,int _qp) {
         st=_s;pq=_pq; qp=_qp;
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(510,570);
        int first=10;
        btn[0][0]=new JButton("G"); btn[0][1]=new JButton("O"); btn[0][2]=new JButton("O");
        btn[1][0]=new JButton("L"); btn[1][1]=new JButton("U"); btn[1][2]=new JButton("D");
        btn[2][0]=new JButton("A"); btn[2][1]=new JButton("C"); btn[2][2]=new JButton("K");
         for (int i=0; i <3; i++) {
                   
                   panel[i]=new JPanel();
                   panel[i].setLocation(0,0+i*51);
                   panel[i].setSize(200,50);
                   panel[i].setBackground(Color.black);
                  // frame.add(panel[i]);
                   int sec=10;
                  for (int j=0; j <3; j++) {
                                
                                mat1[i][j] = 1;
                                btn[i][j].setLocation(sec,first);
                                btn[i][j].setSize(150,150);
                               // panel[i].add(btn[i][j]);
                                frame.add(btn[i][j]);
                                btn[i][j].setFont(new Font("Arial", Font.BOLD, 40));
                                btn[i][j].setBackground(new Color(51,153,255));
                                btn[i][j].addActionListener(this);
                                btn[i][j].setActionCommand("btn");
                                sec=sec+160;
                       }
                  first=first+160;

                 }

       // go.setBackground(new Color(51,153,255));
           for(int i=0;i<9;i++)
           {
               arr[i][0]=-1;
               arr[i][1]=-1;
           }
        sfl.setLocation(30,153);
        sfl.setSize(70,30);
        go.setLocation(200,490);
        go.setSize(70,30);
       // frame.add(sfl);
       frame.add(go);
       sfl.addActionListener(this);
       sfl.setActionCommand("sfl");
       go.addActionListener(this);
       go.setActionCommand("go");     
       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
       frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        new GAME3("C:\\Users\\Hridoy\\Documents\\NetBeansProjects\\java_tutorial.pdf",1,2);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand()=="btn")
        {
           int i=0,j=0;
          for (i=0; i <3; i++) {
              int flag=0;
                  for (j=0; j <3; j++) { 
                      if(btn[i][j]==ae.getSource())
                      {
                         flag=1; 
                          break;
                      }
                  }
                  if(flag==1)
                      break;
                  } 
       if((raw==i&&(col-j)==1||(col-j)==-1)||(col==j&&(raw-i)==1||(raw-i)==-1)||(raw==-1&&col==-1))
        {
       frame.setTitle("YOUR SCORE "+score);
        s=s+btn[i][j].getText();
        raw=i;
        col=j;
        arr[len][0]=raw;
        arr[len][1]=col;
        len++;
        }
       else
       {
         frame.setTitle("Invalid Selection");
           s="";
           for(int k=0;k<len;k++)
           {
               arr[k][0]=-1;
               arr[k][1]=-1;
           }
           len=0;
           raw=-1;
           col=-1;
       }
        }
if(ae.getActionCommand()=="go")
    {
        
        if(A.ob.search(s).meaning!=null&&A.ob.search(s).key.length()==s.length())          
        { 
          for(int i=0;i<len;i++)
            { 
                System.out.println(arr[len][0]+" hi "+arr[len][1]+"\n");
                mat1[arr[i][0]][arr[i][1]]=0;
                btn[arr[i][0]][arr[i][1]].setBackground(Color.GREEN); 
               if(arr[i][0]==1&&arr[i][1]==1)
               {
                   mat1[arr[i][0]][arr[i][1]]=0;
                   btn[arr[i][0]][arr[i][1]].setBackground(Color.GREEN); 
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
        int flag=0;
          for (int i=0; i <3; i++) {
                  for (int j=0; j <3; j++) { 
                      if(mat1[i][j]==1)
                          flag=1;
                  }      
          }
         //   System.out.println("hiiiii\n"+flag);
          if(flag==0)
          {
            
               try {
           Random rand1 = new Random();
           GAME1 ob= new GAME1(st,pq,qp,A);
            ob2=new GAME2(rand1.nextInt(4),ob.two,ob.three,ob.four,ob.tw,ob.thre,ob.fou);
               }
           catch (PDFException ex) {
                   }
                mat=ob2.mat;
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        btn[i][j].setBackground(new Color(51,153,255));
                        btn[i][j].setText(String.valueOf(mat[i][j]));
                        mat1[i][j]=1;
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
    }
