package CTF011038.JAVAPart2.Array;

public class JAVA_Array {
public static void main(String[] args) {
	Employee[] employees = new Employee[3];
	for (int i=0; i<employees.length; i++) {
		employees[i]=new Employee("Firstname"+i,"Lastname"+i,i*10000);
	}
	System.out.println(employees[1].firstName);
	System.out.println(employees[1].lastName);
	System.out.println(employees[2].firstName);
}
}