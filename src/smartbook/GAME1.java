
package smartbook;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.text.PDFTextStripper;
import org.icepdf.core.exceptions.PDFException;
import org.icepdf.core.exceptions.PDFSecurityException;
import org.icepdf.core.pobjects.Document;
import org.icepdf.core.pobjects.graphics.text.PageText;

public class GAME1 {
    DICTIONARY A;//= new Dictionary();
    Document doc = new Document();
    String text= new String();
    String[] two=new String[1500];
    String[] three=new String[1500];
    String[] four=new String[1500];
    int tw=0,thre=0,fou=0;
    GAME1(String s,int i,int j, DICTIONARY B) throws PDFException
    {
        A=B;
         text="";
        try {
            doc.setFile(s);
            for(int k=i;k<=j;k++)
              text=text+doc.getPageText(k);
        } catch (PDFSecurityException ex) {
            Logger.getLogger(GAME1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GAME1.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int k=0;k<text.length();k++)
        { 
            if((text.charAt(k)-'a'>=0&&text.charAt(k)-'a'<=25)||(text.charAt(k)-'A'>=0&&text.charAt(k)-'A'<=25))
            {
               ; 
            }
            else
            {
               j=k-1;
                String temp=new String ();
                temp="";
                while(j>=0)
                {
                    if(j<0)
                        break;
                    else if(text.charAt(j)-'a'>=0&&text.charAt(j)-'a'<=25)
                    {
                     ;
                    }
                    else if(text.charAt(j)-'A'>=0&&text.charAt(j)-'A'<=25)
                    {
                      ;
                    }
                    else
                        break;
                    j--;
                }
                 for(int p=j+1;p<k;p++)
                     temp=temp+String.valueOf(text.charAt(p));
                if(temp.length()==2&&A.ob.search(temp).meaning!=null&&A.ob.search(temp).key.length()==temp.length())
                {
                    int flag=0;
                    for(int p=0;p<tw;p++)
                    {
                       if(two[p].equals(temp))
                       {
                          flag=1;  
                       }
                          
                    }
                    if(flag==0&&tw<1010)
                    {
                        two[tw]=temp;tw++; 
                    }
                   
                }
                else if(temp.length()==3&&A.ob.search(temp).meaning!=null&&A.ob.search(temp).key.length()==temp.length())
                {
                    int flag=0;
                    for(int p=0;p<thre;p++)
                    {
                       if( three[p].equals(temp))
                       {
                           flag=1;
                       }
                    }
                    if(flag==0&&thre<1010)
                    {
                   three[thre]=temp;thre++;
                    }
                }
                else if(temp.length()==4&&A.ob.search(temp).meaning!=null&&A.ob.search(temp).key.length()==temp.length())
                {
                    int flag=0;
                    for(int p=0;p<fou;p++)
                    {
                       if( four[p].equals(temp))
                       {
                           flag=1;
                       }
                    }
                    if(flag==0&&fou<1010)
                    {
                   four[fou]=temp;fou++; 
                    }
                }
            }
        }
    }
}

