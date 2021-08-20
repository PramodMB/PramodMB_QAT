package QSN1;

import java.util.ArrayList;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrL = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " elements");
		for(int i=0;i<n;i++) {
			arrL.add(sc.next());
		}
		System.out.println("Strings after reversing : ");
		for(int j=arrL.size()-1;j>=0;j--) {
			System.out.println(arrL.get(j));
		}
	}
}

	


