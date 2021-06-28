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
	public static void data(){
		new Employee("Jake", "Harper").display();
		new Employee("Ebing", "Jonas").display();
		new Employee("Hella", "Clark").display();

	}
}
public class HelloWorld
{
	public static void main(String... args){
		System.out.println("Hello, Jenkins Users");
		Employee.data();
	}
}