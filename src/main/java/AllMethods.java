
public class AllMethods {

	public static void main(String[] args) {
		// s test();

		AllMethods c = new AllMethods();

		c.nonstatic();
		test();

		// test();

	}

	AllMethods() {
		System.out.println("constructor");

	}

	public void nonstatic() {
		System.out.println(" non static method");
	}

	static {
		System.out.println("static block -- always static block executes first");
	}
	{
		System.out.println("normal block");
	}

	public static void test() {
		System.out.println("Static method -- depends of the calling line of order");
	}
}
