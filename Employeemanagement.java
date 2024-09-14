package task_4;

import java.util.HashMap;
import java.util.Scanner;

public class Employeemanagement
{
	
	public static void main(String[] args) 
	{
		 HashMap<Integer, Employee> employeeMap = new HashMap<>();
	        Scanner scanner = new Scanner(System.in);

	        employeeMap.put(101, new Employee("ram",23, "HR"));
	        employeeMap.put(102, new Employee("Balu",32, "Engineering"));
	        employeeMap.put(103, new Employee("Chandu",29, "Marketing"));
            
	        System.out.print("Enter Employee ID to get details: ");
	        int empId = scanner.nextInt();
	        
	        Employee employee = employeeMap.get(empId);
	        if (employee != null) 
	        {
	            System.out.println("Employee Details for ID " + empId + ":");
	            System.out.println(employee);
	        } else 
	        {
	            System.out.println("Employee with ID " + empId + " not found.");
	        }
	        scanner.close();
	}

}
class Employee
{
	private String name;
	private int age;
	private String department;
	
	public Employee(String name,int age,String department)
	{
		this.name=name;
		this.age=age;
		this.department=department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}

}
