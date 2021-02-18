import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		String name,address;
		int roll,maths,phy,chem;
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter name, rollno and address : ");
		name=sc.nextLine();
		roll=sc.nextInt();
		address=sc.nextLine();
		
		
		System.out.println("Student marks in maths phy chem ");
		
		
		maths=sc.nextInt();
		phy=sc.nextInt();
		chem=sc.nextInt();
		
		
		System.out.print( "student's name is :" +name );
		System.out.print( "student's address is "+roll );
		System.out.print( "student's roll no  is "+address );
		
		int result = (maths+phy+chem)/3;
		
		if(result>=80)
		{
	
			System.out.println(result+ "Result is DISTINCTION " );
			
		}
		
		else if (result>=70)
		{
		
			System.out.println(result+ "Result is FIRST CLASS");
			
			}
		
		
		
		else if(result >=50)
		{
		
		System.out.println(result+ "Result is SECOND CLASS " );
		
		}
		
		
		
		else  
		{
			
		System.out.println(result+ " Result is Fail " );
}
	
}
	
}