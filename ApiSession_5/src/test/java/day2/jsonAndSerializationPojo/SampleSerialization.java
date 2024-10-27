package day2.jsonAndSerializationPojo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SampleSerialization implements Serializable{

	public int empId;
	public String name;
	public SampleSerialization(int empId, String name){
		this.empId=empId;
		this.name=name;
	}
}
class Sample{
	
	public static void main(String[] args) {
		SampleSerialization ref=new SampleSerialization(123,"Amar");
		String fileName="file.ser";
		//Serialization
		try {
			//Identifying location to store Serialized object
			FileOutputStream fos=new FileOutputStream(fileName);
			//Creating instance of ObjectOutputSteam 
			ObjectOutputStream out=new ObjectOutputStream(fos);
			//using writeObject() store object into file
			out.writeObject(ref);
			out.close();
			fos.close();
			System.out.println("Object has been serailized...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//De-Serialization
		SampleSerialization ref2=null;
		try {
			FileInputStream fis=new FileInputStream(fileName);
			ObjectInputStream ois=new ObjectInputStream(fis);
			ref2=(SampleSerialization)ois.readObject();
			
			ois.close();
			fis.close();
			
			System.out.println("EmpId: "+ref2.empId);
			System.out.println("Name: "+ref2.name);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}