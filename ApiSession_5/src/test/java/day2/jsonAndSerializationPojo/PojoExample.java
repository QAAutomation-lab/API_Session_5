package day2.jsonAndSerializationPojo;

public class PojoExample {
	private String name;
	private int empId;
	private double salary;
	public PojoExample(String name, int empId,double salary) {
		this.name=name;
		this.empId=empId;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public int getEmpId() {
		return empId;
	}
	public double getSalary() {
		return salary;
	}
}
class TestPojo{
	public static void main(String[] args) {
		PojoExample ref=new PojoExample("Pune",101,45000.55);
		System.out.println(ref.getEmpId());
		System.out.println(ref.getName());
		System.out.println(ref.getSalary());
	}
}
/*
POJO Class: Plain old Java Object
	* its used to increase the readability and re-usability in java program
	* it contains variables and method(getter & setter)
	* it doesn;t have any naming convention for properties(data members) and methods
	* similar to java beans class but
			- Beans class will have restrictions like data members should be declared as private
			- in POJO there is not such restrictions'
	* POJO class should not override existing classes
	* POJO should not extends/implements any Class/interface
	* POJO class should be declare as public
	* Its constructor should be public

*/