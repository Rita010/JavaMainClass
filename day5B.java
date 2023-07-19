package One;

public class day5B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Introvert 	|| Extrovert
		// not social 	|| social
		// calm			|| loud
		// less outing	|| more outing
		
		// Human
		// properties - color , age, weight
		// methods - walk (), talk ()
		
		// Vehicle
		// properties - color , model, ragNo
		// methods - start(), stop()
		
		// Bank
		// Properties - bal, accNo, accName, city
		// method - deposit(), withdrawl()
		
		//boolean canDriver = true;
		// int x = 10; // 7, -7, 0, 78
		
		
		// Comparison operator
		
		// < , > , <= , >= , == , !=
		
		System.out.println(10<8);
		System.out.println(10>8);
		System.out.println(10<=8);
		System.out.println(10>=8);
		System.out.println(10<=8);
		System.out.println(10>=10);
		System.out.println(8!=5);
		System.out.println(10!=5);
		System.out.println(6==4);
		System.out.println(6==6);
		
		System.out.println("---------------------");
		
		System.out.println(12 < 6); // false
		System.out.println(3 > 2);	// true
		System.out.println(3 <= 2); // false
		System.out.println(3 >= 2); // true
		System.out.println(3 <= 3); // true
		System.out.println(3 >= 3); // true
		System.out.println(3 != 3); // false
		System.out.println(3 != 4); // true
		System.out.println(7 == 4); // false
		System.out.println(7 == 7);// true
		
		System.out.println("---------------------");
		
		// Logical operator
		
		// and --- &&
		
		// true 	&& 		true ------ true
		// false 	&& 		true ------ false
		// true 	&&		false------ false
		// false 	&& 		false -----	false
		
		
		System.out.println(8==8&&4==4);
		System.out.println(8!=8&&4==4);
		System.out.println(5==5&&4!=4);
		System.out.println(5!=5&&4!=4);
		
		System.out.println(7==7 && 8==8); // true
		System.out.println(7!=7 && 8==8); // false
		System.out.println(7==7 && 8!=8); // false
		System.out.println(7!=7 && 8!=8); // false
		
		System.out.println("---------------------");
		
		// OR --- ||
		
		// true 	|| true ------ true
		// false 	|| true ------ true
		// true		|| false------ true
		// false 	|| false ----- false
		
		System.out.println(8 == 8 || 8 ==8); // true
		System.out.println(8 == 9 || 8 ==8); // true
		System.out.println(8 == 8 || 8 ==9); // true
		System.out.println(8 == 9 || 8 ==9); // false
		
		System.out.println(5==6||5==6);
		System.out.println(5==5||5==6);
		System.out.println(5==3||5==5);
		System.out.println(5==5||5==5);
		
		System.out.println("---------------------");
		
		
		// NOT --- !
		
		// !true ------ false
		// !false ----- true
		
		System.out.println(!(7==7));
		System.out.println(!(6==4)); 
		
		
		System.out.println("---------------------");
		
		
		System.out.println(!(5==5)); //false
		System.out.println(!(5==6)); // true
		
		
	}

}
