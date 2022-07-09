package JavaBasic;

public class ClassExample {

	int empid;

	String empname;
	int salary;
	int deptno;

	ClassExample(int empid, String empname, int salary, int deptno)

	{

		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.deptno = deptno;

		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);

	}

	public void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);

	}

	public static void main(String args[]) {

		ClassExample e = new ClassExample(10, "Aswathi", 1000, 10);

		e.display();

	}
}