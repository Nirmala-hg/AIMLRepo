package com.mphasis.billsystem;

public class BillCalculator {

	public static void main(String[] args) {
			int units = 288; 
			double billToPay = 0;
			if(units < 100)
			{
			 billToPay = units*1.20;
			}
			else if(units < 300)
			{
			billToPay =100*1.28+ (units - 100)*2;
			}
			System.out.println("The electricity bill for" +units+  "is" +billToPay);

			}

	}

