package JavaBasic;

public class methodOverloading {

	public void test(String name)

	{
		System.out.println("name is " + name);
	}

	public void test(String name, int age)

	{
		System.out.println("name is " + name);

		System.out.println("Age is " + age);
	}

	public void test(String name, int age, double Salary)

	{
		System.out.println("name is " + name);

		System.out.println("Age is " + age);
		System.out.println("Salary is " + Salary);
	}

	public static void main(String args[]) {
		methodOverloading c = new methodOverloading();

		c.test("Aswathi");
		c.test("nayana", 3);
		c.test("Nidhi", 20, 20000);

	}
}
