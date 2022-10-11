/*
IP
5
aabbc
3
abc

output
Equals character Available in both the Strings
*/


import java.util.*;
public class EqulaStrings
{
	public static void main(String[] args) {
		
		String s1="abccba";
		String s2="abc";
		
	      HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char x=s1.charAt(i);
            if(map.get(x)==null){
                map.put(x,1);
            }else{
                int count=map.get(x)+1;
                map.put(x,count);
            }
        }
		for(int i=0; i<s2.length(); i++)
		{
		    if(!map.containsKey(s2.charAt(i)))
		    {
		        System.out.println("Not Equals character Available in both the Strings");
		    }
		}
		System.out.println("Equals character Available in both the Strings");
	}
}
