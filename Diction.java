package smartbook;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class ans{
     String key;
     String meaning;
     
};
class Trie
{
	String isLeaf;
	List<Trie> children = null;
	Trie() {
		isLeaf = null;
		children = new ArrayList<>();
		for (int i = 0; i <28; i++)
			children.add(null);
	}

	public void insert(String key,String key2)
	{
            int ch;
		System.out.println("Inserting \"" + key + "\"");
		Trie curr = this;
		for (int i = 0; i < key.length(); i++)
		{
                    if(key.charAt(i)>='A'&&key.charAt(i)<='Z')
                    {
                      ch=(key.charAt(i)-'A');
                    }
                        
                    else if(key.charAt(i)>='a'&&key.charAt(i)<='z')
                        ch=key.charAt(i)-'a';
                    else
                        ch=27;
                    
		    if (curr.children.get(ch)== null)
			curr.children.set(ch, new Trie());
		    curr = curr.children.get(ch);
		}
		curr.isLeaf =key2;                  

	}

	public ans search(String KEY)
	{
            String key="";
            for (int i = 0; i < KEY.length(); i++)
		{
                   if(KEY.charAt(i)>='A'&&KEY.charAt(i)<='Z') 
                   {
                       key=key+String.valueOf((char)('a'+KEY.charAt(i)-'A'));
                   }
                   else if(KEY.charAt(i)>='a'&&KEY.charAt(i)<='z')
                   {
                       key=key+KEY.charAt(i);
                   }
                   else 
                       ;
                }
                ans ob = new ans();
		System.out.print("Searching \"" + key + "\" : ");
                String susmoy=null,sus=null;
		Trie curr = this;
		for (int i = 0; i < key.length(); i++)
		{
                   if(curr.isLeaf==null)
                    {
                        
                    }
                    else
                    {
                        sus=null;
                         for(int k=0;k<i;k++)
                           {
                               if(sus==null)
                                   sus=String.valueOf(key.charAt(k));
                               else
                              sus=sus+String.valueOf(key.charAt(k));
                            }
                        susmoy=curr.isLeaf;
                    }
			curr = curr.children.get(key.charAt(i)-'a');
			if (curr == null)
                        {
                            ob.key=sus;
                            ob.meaning=susmoy;
                            return ob;
                        }
		}
                if(curr.isLeaf==null)
                {
                       ob.key=sus;
                       ob.meaning=susmoy;
                       return ob;                    
                }
                else
                {
                 ob.key=key;
                 ob.meaning=curr.isLeaf;
		 return ob;                   
                }

	}
};
class A
{
  A(Trie trie)
  {
           try {
            FileReader reader = new FileReader("A.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int flag=0;String s1=null,s2=null; 
                for(int i=0;i<line.length();i++)
                {
                  if(flag<2)
                    {
                    if(line.charAt(i)=='|')
                     {
                        flag++;
                     }
                     else
                     {
                         if(s1!=null)
                         s1=s1+String.valueOf((char)(line.charAt(i)));
                         else
                             s1=String.valueOf((char)(line.charAt(i)));
                     }
                     
                    }
                  else
                  {
                      if(s2!=null)
                          s2=s2+String.valueOf((char)(line.charAt(i)));
                      else
                         s2=String.valueOf((char)(line.charAt(i))); 
                  }
                      
                }
                System.out.println("hi"+s1+"h1"+s2+"\n");
                trie.insert(s1,s2);
                //int c= bufferedReader.read();
               

            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }   
  }
};
class B
{
  B(Trie trie)
  {
           try {
            FileReader reader = new FileReader("NewWord.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                int flag=0;String s1=null,s2=null; 
                for(int i=0;i<line.length();i++)
                {
                  if(flag<2)
                    {
                    if(line.charAt(i)=='|')
                     {
                        flag++;
                     }
                     else
                     {
                         if(s1!=null)
                         s1=s1+String.valueOf((char)(line.charAt(i)));
                         else
                             s1=String.valueOf((char)(line.charAt(i)));
                     }
                     
                    }
                  else
                  {
                      if(s2!=null)
                          s2=s2+String.valueOf((char)(line.charAt(i)));
                      else
                         s2=String.valueOf((char)(line.charAt(i))); 
                  }
                      
                }
                System.out.println("hi"+s1+"h1"+s2+"\n");
                trie.insert(s1,s2);
                //int c= bufferedReader.read();
               

            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }   
  }
};
public class Diction
{

       Trie ob=new Trie();
       Diction()
       {
       new A(ob);
       new B(ob);
       }
            
}