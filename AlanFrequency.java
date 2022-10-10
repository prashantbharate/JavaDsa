/*
4
aman


a-2
m-1
n-1

*/


import java.util.*;
public class AlanFrequency
{
  public static void main (String[]args)
  {
    int a = 4;
    String b = "aman";
      HashMap < Character, Integer > map = new HashMap <> ();
    char[] ch = b.toCharArray ();
    for (char c:ch)
      {
	if (map.containsKey (c))
	  {
	    int count = map.get (c) + 1;
	      map.put (c, count);
	  }
	else
	  {
	    map.put (c, 1);
	  }
      }
  for (Map.Entry entry:map.entrySet ())
      {
	System.out.println (entry.getKey () + "-" + entry.getValue ());
      }

  }
}