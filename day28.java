package One;

public class day28 {

	public static void main(String[] args) {
		
		
		//Database a= new Database(); // constructor is private
		
		Database db3 = Database.getInstance();
		db3.getConnection();
		
		
	}

}
class Database{
	private static Database dbObject = null;
	private Database() {
		
	}
	public static Database getInstance() {
		if(dbObject == null) {
			dbObject = new Database();
		}
		// returns you singleton object
		return dbObject;
		
	}
	public void getConnection() {
		System.out.println("you are connected to database");
	}
}




