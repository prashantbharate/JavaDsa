/*
masai
school
masai

OP
masai 2
school 1
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
    
    String[] str={"masai","school","masai"};
    HashMap<String,Integer> hm=new HashMap<>();
    for(int i=0;i<str.length; i++)
    {
        if(hm.containsKey(str[i]))
        {
            int c=hm.get(str[i])+1;
            hm.put(str[i],c);
        }
        else{
            hm.put(str[i],1);
        }
    }
    
        for (Map.Entry<String, Integer> entry : hm.entrySet()) 
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    
	}
}
