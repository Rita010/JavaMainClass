package One;

public class day22c {

	public static void main(String[] args) {

		CalculatorB a = new CalculatorB();

		a.substraction(12,6);
		a.substraction(12,6,5);
		a.substraction(12,6,5,1);

	}

}

class CalculatorB {
	public void substraction(int x, int y) {
		System.out.println(x - y);
	}

	public void substraction(int x, int y, int z) {
		System.out.println(x - y - z);
	}

	public void substraction(int x, int y, int z, int a) {
		System.out.println(x - y - z - a);
	}

}









