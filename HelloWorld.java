class Employee
{
	private String fname;
	private String lname;

	public Employee(String fname, String lname){
		this.fname=fname;
		this.lname=lname;
	}
	public void display(){
		System.out.println("Your first name is: "+this.fname+" and last name is: "+this.lname);
	}
}
public class HelloWorld
{
	public static void main(String... args){
		System.out.println("Hello, Jenkins Users");
		new Employee("Jake", "Harper").display();
	}
}