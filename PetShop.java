package inter.basic2;

public class PetShop {

	// 1. carePet() 메서드 선언
	// 매게변수는 모든 펫타입을 전달 받을 수 있도록 선언
	// 기능 - instanceof 사용해서 캐스팅하고, "xxx를 돌봅니다" 출력
	
	public void carePet(IPet p) { // = new Dog();
		
		if(p instanceof Dog) {
			Dog dog = (Dog)p;
			System.out.println("강아지를 돌봅니다.");
		} else if(p instanceof Cat) {
			Cat cat = (Cat)p;
			System.out.println("고양이를 돌봅니다.");
		} else if(p instanceof GoldFish) {
			GoldFish fish = (GoldFish)p;
			System.out.println("금붕어를 돌봅니다.");
		}
	}
	
	// 2. petInfo() 메서드 선언
	// 매개변수는 팻 배열을 받도록 선언
	// 기능 - 모든 팻의 play 메서드를 실행
	
	public void petInfo(IPet[] p) {
		
		for(IPet i : p) {
			i.play();
		}
	}
}
