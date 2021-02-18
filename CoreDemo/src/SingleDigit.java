import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		int a;
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter  Number : ");
		a=sc.nextInt();
		
		
		if (a<10 && a>-10)
		{
		System.out.println(a+ "is single digit");
	}

		else
		{
			System.out.println(a+ "is not a single digit");
		}
}

}