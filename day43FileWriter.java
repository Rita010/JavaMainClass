package One;

import java.io.FileWriter;
import java.io.IOException;

public class day43FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "example.txt";
		
		try {
			FileWriter writer = new FileWriter(fileName);
			
			// write into the file
			
			writer.write("Hello world");
			writer.write("\n");
			writer.write("I am learning Java");
			writer.write("\n");
			writer.write("I am learning ruby");
			writer.write("\n");
			writer.write("I am learning sql");
			writer.write("\n");
			writer.write("I am learning Javascript");
			writer.write("\n");
			writer.close();
			System.out.println("Data successfully written and file is closed");
			
		}
		catch (IOException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
