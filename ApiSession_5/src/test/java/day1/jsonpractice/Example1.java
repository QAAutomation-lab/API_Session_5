package day1.jsonpractice;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.testng.annotations.Test;

public class Example1 {

	@Test
	public void testJsonObject() {
		JSONObject ref=new JSONObject();
		ref.put("Name", "Shailesh");
		ref.put("City", "Pune");
		ref.put("Company", "XYZ");
		ref.put("Mobile", "9764975157");
		System.out.println("JSONObject Elements: "+ref);
		System.out.println("My name is: "+ref.get("Name"));
		System.out.println("All keys: "+ref.keySet());
		System.out.println("All value: "+ref.values());
	}
	@Test
	public void testMapIntoJsonObject() {
		Map ref=new HashMap();
		ref.put("Name", "Shailesh");
		ref.put("City", "Pune");
		ref.put("Company", "XYZ");
		ref.put("Mobile", "9764975157");
		System.out.println("Map Elements: "+ref);
		//Converting Map into JSONObject
		String jsonString=JSONValue.toJSONString(ref);
		System.out.println("JSON String value: "+jsonString);
	}
	
	@Test
	public void testStringIntoJSONObject() {
		String str="{\"Company\":\"XYZ\",\"City\":\"Pune\",\"Mobile\":\"9764975157\",\"Name\":\"Shailesh\"}";
		
		//Convert String into Object
		Object obj=JSONValue.parse(str);
		//Convert Object into JSON Object
		JSONObject jObject=(JSONObject)obj;
		
//		Object n=jObject.get("Name");
//		String name=(String)n;
//		System.out.println("Name is: "+name);
			//or
		String name=(String)jObject.get("Name");
		System.out.println("Name is: "+name);
	}
}

/*
JSON Array
JSON File
	creation
	ready
Serialization & DeSerialization
POJO classes
*/