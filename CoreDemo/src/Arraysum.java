import java.util.Arrays;
import java.util.Scanner;
public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, sum =0;
		Scanner s = new Scanner (System.in);
		
		System.out.println("enter no of elements you want in array : ");
		n=s.nextInt();
		int a[]= new int [n];
		
		System.out.println("enter all elements : ");
		for(int i=0; i<n; i++)
		{
			a[i]= s.nextInt();
			sum=sum+a[i];
			
			
		}
		System.out.println("sum :" +sum);
		
	}

}
