package day2.jsonAndSerializationPojo;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadJSONContent {

	@Test
	public void testCase() throws IOException, ParseException {
		
		//Create an instance of FileReader by providing JSON file name into its constructor
		FileReader fr=new FileReader(".\\src\\test\\resources\\testData\\Test.json");
		//Create an instance of JSONParser to parse JSONContent of JSON file into Object
		JSONParser jp=new JSONParser();	
		//using JSONParser get JSON content from file in the form of Object class object
		Object obj=jp.parse(fr);
		//convert Object into JSONObject so that you can easily fetch data based on key
		JSONObject ref=(JSONObject)obj;
		
		System.out.println(ref.get("name"));
		System.out.println(ref.get("job"));
	}
}
