package week3Work;

public class Main {

	public static void main(String[] args) {
		/*
		 * CreditManager creditManager = new CreditManager(); creditManager.Calculate();
		 * creditManager.Save();
		 * 
		 * Company company = new Company(); company.TaxNumber = "155555";
		 * company.CompanyName = "Beko"; company.Id=100;
		 * 
		 * Person person = new Person(); person.NationalIdentity = "00";
		 * person.FirstName = "Erdem"; person.LastName = "Günaydın";
		 * 
		 * Customer customer = new Customer(); customer.Id = 1; customer.City =
		 * "Giresun";
		 * 
		 * CustomerManager customerManager = new CustomerManager( customer );
		 * customerManager.Save(); customerManager.Delete();
		 * 
		 * CustomerManager customerManager2 = new CustomerManager(person);
		 * customerManager2.Save(); customerManager2.Delete();
		 */
		CustomerManager customerManager = new CustomerManager(new TeacherCreditManager(),new Customer());
		customerManager.GiveKredi();
		
		
		

	}

}
