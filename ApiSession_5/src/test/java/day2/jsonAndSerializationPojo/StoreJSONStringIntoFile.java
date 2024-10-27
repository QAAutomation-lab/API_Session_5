package day2.jsonAndSerializationPojo;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class StoreJSONStringIntoFile {
	
	@Test
	public void testCase1() {
		//creating new JSON Object
		JSONObject emp1=new JSONObject();
		emp1.put("firstName", "Ajay");
		emp1.put("lastName", "Mehta");
		emp1.put("empId", "123");
		//creating new JSON Object
		JSONObject emp2=new JSONObject();
		emp2.put("firstName", "Girish");
		emp2.put("lastName", "Bhangale");
		emp2.put("empId", "101");
		//creating new JSON Object and store 1st JSON Object as an value into 3rd JSONObject
		JSONObject obj1=new JSONObject();
		obj1.put("employee", emp1);
		System.out.println("JSON Object obj1: \n"+obj1);
		//creating new JSON Object and store 2nd JSON Object as an value into 4th JSONObject
		JSONObject obj2=new JSONObject();
		obj2.put("employee", emp2);
		System.out.println("JSON Object obj2: \n"+obj2);
		
		//Storing JSONObject 3rd and 4th into JSONArray
		JSONArray arr=new JSONArray();
		arr.add(obj1);
		arr.add(obj2);
		System.out.println("JSONArray Elements: \n"+arr);
		
		//write JSON content into JSON file
		
		try {
			FileWriter file=new FileWriter(".\\src\\test\\resources\\testData\\employee.json");
			//we can write JSON content into JSON file using write() of FileWriter class
			file.write(arr.toJSONString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("JSON file created......");
	}
}
