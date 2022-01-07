package Bike;

import java.util.Scanner;

public class Array {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("enter number of rows");
  int rows=sc.nextInt();
  int arr[][]=new int[rows][rows];
  arr=getElements(arr);
  int arr1[][]=swap(arr);
  display(arr1);
  
	}
	private static void display(int[][] arr1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static int[][] swap(int[][] arr) {
		// TODO Auto-generated method stub
		System.out.println("enter rows to be exchanged");
		int n=sc.nextInt();
		for (int i = 0;  i< arr.length; i++) {
			int s=arr.length;
			int temp=arr[(n-1)][i];
			arr[(n-1)][i]=arr[i][(s-i)-1];
			arr[i][(s-i)-1]=temp;
			}
		
		return arr;
	}
	private static int[][] getElements(int[][] arr) {
		// TODO Auto-generated method stub
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}

}
