/*

IP-
2
5
12 14 16 17 29
6
1 2 3 4 5 51

HINT:
In the first sample test case, the sum of digits for various values, is as given below
12 -> 1 + 2 = 3
14 -> 1 + 4 = 5
16 -> 1 + 6 = 7
17 -> 1 + 7 = 8
29 -> 2 + 9 = 11
Therefore, the output is '3 5 7 8 11'.
Similarly, the output in the second test case is1 2 3 4 5 6

OP-
3 5 7 8 11 
1 2 3 4 5 6 

*/

class SumDigit {
    public static void main(String[] args) {
        int[] arr={12,23,43,4,3,43};
	   
	   for(int i=0; i<arr.length; i++)
	   {
	       int ans=checkthe(arr[i]);
	       System.out.print(ans+" ");
	   }
	   
    }
    public static int checkthe(int n)
    {
       int sum=0;
       for(int i=n;i>0; i=i/10)
       {
           sum=sum+n%10;
       }
       return sum;
    }
}