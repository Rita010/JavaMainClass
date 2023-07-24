package One;

public class Exam4page4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 6. one program for overloading
		
		addz(2,4);
		addz(2,4,5);
		addz(2,4,5,6);
		
		
	}
	public static void addz(int x, int y) {
		System.out.println(x+y);
	}
	public static void addz(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	public static void addz(int x, int y, int z, int a) {
		System.out.println(x+y+z+a);
	}
}
