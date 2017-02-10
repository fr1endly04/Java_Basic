//ex.3
public class Employee extends Person implements Payable{

	public Employee(String name, double salary) {
		super(name, salary);
	}
	 
	public boolean increasePay(int percent) {
		double a=getSalary()+getSalary()*percent/100;
		setSalary(a);
		System.out.println("Increasing salary by "+percent+ "%."+ getName() +" " +a);
		return false;
		
	}
	
}
