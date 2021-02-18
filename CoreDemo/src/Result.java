import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		String name;
		int roll,maths,phy,chem;
		String result;
		int c;
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter name : ");
		System.out.println("Enter roll no : ");
		name=sc.nextLine();
		roll=sc.nextInt();
		
		
		
		System.out.println("Student marks in maths phy chem ");
		
		
		maths=sc.nextInt();
		phy=sc.nextInt();
		chem=sc.nextInt();
		
		System.out.print( "Student's name is:"+name );
		System.out.print( " Student's roll number is:"+roll );
		c=maths+phy+chem;
		
	     c=(maths+phy+chem);
		 if (maths <40 || phy <40 || chem<40)
		    	{
				
			    System.out.println(" The result of student is FAIL" +c);

	          	}
		
		else if (c>40 && c<60)
		{
			System.out.println(" The result is THIRD CLASS : " +c );
		}
		 
		else if (c>60 && c<70)
		{
			System.out.println(" The result is SECOND CLASS : " +c );	
		}

		else if (c>70 && c<80)
		{
			System.out.println(" The result is FIRST CLASS : " +c );
		}
		
		else 
		{
			System.out.println(" The result is DISTINCTION : " +c );
		}
		
		
		
		
	}
}

