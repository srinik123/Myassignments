package week2day4;

public class ConnectToDatabase implements DatabaseConnection{

	public static void main(String[] args) {
		ConnectToDatabase connection = new ConnectToDatabase();
		connection.connect();
		connection.disconnect();
		connection.executeUpdate();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
	System.out.println("connect to Database");	
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect do Database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Executing update ");
		
	}

}
