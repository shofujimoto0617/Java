
public class Lesson2_01 {
	public static void main(String[] args) {
		int age = 22;

		if (age >= 20) {
			System.out.println("adult");
		}

		int age1 = 18;
		if (age1 >= 20) {
			System.out.println("adult");
		}

		int age2 = 18;
		if (age2 >= 20) {
			System.out.println("adult");
		} else {
			System.out.println("child");
		}

		int age3 = 22;
		if (age3 >= 20) {
			System.out.println("adult");
		} else {
			System.out.println("child");
		}

		int age4 = 0;
		if (age4 >= 20) {
			System.out.println("adult");
		} else if (age4 == 0) {
			System.out.println("baby");
		} else {
			System.out.println("child");
		}
	}

}
