package XMLSerializationTesting;

public class Dog extends Animal {
	public static final String TAG = "Dog";
	private int id;
	
	public Dog(int id) {
		super(id);
		this.id = id;
	}
	
	public void callTestFunction() {
		testFunction();
	}
	
	private void testFunction() {
		System.out.println("Dog test function");
	}

}
