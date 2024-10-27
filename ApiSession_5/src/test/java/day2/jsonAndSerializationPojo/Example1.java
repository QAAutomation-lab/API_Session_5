package day2.jsonAndSerializationPojo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Example1 {

	@Test
	public void jsonObjectIntoJsonArray() {
		JSONObject obj1=new JSONObject();
		obj1.put("Name", "Shailesh");
		obj1.put("City", "Pune");
		obj1.put("Company", "XYZ");
		obj1.put("Mobile", "9764975157");
		System.out.println("JSONObject obj1 Elements: "+obj1);
		
		JSONObject obj2=new JSONObject();
		obj2.put("Name", "Advik");
		obj2.put("City", "Bangalore");
		obj2.put("Company", "Google");
		obj2.put("Mobile", "9875546154");
		System.out.println("JSONObject obj2 Elements: "+obj2);
		
		JSONArray arr=new JSONArray();
		arr.add(obj1);
		arr.add(obj2);
		System.out.println("JSONArray Elements: "+arr);
	}
}
