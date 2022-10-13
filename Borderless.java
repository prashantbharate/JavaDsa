/*
i.p
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16n'jr4	`

hint:
In the sample test case, the elements which do not lie at the border,
 are {6,7,10,11}. Therefore, the sum of the elements are => 6 + 7 + 10 + 11 = 34, 
which is the required answer.

op;
34
*/


public class Borderless
{
	public static void main(String[] args) {
	    int m=4,n=4;  //2D array 4*4 
	    
	    int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	    
	    int sum=0;
	    
	    for(int i=1;i<m-1; i++)
	    {
	        for(int j=1;j<n-1; j++)
	        {
	            sum=sum+arr[i][j];   //this will add borderless 
	                                 //numbers in sum
	        }
	    }
	    System.out.println(sum);
	}
}
