package javaLab;

import java.util.Scanner;

public class Matrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please write the size of row: ");
		int m = sc.nextInt();
		System.out.println("please write the size of column: ");
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		int[][] ar = new int[m][n];
		int[][] sumMatr= new int[m][n];
		
		//nhap du lieu cac phan tu cua hai mang
		System.out.println("please write the elements of the first matrices:");
		for(int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
				sumMatr[i][j] = arr[i][j];
				//nhan gia tri cua phan tu mang 1 vao phan tu cua mang tong
			}
		}
		System.out.println("please write the elements of the second matrices:");
		for(int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				ar[i][j] = sc.nextInt();
				sumMatr[i][j]+= ar[i][j];
				//cong gia tri cua mang tong voi mang thu hai
			}
		}
		
		//in ra mang tong 
		for(int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(sumMatr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
