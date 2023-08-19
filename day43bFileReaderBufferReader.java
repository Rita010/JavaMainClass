package One;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class day43bFileReaderBufferReader {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("example.txt)");
			BufferedReader bufferReader = new BufferedReader(reader);
			
			// String line;
			
			try {
//				System.out.println(bufferReader.readLine());
//				System.out.println(bufferReader.readLine());
//				
//				while( bufferReader.readLine()!= null) {
//					System.out.println(bufferReader.readLine());
//					System.out.println("\n");
//				}
//				
				String line = bufferReader.readLine();
				
				while(line != null) {
					System.out.println(line);
					line = bufferReader.readLine();
				}
				
			
//			System.out.println(bufferReader.read());
//			System.out.println(bufferReader.read());
			
			bufferReader.close();
		
		}catch (IOException e) {
			
			// to do Auto - generated catch block
			
			e.printStackTrace();
		}
		
	}catch (FileNotFoundException e) {
		
		// to do Auto- generated catch block
		
		e.printStackTrace();
		
	}
	
	}
	
}
	
	

