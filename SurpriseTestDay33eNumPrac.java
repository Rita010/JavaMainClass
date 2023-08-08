package One;
enum Size2{
	small, medium, large, Extralarge;
	
	public String getSize() {
		switch(this) {
		case small:
			return "small size";
		case medium:
			return "medium size";
		case large:
			return "large size";
		case Extralarge:
			return "extralarge size";
			default: 
				return "null";
		}
		
	}
	
}
public class SurpriseTestDay33eNumPrac {

	public static void main(String[] args) {
		
		String tshirt = Size2.large.getSize();
		System.out.println(tshirt);
		
		
	}

}
