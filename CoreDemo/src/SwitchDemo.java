import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
		int a,b,res;
	    String op;
	   Scanner  s=new Scanner(System.in);
	     System.out.println("Enter 2 numbers :");
	     a=s.nextInt();
	     b=s.nextInt();
	     System.out.println("Enter Operato  :");
	     op=s.next();
	     switch (op)
	     {
	     case "+" : res =a+b;
	     System.out.println("the addition is : "+res);
	     break;
	     
	     
	     case "-" : res =a-b;
	     System.out.println("the subtraction is : "+res);
	     break;
	     
	     
	     case "*" : res =a*b;
	     System.out.println("the multiplication is : "+res);
	     break;
	     
	     
	     case "/" : res =a/b;
	     System.out.println("the division is : "+res);
	     break;
	     
	     default: System.out.println("invalid operator");
	     break;
	     }
	     
	}

}
