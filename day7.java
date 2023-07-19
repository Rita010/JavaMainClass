package One;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// switch case without break statement 
		
		// program 1
	
		
		  String city = "Balaju"; 
		
			switch (city)
			{
			case "Sanepa":
			System.out.println("Lalitpur");
			case "Balaju":
			System.out.println("Kathmandu");
			case "Jadibudi":
			System.out.println("Bhaktapur");
			case "Jawalakhel":
				System.out.println("Lalitpur");
			}
							
		// program 2
			
			String city2 = "Balaj";
			switch(city2) {
			case "Sanepa":
				System.out.println("Lalitpur");
				break;
			case "Balaju":
					System.out.println("Kathmandu");
					break;
			case "Jadibuti":
				System.out.println("Bhaktapur");
				break;
			case "Jawalakhel":
				System.out.println("Lalitpur");
				break; 
				default:
					System.out.println("Incorrect city name");
				
			}
			
		// program 3
			
			String city3 = "Phoenix";
			switch (city3) 
			{
			case "Phoenix":
			case "Tempe":
				System.out.println("Arizona");
				break;
			case "Boise":
			case "Leesburg":
				System.out.println("Idaho");
			break;
			case "Washington":
			case "Kent":
				System.out.println("Seattle");
				break;
			case "Dallas":
			case "Huston":
			case "Austin":
				System.out.println("Texas");
				break;
				default:
					System.out.println("Incorrect city name");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
