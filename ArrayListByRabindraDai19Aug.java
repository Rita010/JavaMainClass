package One;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListByRabindraDai19Aug {

	public static void main(String[] args) {
		
		ArrayList<String> bird = new ArrayList<>();
		bird.add("parrot");
		bird.add("pigeon");
		bird.add("owl");
		
		System.out.println(bird);
		
		ArrayList<String> lg = new ArrayList<String>(Arrays.asList("java","C#","PHP"));
		System.out.println(lg);
		
		List<String> a = new ArrayList<>();
		a.add("apple");
		a.add("Banana");
		System.out.println(a);
	}

}
