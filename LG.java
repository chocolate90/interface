package inter.basic3;

public class LG implements Printed {
	
	private String logo = "Life is Good";

	@Override
	public void turnOn() {
		
		System.out.println(logo);
		System.out.println("전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		
		System.out.println(logo);
		System.out.println("전원을 끕니다.");
		
	}

	@Override
	public void print(String document) {
		
		System.out.println("내용:" + document);
		
	}

	@Override
	public void colorPrint(String document, String color) {
		
		System.out.println("내용:" + document + ", 색상:" + color);
		
	}

	@Override
	public void copy(int a) {
		
		System.out.println(a + "장 복사");
		
	}

	
}
