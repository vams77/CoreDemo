import java.util.Scanner;

public class GreatestThree {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter 3 Numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	
	if (a>b && a>c)
	{
		System.out.println(a+ "is the greatest number ");
	}
	
	else if (b>c)
	{
		System.out.println(b+ "is greatest number");
	}
	else 
	{
		System.out.println(c+ "is greatest number");
	}
}
}
