package One;
interface Three{
	public void methodThree();
}
interface Four{
	public void methodFour();
	
}
interface Five{
	public void methodFive();
	
}




public class day26Dinterface {

	public static void main(String[] args) {

		
		Seven ObjSeven = new Seven();
		ObjSeven.SixA();
		ObjSeven.SixB();
		ObjSeven.methodThree();
		ObjSeven.methodFour();
		
		
		
	}

}
class Six{
	public void SixA() {
		System.out.println("This is first method for class six");
	}
	public void SixB() {
		System.out.println("This is second method for class six");
	}
}
class Seven extends Six implements Three, Four{

	
	public void methodFour() {
		System.out.println("This is the method form interface three");
		
	}


	public void methodThree() {
		System.out.println("This is the method form interface four");
		
	}
	
}











