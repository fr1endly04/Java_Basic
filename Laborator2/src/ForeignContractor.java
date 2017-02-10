//ex.5
public class ForeignContractor extends Person implements Payable{

	public ForeignContractor(String name, double salary) {
		super(name, salary);
		
	}

	public boolean increasePay(int percent) {
		
			
 			System.out.println("I'm just a foreign worker.");

		return false;
		
	}

}
