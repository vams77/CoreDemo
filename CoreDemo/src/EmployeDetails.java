import java.util.Scanner;

public class EmployeDetails {

	public static void main(String[] args) {
		
		String ename,eadd;
		int basic,hra,da,pf,eid,net;

		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter ename : ");
		System.out.println("Enter eid : ");
		ename=sc.nextLine();
		eid=sc.nextInt();
		
		
		
		
		System.out.println("Enter Basic Pay, HRA, Da,pf,  ");
		
		
		
		

		basic=sc.nextInt();
		hra=sc.nextInt();
		da=sc.nextInt();
		pf=sc.nextInt();
		net=(basic+hra+da-pf);
		if (net<0 || basic<0 || hra<0 || da<0 || pf<0)
		{System.out.println("Invalid Salary");
		
		}
		else
		{
		
		System.out.print( " Employee name is :" +ename);
		System.out.print( " Employee eid is "+eid );
		System.out.println(" The Net Salary is : " +net);
	}


	}
}


