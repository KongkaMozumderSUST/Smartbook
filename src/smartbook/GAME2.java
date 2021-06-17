
package smartbook;
import java.util.Random;

public class GAME2 {
     Random rand = new Random();
     int i=0;
    char[][] mat= new char[3][3];;
    GAME2(int j,String[] two,String[] three,String[] four,int tw,int thre,int fou)
    {
        if(j==0)
            j++;
       if(j==1)
       {
          
               i=rand.nextInt(tw);
               mat[2][0]=two[i].charAt(0);mat[2][1]=two[i].charAt(1);
               i=rand.nextInt(thre);
               mat[0][0]=three[i].charAt(0);mat[0][1]=three[i].charAt(1);mat[0][2]=three[i].charAt(2);
               i=rand.nextInt(fou);
               mat[1][0]=four[i].charAt(0);mat[1][1]=four[i].charAt(1);mat[1][2]=four[i].charAt(2);mat[2][2]=four[i].charAt(3);
       }
       if(j==2)
       {
          
               i=rand.nextInt(tw);
               mat[1][2]=two[i].charAt(0);mat[2][2]=two[i].charAt(1);
               i=rand.nextInt(thre);
               mat[0][0]=three[i].charAt(0);mat[1][0]=three[i].charAt(1);mat[2][0]=three[i].charAt(2);
               i=rand.nextInt(fou);
               mat[2][1]=four[i].charAt(0);mat[1][1]=four[i].charAt(1);mat[0][1]=four[i].charAt(2);mat[0][2]=four[i].charAt(3);
       }
       if(j==3)
       {
          
               i=rand.nextInt(tw);
               mat[2][2]=two[i].charAt(0);mat[2][1]=two[i].charAt(1);
               i=rand.nextInt(thre);
               mat[2][0]=three[i].charAt(0);mat[1][0]=three[i].charAt(1);mat[1][1]=three[i].charAt(2);
               i=rand.nextInt(fou);
               mat[0][0]=four[i].charAt(0);mat[0][1]=four[i].charAt(1);mat[0][2]=four[i].charAt(2);mat[1][2]=four[i].charAt(3);
       }
       if(j==4)
       {
          
               i=rand.nextInt(tw);
               mat[0][1]=two[i].charAt(0);mat[0][0]=two[i].charAt(1);
               i=rand.nextInt(thre);
               mat[2][2]=three[i].charAt(0);mat[2][1]=three[i].charAt(1);mat[2][0]=three[i].charAt(2);
               i=rand.nextInt(fou);
               mat[0][2]=four[i].charAt(0);mat[1][2]=four[i].charAt(1);mat[1][1]=four[i].charAt(2);mat[1][0]=four[i].charAt(3);
       }
       
    }
}
