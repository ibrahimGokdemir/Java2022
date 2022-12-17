package abstractDemo22;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.databaseManager = new PostreSqlServer();
		customerManager.getCustomers();
		
	}

}
