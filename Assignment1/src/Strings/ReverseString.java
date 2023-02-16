package Strings;

import java.util.Scanner;

public class ReverseString {
	public static void ReversString(char[] str) {
		String str1;
		int l=0,r=str.length-1;
		while(l<r) {
			if(!Character.isAlphabetic(str[l]))
				l++;
			else if(!Character.isAlphabetic(str[r]))
				r--;
			else {
				char temp=str[l];
				str[l]=str[r];
				str[r]=temp;
				
				l++; 
				r--;
				
			
			}
		}
		
		//return str;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any string :");
		String str1=scan.nextLine();
		char[] c=str1.toCharArray();
		ReversString(c);
		 String Str1 = new String(c);
		 System.out.println("Arrayyyyy :"+Str1);
		 
		
	}

}

