package One;

public class selfrevisionday13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Program 1

		// type [} nameofArray = new type[lengthofarray}
		// Array stores the value by index

		int[] number = new int[5];
		number[0] = 11;
		number[1] = 22;
		number[2] = 33;
		number[3] = 44;
		number[4] = 55;

		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println(number[3]);
		System.out.println(number[4]);

		int[] number2 = { 111, 222, 333, 444, 5555 };

		System.out.println(number2[0]);
		System.out.println(number2[1]);
		System.out.println(number2[2]);
		System.out.println(number2[3]);
		System.out.println(number2[4]);

		// Program 2

		String[] cities = new String[5];

		cities[0] = "Surprise";
		cities[1] = "Phoenix";
		cities[2] = "Glendale";
		cities[3] = "Tempe";
		cities[4] = "Tucson";

		System.out.println(cities[0]);
		// so on ...

		// looping through array

		for (int i = 0; i < cities.length; i++) {
			System.out.println(i);
			System.out.println(cities[i]);
		}
		
		//              0    1   2   3   4   5
		int[] marks = { 99, 88, 77, 66, 55, 44 };
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		// System.out.println("Reverse -------");
		
		for(int i = marks.length -1 ; i>= 0 ; i--) {
			System.out.println(marks[i]);
		}
		
		// Program 3
		
		int mks [] = {33,44,55,66,77,88,99};
		int t1 = 0;
		
		while(t1< mks.length) {
			System.out.println(mks[t1]);
			t1=t1+1;
		}
		
		int t2 = mks.length -1;
		while (t2 >= 0) {
			System.out.println(mks[t2]);
			t2 = t2 - 1;
		}
		
		// Program 4 (for each loop)
		
		
		String [] fruits = {"apple", "grapes", "banana"};
		
		int [] mks2 = {11,22,33};
		
		for(String a : fruits) {
			System.out.println(a);
		}
		for (int b : mks2) {
			System.out.println(b);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
