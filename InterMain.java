package inter.basic;

public class InterMain {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		
		b.method1(); // override
		b.method2(); // override
		b.method3();
		
		System.out.println(b.PI);
		System.out.println(b.ABC);
		
		System.out.println("----------------------");
		/*
		 *  인터페이스도 하나의 타입이 될 수 있다.
		 *  인터페이스에 객체를 저장했을 때, 다형성의 형태로 동일하게 실행
		 */
		
		Inter1 i = b; // Inter1 i = new Basic();
		
		i.method1();
//		i.method2(); 
//		i.method3();
		
		Inter2 i1 = b; // Inter2 i1 = new Basic();
		
//		i1.method1();
		i1.method2();
//		i1,method3();
		
		System.out.println("----------------------");
		
		// 인터페이스에서도 클래스 캐스팅을 사용할 수 있다.
		Basic bb = (Basic)i;
		
		
		
		
		
		
		
		
		
		
		
	}
}
