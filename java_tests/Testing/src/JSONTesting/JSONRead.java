package JSONTesting;
import org.json.*;

public class JSONRead {
	static String s = "{\"field1\": \"value11\", \"field2\": \"value12\"}";			
	static String a = "[{\"field1\": \"value11\", \"field2\": \"value12\"}, {\"field1\": \"value21\", \"field2\": \"value22\"}]";			
	
	public static void main(String[] args) {
		JSONObject obj = new JSONObject(s);
		JSONArray arr = new JSONArray(a);
		
		
		System.out.println(((JSONObject)arr.get(1)).get("field1"));
		
		String key = "field2";
		for (int i = 0; i < arr.length(); i++) {
			JSONObject o_i = arr.getJSONObject(i);
			String field2 = o_i.getString(key);
			System.out.println(key + ": " + field2);
		}
	}
	
	
}
