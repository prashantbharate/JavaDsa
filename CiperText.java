/*
IP:
aabcc
aazaa

OP:
a2b1c2
a2z1a1

*/


import java.util.*;
public class CiperText
{
	public static void main(String[] args) {
	  String s="aabbccd";
	  String output="";
	  char[] ch=s.toCharArray();
	  
	  for(int i=0; i<s.length(); i++)
	  {
	      int c=1;
	      while((i+1)<s.length() && ch[i+1]== ch[i])
	      {
	          c++;
	          i++;
	      }
	      output=output+ch[i]+Integer.toString(c);
	  }
	  System.out.println(output);
	}
}