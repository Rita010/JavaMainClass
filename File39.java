package One;

import java.io.FileWriter;
import java.io.IOException;

public class File39 {

	public static void main(String[] args) {
		
		try{
			FileWriter write = new FileWriter("MyFile.txt", true);
			System.out.println(10/0);
			write.write("hello world");
			write.write("\n");
			write.write("Hello Satya");
			write.close();
			
		}
		catch (IOException e) {
			
			// to do auto generated catch block
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			// to do Auto generated catch block
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		
		
		}
		
	}

}
