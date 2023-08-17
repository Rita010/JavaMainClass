package One;

enum Size3{
	
	SMALL, MEDIUM, LARGE, EXTRALARGE
}
class TestSize{
	
		Size3 Tshirt; 
		
		public TestSize(Size3 Tshirt) {
			this.Tshirt = Tshirt;
		}

		public void buyTshirt() {
			switch(Tshirt) {
			case SMALL:
				System.out.println("I am buying small size");
				break;
			case MEDIUM: 
				System.out.println("I am buying Medium size");
				break;
			case LARGE:
				System.out.println("I am buying large size");
				break;
			case EXTRALARGE:
				System.out.println("I am buying extralarge size");
				break;
				default:
					System.out.println("I am buying extralarge size");
			}
				
		}
}



public class day41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TestSize a = new TestSize(Size3.MEDIUM);
		
				a.buyTshirt();
		
	}

}
