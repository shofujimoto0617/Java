@FunctionalInterface
public interface Greeting {
	public String hello(String word);
	
	Greeting greeting = (String word) -> {
		return "こんにちは";
	};
	

}
