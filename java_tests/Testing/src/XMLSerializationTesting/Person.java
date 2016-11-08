package XMLSerializationTesting;
import java.util.ArrayList;

public class Person {
	public String name;
	private int age;
	private ArrayList<Integer> list = new ArrayList<Integer>();
	Animal myAnimal;
	
	public Person(Animal animal)
	{
		for(int i = 0; i < 3; i++)
			list.add(i);
		myAnimal = animal;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int _age)
	{
		age = _age;
	}
}
