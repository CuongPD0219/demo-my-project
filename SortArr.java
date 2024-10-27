package javaLab;

import java.util.Scanner;

public class SortArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write the size of array: ");
		int nUm = sc.nextInt();
		int[] a = new int[nUm];
		int sumArr = 0;
		System.out.println("Please write the elements of array: ");
		for (int i=0; i<nUm;i++) {
			//nhap cac du lieu cua mang
			a[i] = sc.nextInt();
			sumArr += a[i];
		}
		
		for (int i =0;i<nUm;i++) {
			for(int j =i+1;j<nUm ;j++) {
				//thuc hien cong viec sap xep cac phan tu theo thu tu tang dan
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.print("The array is after sorting: [");
		for (int i =0; i<nUm;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		System.out.println("\nThe average value of array is: "+a[nUm/2]);
		System.out.println("The sum of array is: "+sumArr);
		sc.close();
	}
	
	
}
