//ex.1
abstract class Person {
	private String name;
	private double salary;
	
	public Person(String name,double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getName(){
		return "Person's name : "+name;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
}
