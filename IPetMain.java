package inter.basic2;

public class IPetMain {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		// 1. Animal[]을 생성하고, 저장하고, 향상된 포문으로 동물의 기능을 출력
		
		Animal[] animal = {dog, cat, tiger};
		
		for(Animal a : animal) {
			a.eat();
		}
		
		System.out.println("--------------------------------");
		
		// 2. Ipet[]을 생성후 (강아지, 고양이, 금붕어)를 저장한 후 향상된 포문으로 펫의 기능을 출력 
		// IPet과 Animal은 서로 타입이 다른데, 자식클래스가 상호연관성을 가지면 형변환이 됩니다.
		
//		IPet dog1 = new Dog();
//		IPet cat1 = new Cat();
//		IPet goldfish = new GoldFish();
//		
//		IPet[] pet = {dog1, cat1, goldfish};
//		
//		for(IPet i : pet) {
//			i.play();
//		}
		
		IPet[] pet = new IPet[3];
		
		pet[0] = (IPet)dog;
		pet[1] = (IPet)cat;
		
//		GoldFish fish = new GoldFish();
//		pet[2] = fish;
		pet[2] = new GoldFish();
		
		for(IPet i : pet) {
			i.play();
		}
		
		System.out.println("----------------------");
		
		IPet p = new Dog();
		
		PetShop ps = new PetShop();
		
		ps.carePet(p);
		ps.carePet(new Cat());
		ps.carePet(pet[2]);
		
		System.out.println("----------------------");
		
		ps.petInfo(pet);
 	}
}
