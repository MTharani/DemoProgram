package com.ass;

import java.util.Scanner;

public class Try 
{
   public static void main(String[] args) 
   {
	   int id;
	   String name, input;
	   Scanner sc= new Scanner(System.in);
	     while(true)
          {
		   System.out.println("enter the id:");
		   id=sc.nextInt();
		   sc.nextLine();
		   System.out.println("Enter the name:");
		   name=sc.nextLine();
		   System.out.println(id);
		   System.out.println(name);
		   System.out.println("are u quit yes/no");
		   input=sc.next();
		   if("yes".equals(input)||"YES".equals(input))
		   {
			   
			   System.out.println("thank you ");
			   break;
		   }
		  
          }	   
}
}
