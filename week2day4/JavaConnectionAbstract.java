package week2day4;

public class JavaConnectionAbstract extends MySqlConnection {

	public static void main(String[] args) {
		
		JavaConnectionAbstract javaAsbtract = new JavaConnectionAbstract();
		javaAsbtract.connect();
		javaAsbtract.disconnect();
		javaAsbtract.executeQuery();
		javaAsbtract.executeUpdate();
	}

	@Override
	public void disconnect() {
		
		System.out.println("Connecting from MySqlConnection");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("disonnect from MySqlConnection");
	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("execute from MySqlConnection");
	}

	
} 

