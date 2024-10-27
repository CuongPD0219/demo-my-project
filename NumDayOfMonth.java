package javaLab;

import java.util.Scanner;

public class NumDayOfMonth {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write month: ");
		String mOnth = sc.next();
		System.out.println("please write year");
		int yEar = sc.nextInt();
		switch(mOnth) {
			case "Jan.", "Jan","1","January":
			case "Mar.","March","Mar","3":
			case "May","5":
			case "July","Jul","7":
			case "Aug.","Aug","August","8":
			case "Oct.","Oct","Octorber","10":
			case "Dec.","Dec","12","December":
				System.out.println("The numers of days of month: 31");
				break;
			
			case "Apr.","Apr","April","4":
			case "June","Jun","6":
			case "Sept.","Sep","September","9":
			case "Nov.","Nov","November","11":
				System.out.println("The numbers of days of month: 30");
				break;
			
			case "Feb","Feb.","2","Febuary":
				if ((yEar %400 == 0)||(yEar %4 == 0 && yEar %100 != 0)) {
					System.out.print("The numbers of days of month: 29");
			}
				else System.out.println("The numbers of days of month: 28");
				break;
			default :
				System.out.println("Invalid month entered");
				break;
		}
		sc.close();
	}
} 
