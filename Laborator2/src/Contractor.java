//ex.4
public class Contractor extends Person implements Payable {
	public Contractor(String name, double salary) {
		super(name, salary);
	}

	public boolean increasePay(int percent) {
		if(percent < INCREASE_CAP){
			double a=getSalary()+getSalary()*percent/100;
			setSalary(a);
			System.out.println("Increasing houurly are  by "+ percent+ "%." +getName()+ " "+a);
			return true;
		}
		else {
			
System.out.println("Sorry,can't increase hourly rate by more than "+ Payable.INCREASE_CAP + "%." +getName());
				return false;
		}
	}
}
