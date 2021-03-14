package CTF011038.JAVAPart2.Array;

public class Employee {
	String firstName;
	String lastName;
	int salary;
	
public Employee(String firstNameInput,String lastNameInput, int salaryInput) {
	firstName = firstNameInput;
	lastName = lastNameInput;
	salary = salaryInput;
			
}

public void hello() {
	System.out.println("Hi, I am "+firstName);
}

}
