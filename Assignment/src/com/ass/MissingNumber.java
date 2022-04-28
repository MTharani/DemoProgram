package com.ass;
/**
 * n=5
 * sum=(n*(n+1))/2=5
 * @author Thara
 *
 */

public class MissingNumber {

	public static void main(String[] args) 
	{
		int arr[]= {1,3,4,5};
		int n=arr.length+1;    //4+1=5
		int sum=(n*(n+1))/2;   //(5*(5+1))/2=15
		for(int i=0;i<arr.length;i++)
		{
			sum=sum-arr[i];  
		}
		System.out.println("missing number is: "+sum);

	}

}




/**
*i=0;
*sum=15-1=14
*i=1
*sum=14-3=11
*i=2
*sum=11-4=7;
*i=3
*sum=7-5=2;
*sum primt the 2
*/
