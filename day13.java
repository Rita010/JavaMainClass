package One;

public class day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Program 1
		
		// type[] nameofArray = new type[lengthofArray]
		// Array stores the value by index

		int[] numbers = new int[5];

		numbers[0] = 16;
		numbers[1] = 17;
		numbers[2] = 18;
		numbers[3] = 30;
		numbers[4] = 50;

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);

		int[] number2 = { 100, 200, 300, 400, 500 };

		System.out.println(number2[0]);
		System.out.println(number2[1]);
		System.out.println(number2[2]);
		System.out.println(number2[3]);
		System.out.println(number2[4]);

		// Program 2

		String[] cities = new String[5];

		cities[0] = "Phoenix";
		cities[1] = "Glendale";
		cities[2] = "Surprise";
		cities[3] = "Happy Valley";
		cities[4] = "Deer Valley";

		// System.out.println(cities [0]);

		// looping through array

		for (int i = 0; i < cities.length; i++) {
			System.out.println(i);
			System.out.println(cities[i]);
		}

		// 0 1 2 3 4 5 6
		int[] marks = { 80, 90, 85, 98, 150, 130, 200 };
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		// program 3

		int mks[] = { 11, 14, 13, 15, 12, 16, 25 };
		int t1 = 0;

		while (t1 < mks.length) {
			System.out.println(mks[t1]);
			t1 = t1 + 1;
		}

		int t2 = mks.length -1; 
		while(t2>=0) {
			System.out.println(mks[t2]);
			t2 =t2 -1;
		}
		
		// Program 4 (for each loop)
		
		String [] veg = {"radish","carrot","trunip"};
		int []veg2 = { 44,55,62 };
		for (String x : veg) {
			System.out.println(x);
		}
		
		for (int y : veg2) {
			System.out.println(y);
		}
		
		
		
		
		
		
		
		
		
	}

}
