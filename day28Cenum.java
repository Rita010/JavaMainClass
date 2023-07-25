package One;

enum Size1 {

	SMALL, MEDIUM, LARGE, EXTRALARGE;

	public int getSize() {

		switch (this) {

		case EXTRALARGE:
			return 3;
		case LARGE:
			return 4;
		case MEDIUM:
			return 5;
		case SMALL:
			return 6;
		default:
			return 0;

		}
	}
}

public class day28Cenum {

	public static void main(String[] args) {

		int order = Size1.SMALL.getSize();
		System.out.println(order);

	}
}
/*
 * // SIZE.small ====> object of small size ----- this // SIZE.medium ====>
 * object of medium size ----- this // return is the last action of the function
 * // enum defines a constant variable. // enum has constant value and method
 */