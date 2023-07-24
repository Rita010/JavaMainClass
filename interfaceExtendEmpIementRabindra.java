package One;

public class interfaceExtendEmpIementRabindra {

	public static void main(String[] args) {

		Girl gl = new Girl();
		gl.Boy1();
		gl.Boy2();
		gl.jump();
		gl.run();
		
		
	}

}
interface football{
	public void run();
}
interface basketball{
	public void jump();	
}
interface volleyball{
	public void kick();	
}
class Boy {
	public void Boy1() {
		System.out.println("Boys");
	}
	public void Boy2() {
		System.out.println("Girls");
	}
}
class Girl extends Boy implements football,basketball{

	@Override
	public void jump() {
		System.out.println("high jump");

	}

	@Override
	public void run() {
		System.out.println("run very fast");

		
	}
	
}