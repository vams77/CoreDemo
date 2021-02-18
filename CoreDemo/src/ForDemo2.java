import java.util.Scanner;

public class ForDemo2 {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		
		for(i=1; i<=n; i++)
		{
		n=(n+i);
		}
		System.out.println("the sum is " +n);
		
		
		

	}

}
