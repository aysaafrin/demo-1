package Bike;

import java.util.Scanner;

public class Test1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("enter string");
  java.lang.String str=sc.nextLine();
  splitwords(str);
  
  
	}
	private static void splitwords(java.lang.String str) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ') {
			   count++;
			}
		}
	java.lang.String temp="";
	int k=0;
	java.lang.String arr[]=new String[count+1];
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)!=' ') {
			temp=temp+str.charAt(i);
	}
		else {
			arr[k]=temp;
			k++;
		}
		}
	}

}
