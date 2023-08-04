package One;

public class day28singleton {

	public static void main(String[] args) {
		// singleton is important for interview
		// it is used when you want to establish a connection between Database
		
		
		
		// Database a= new Database(); // constructor is private

		Database db3 = Database.getInstance();
		db3.getConnection();

	}

}

class Database {
	private static Database dbObject = null;

	private Database() {

	}

	public static Database getInstance() {
		if (dbObject == null) {
			dbObject = new Database();
		}
		// returns you singleton object
		return dbObject;

	}

	public void getConnection() {
		System.out.println("you are connected to database");
	}
}
