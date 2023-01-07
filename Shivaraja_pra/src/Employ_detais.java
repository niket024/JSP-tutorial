import java.util.*;

public class Employ_detais
{
	static ArrayList Emp_det = new ArrayList();
	void Create()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enetr SAP Number");
		int sap_no = sc1.nextInt();
		System.out.println("Enter Employ name");
		String Emp_name = sc1.next();
		System.out.println("Enter Age of employ");
		int Emp_age = sc1.nextInt();
		Emp_det.add(sap_no);
		Emp_det.add(Emp_name);
		Emp_det.add(Emp_age);
	}

	void  Display()
	{
		System.out.println("Employ Sap no=" + Emp_det.get(0));
		System.out.println("Employ name= " + Emp_det.get(1));
		System.out.println("Employ Age=" + Emp_det.get(2));
	}

	public static void main(String[] args)
	{
		String ch = "";
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Welcome to Employ Details");
			System.out.println("Enter Your Selection");
			System.out.println("1. Create");
			System.out.println("2. Dispay");
			System.out.println("3. Delete");
			int Selection = sc.nextInt();
			Employ_detais obj1 = new Employ_detais();
			if (Selection == 1)
			{
				obj1.Create();
			}
			if (Selection == 2)
			{
				obj1.Display();
			}
			System.out.println("DO YOU WANT TO CONTINUE?(y/n)");

		} while ("y".equalsIgnoreCase(sc.next()));

	}
}
