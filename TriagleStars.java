package javaLab;

import java.util.Scanner;

public class TriagleStars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
			for (int k =n-i;k>0;k--) {
				System.out.print(" ");
			}
			for(int j = 1;j <= 2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}