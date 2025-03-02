package week2day4;

public abstract class MySqlConnection implements DatabaseConnection {

	// method 
	public abstract void executeQuery();
	
	// class
	public void connect() {
		
		{
			   System.out.println("Connection established from MySqlConnection abstract class");
			   
		   }
	}

}
