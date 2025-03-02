package week2day4;

public class JavaConnection implements DatabaseConnection {

	public static void main(String[] args) {
		ConnectToDatabase connection = new ConnectToDatabase();
		connection.connect();
		connection.disconnect();
		connection.executeUpdate();
		
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connectiong to database");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect to database");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Executing to update");
		
	}

}
