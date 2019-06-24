import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		Scanner jee=new Scanner(System.in);
		String a=jee.nextLine();
		//System.out.println("%n",RemoveDuplicateCharacters(a));
		char b[]=a.toCharArray();
		int i,c=0,j;
      for(i=0;i<a.length();i++)
		{
		  for(j=i+1;j<a.length();j++)
		  {
		      if(b[i]==b[j])
		      {
		      c++;
		      }
		  }
		  
	}
	System.out.println(a.length()-c);
	}
}

