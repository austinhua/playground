package XMLSerializationTesting;

public class Animal {
	private static final String TAG = "Animal";
	private int id;
	
	public Animal(int id) {
		this.id = id;
	}

	public void callTestFunction() {
		testFunction();
	}
	
	private void testFunction() {
		System.out.println("Animal test function");
	}
}
