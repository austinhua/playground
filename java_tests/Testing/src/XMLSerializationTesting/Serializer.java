package XMLSerializationTesting;
import com.thoughtworks.xstream.XStream;

public class Serializer {
	public static void main(String[] args) {
		Person p = new Person(new Dog(5));
		p.name = "Bob";
		p.setAge(920);

		XStream xstream = new XStream();
		String xml = xstream.toXML(p);
		
		System.out.println(xml);
		
		Person backConvert = (Person)xstream.fromXML(xml);
		
		System.out.println(((Dog)p.myAnimal).TAG);
		p.myAnimal.callTestFunction();
		System.out.println("Done");
	}
}
