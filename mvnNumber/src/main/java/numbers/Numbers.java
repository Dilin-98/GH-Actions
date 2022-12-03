package numbers;

import java.util.Scanner;

public class Numbers {
		int total;
	public int sum(int i,int j){
		System.out.println("The Sum is ");
				return i+j;
				
	}
	public static void main(String[] args) {
		Numbers n = new Numbers();
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println(n.sum(a,b));

	}

}
