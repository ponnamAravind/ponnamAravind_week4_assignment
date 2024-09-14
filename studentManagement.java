package task_4;

import java.util.ArrayList;
import java.util.Scanner;

public class studentManagement 
{
	
	private ArrayList<String> student;
	
	public studentManagement()
	{
		student = new ArrayList<>();
	}
	public void addStudent(String studentName)
	{
		student.add(studentName);
		System.out.println(studentName+" has been added. \n");
	}
	public void removeStudent(String studentName)
	{
		if(student.remove(studentName))
		{
			System.out.println(studentName+" has been remove.");
		}
		else
		{
			System.out.println(studentName+" not found in the list.");
		}
	}
	public void displayStudent()
	{
		if(student.isEmpty())
		{
			System.out.println("no students in the list");
		}
		else
		{
			System.out.println("list of student: \n" );
			for(String student:student)
			{
				System.out.println(student);
			}
		}
	}

	public static void main(String[] args) 
	{
		studentManagement manage=new studentManagement();
		Scanner sc= new Scanner(System.in);
		int choice;
		
		while(true)
		{
			System.out.println("\n Student manager menu:");
			System.out.println("1. Add student ");
			System.out.println("2. remove student ");
			System.out.println("3. Display students list ");
			System.out.println("4. Exit ");
			System.out.println("Enter your choice: ");
			choice= sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter student Name to add: ");
				String nametoadd= sc.nextLine();
				manage.addStudent(nametoadd);
				break;
			case 2:
				System.out.println("Enter student name to remove ");
				String nametoremove=sc.nextLine();
				manage.removeStudent(nametoremove);
				break;
			case 3:
				manage.displayStudent();
				break;
			case 4:
				System.out.println("Exiting..............");
				System.exit(0);
				default:
					System.out.println("Invalide choice , pleace try again");
			}
		}

	}

}
