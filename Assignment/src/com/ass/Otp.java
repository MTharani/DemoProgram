package com.ass;

public class Otp {

	

	private static void generateOtp() 
	{
		int max=9000;
		int min=1000;
		int range=max-min+1;
		int otppin=(int) ((Math.random()*range)+min);
		System.out.println(otppin);
		
	}
	public static void main(String[] args) {
		generateOtp();

	}

}
