import java.util.Scanner;

class trainee
{
	String tname;
	int tid;
	String technology;
	Float salary;

	


void input() {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter name id technology salary");
	tname=sc.next();
	tid=sc.nextInt();
	technology=sc.next();
	salary=sc.nextFloat();
	
}

void display()
{
	System.out.println(" Trainee Details ");
	System.out.println(" Trainee name " +tname);
	System.out.println("Trainee id " +tid);
	System.out.println(" Trainee technology " +technology);
	System.out.println(" Trainee salary " +salary);
	
}
	
}


 class TestTrainee1 {

	public static void main(String[] args) {
		trainee t1=new trainee();
		t1.input();
		t1.display();
		trainee t2=new trainee();
		t2.input();
		t2.display();
		