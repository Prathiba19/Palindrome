# Palindrome
import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num=sc.nextInt();
		String a=String.valueOf(num);
		StringBuffer a1=new StringBuffer(a);
		StringBuffer a2=new StringBuffer(a1);
		a1.reverse();
		if(String.valueOf(a1).equals(String.valueOf(a2)))
		{
			System.out.println("The integer is a palindrom");
		}
		else{
			System.out.println("Not palindrome");
		}

	}

}
