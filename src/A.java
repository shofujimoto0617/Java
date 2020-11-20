
public class A {
	public String hello() {
		return "Hello A!";
	}
	public static void main(String[] args) {
		A a = new A(){};
		System.out.println(a.hello());
		
		A b = new A() {
			@Override
			public String hello() {
				return "Hello B!";
			}
		};
		System.out.println(b.hello());
	}

}
