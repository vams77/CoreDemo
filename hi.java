
public class VowelOrNot {

	public static void main(String[] args) {
		char c;
		Scanner sc = new Scanner(System,in);
		System.out.println(Enter charecter);
		Scanner sc = new Scanner(System,in);
		char c = scan.next().charAt(0);
		
		
		if (c=='A' || c=='a' c=='e' || c=='E' c=='i' ||c=='I' c=='o' || c=='O' c=='u' || c=='U')
		{
System.out.println(c+ "is a vowel");
	}
else
{
	System.out.println(c+ " is not a vowel");
}
}
} 












































 Employee e1=new Employee(); // Object Declaration
   Employee e2=new Employee();

   e1.input();    // method call
   //float s=e1.CalculateSal();
   e1.CalculateSal();
   e1.display();
  // System.out.println("The total salary displayed from class: "+s);

   e2.input();
   float s1=e2.CalculateSal();
   e2.display();
   System.out.println("The total salary displayed from Main: "+s1);