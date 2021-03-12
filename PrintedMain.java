package inter.basic3;

public class PrintedMain {

	public static Printed p;
	
	public static void main(String[] args) {
		
//		Printed p;
		
//		p = new LG();
		p = new Samsung();
		
		p.turnOn();
		p.print("가나다");
		p.colorPrint("라마바", "스카이블루");
		p.copy(10);
		p.turnOff();
	}
}
