import java.util.ArrayList;
import java.util.Scanner;

public class Manager
{
	static Scanner sc = new Scanner(System.in);
	Employee e1 = null;
	static ArrayList<Employee> empList = new ArrayList<Employee>();

	void addEmployee()
	{
		do
		{
			e1 = new Employee();
			System.out.println("Enetr id Number");
			e1.setId(sc.nextInt());
			System.out.println("Enter  fname");
			e1.setFname(sc.next());
			System.out.println("Enter lname");
			e1.setFname(sc.next());
			System.out.println("Enter age");
			e1.setAge(sc.nextInt());
			empList.add(e1);
			System.out.println("do u want to add more?(y/n)");
		} while ("y".equalsIgnoreCase(sc.next()));
	}

	void display()
	{
		System.out.println("total no of employee=" + empList.size());
		System.out.println("1.All");
		System.out.println("2.One");
		System.out.println("enter your option");
		int op = sc.nextInt();
		if (op == 1)
		{
			for (Employee e1 : empList)
			{

				System.out.println(e1.getId());
				System.out.println(e1.getFname());
				System.out.println(e1.getLname());
				System.out.println(e1.getAge());
				System.out.println("------------------------");
			}
		}
		else
		{
			System.out.println("enter the id which u want to see");
			int id = sc.nextInt();
			boolean flag=false;
			for (Employee e1 : empList)
			{
				if (e1.getId() == id)
				{
					flag=true;
					System.out.println(e1.getId());
					System.out.println(e1.getFname());
					System.out.println(e1.getLname());
					System.out.println(e1.getAge());
					System.out.println("------------------------");
				} 
			}
			if(!flag)
			{

					System.out.println("there is no employee with id=" + id);
			}
		}
	}

	public static void main(String[] args)
	{

		do
		{
			System.out.println("Welcome to Employ Details");
			System.out.println("Enter Your Selection");
			System.out.println("1. Create");
			System.out.println("2. Dispay");
			System.out.println("3. Delete");
			int Selection = sc.nextInt();
			Manager obj1 = new Manager();
			if (Selection == 1)
			{
				obj1.addEmployee();
			}
			if (Selection == 2)
			{
				obj1.display();
			}
			System.out.println("DO YOU WANT TO CONTINUE?(y/n)");

		} while ("y".equalsIgnoreCase(sc.next()));
	}
}
