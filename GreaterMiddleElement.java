/*

ip:
8
1 2 3 4 2 1 6 5
op:
2
In this case, 4 is bigger than both its neighbour 3 and 2.
Similarly 6 is bigger than both its neighbour 5 and 1.

So, the answer is 2.

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
    
    int[] arr={1,2,3,4,0,5,6};
    
    for(int i=0; i<arr.length-1; i++)
    {
        if(arr[i] > arr[i+1] && arr[i] > arr[i-1])
        {
            System.out.println(arr[i]);
            //break;
        }
    }
    
	}
}
