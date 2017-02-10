//main - principal
public class Lab2 {

	public static void main(String[] args) {
		Employee a1 = new Employee("Ion",3500);
		a1.increasePay(5);
		
		Contractor a2 = new Contractor("Svet",4200);
		Contractor a3 = new Contractor("Ion",6900);
		Contractor a5 = new Contractor("Angela",8560);
		
		a2.increasePay(21);
		a3.increasePay(19);
		a5.increasePay(25);
		
	    ForeignContractor a4 = new ForeignContractor("Svet",550);
	    a4.increasePay(24);
	}

}
