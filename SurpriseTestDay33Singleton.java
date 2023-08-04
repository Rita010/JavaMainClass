package One;

public class SurpriseTestDay33Singleton {

	public static void main(String[] args) {
		
		Database9 db2 = Database9.getInstance();
				db2.getConnection();
	}

}
class Database9{
	private static Database9 dbObject = null;
	private Database9() {
		
	}
	public static Database9 getInstance() {
		if(dbObject==null) {
			dbObject = new Database9();
		}
		return dbObject;
	}
	public static void getConnection() {
		System.out.println("you are connected to database");
	}
}