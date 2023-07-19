package One;

public class day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array - Array store the value by index
		
		int marks [] = new int [5];
		marks[0]= 5;
		marks[1]= 10;
		marks[2]= 15;
		marks[3]= 20;
		marks[4]= 25;
		
	int marks2 [] = {5,10,15,20,25};
		 String cities [] = {"Phoenix","Glendale","Tempe","Deer Valley","Surprise"};
		
		 
		// for loop
		 
		
		for (int i = 0; i < marks2.length; i++) {
			System.out.println();
			System.out.println(marks2[i]);
		}
		
		
		// While loop
		
		
		int t1 = 0;
		
		while (t1 < marks.length){
			System.out.println(marks2[t1]);
		t1++;	
			
		//t1 = t1 + 1;     or 
		}
		
		
		// forEach
		
		for (int a : marks2) {
		System.out.println(a);	
		}
		
		
		// Multi - dimentional array
		
		
		
		int [][] marks3 = new int [3][4];
		
		
//		  	0	1	2	3	
		
//		0	11	22	33	44
//			
//		1	88	77	66	55	
//		
//		2	60	70	80	90
		
		
		
		marks3[0][0] = 11; 
		marks3[0][1] = 22;
		marks3[0][2] = 33;
		marks3[0][3] = 44;
		
		marks3[1][0] = 88;
		marks3[1][1] = 77; 
		marks3[1][2] = 66;
		marks3[1][3] = 55;
		
		marks3[2][0] = 60;
		marks3[2][1] = 70; 
		marks3[2][2] = 80;
		marks3[2][3] = 90;
		
		System.out.println(marks3[1][2]);
		System.out.println(marks3[2][3]);
		System.out.println(marks3[1][0]);
		System.out.println(marks3[0][0]);
		
		
		// Program 1
		
		// for loop

		for (int i = 0; i < marks3.length; i++) {
			int[]arr = marks3[i];
			for (int j =0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
		}
		 
		// Program 2
		
		int[][]numbers2 = {
				
				{11, 22, 33},
				{44, 55, 66},
				{77, 88, 99}
		};
				
		for (int i = 0; i < numbers2.length; i++) {
			int[]arr = numbers2[i];
			for (int j =0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
		}
		// while loop
		
		// Program 3
		
		int r1 = 0;
		
		while(r1 < numbers2.length) {
			int arr[] = numbers2[r1];
			int c1 = 0;
			while (c1 < arr.length) {
				System.out.println(arr[c1]);
				c1 = c1 + 1;
			}
			r1++;
		}
		
		// Program 4
		
		
		for (int []row:numbers2) {
			for(int col : row) {
				System.out.println(col);
			}
		}
		
		
		
		
		
		
		
		
		
				
		}
		
	}


