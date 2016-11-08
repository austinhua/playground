package JSONTesting;
import org.json.*;

public class JSONRead {
	static String s = "{\"field1\": \"value11\", \"field2\": \"value12\"}";			
	static String a = "[{\"field1\": \"value11\", \"field2\": \"value12\"}, {\"field1\": \"value21\", \"field2\": \"value22\"}]";			
	
	public static void main(String[] args) {
		JSONObject obj = new JSONObject(s);
		JSONArray arr = new JSONArray(a);
		
		System.out.println(obj);
		System.out.println(arr);
	}
	
	
}
