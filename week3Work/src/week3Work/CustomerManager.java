package week3Work;

public class CustomerManager {

	private Customer _customer;
	
	private ICreditManager _creditmanager;

	public CustomerManager( ICreditManager creditManager, Customer customer) {
		
		_customer = customer;
		_creditmanager = creditManager;
	}

	

	public void Save() {
		System.out.println("Müşteri kaydedildi:");

	}

	public void Delete() {
		System.out.println("Müşteri silindi:");

	}

	public void GiveKredi() {
		_creditmanager.Calculate();
		System.out.println("Kredi verildi");

	}
}
