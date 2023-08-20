package One;

public class SingletonFinalPracForTest {

	public static void main(String[] args) {

		DatabaseA db1 =DatabaseA.getInstance();
		db1.getConnection();

	}

}
class DatabaseA{     
	private static DatabaseA dbObject = null;
	private DatabaseA() {
		
	}
	public static DatabaseA getInstance() {
		if(dbObject==null) {
			dbObject=new DatabaseA();
		}
		return dbObject;
	}
	public void getConnection() {
		System.out.println("you are conneted to database");
	}
}