package polymorphismDemo;



public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
		customerManager.add();

		/*
		 * BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new
		 * ConsoleLogger(), new DatabaseLogger() }; for (BaseLogger logger : loggers) {
		 * logger.Log("Log mesajı"); }
		 * 
		 * EmailLogger logger = new EmailLogger(); logger.Log(" Log mesajı");
		 */

	}

}
