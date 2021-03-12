package inter.basic;

public class Basic implements Inter1, Inter2 {

	/*
	 * 인터페이스를 상속(구현) 하려면 implements 키워드를 사용한다.
	 * 인터페이스는 여러 인터페이스를 구현할 수 있다. 
	 */
	
	@Override
	public void method1() {
		System.out.println("Inter1의 재정의 된 메서드 실행");
		
	}

	@Override
	public void method2() {
		System.out.println("Inter2의 재정의 된 메서드 실행");
		
	}
	
	public void method3() {
		System.out.println("Basic클래스의 메서드 실행");
	}

}
