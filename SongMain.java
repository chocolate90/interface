package quiz14;

import java.util.Scanner;

public class SongMain {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		SongList melon = new MelonMusic();
		
		while(true) {
		
			System.out.println("[메뉴] 1. 추가, 2. 재생, 3. 종료");
			System.out.print(">");
			String menu = scan.next();
			
			if(menu.equals("1") || menu.equals("추가")) {
				
				System.out.print("추가할 노래 >");
				String name = scan.next();
				melon.insertList(name);
				
				int count = melon.playLength();
				System.out.println("곡 수:" + count);
				
			} else if (menu.equals("2")) {
				
				melon.playList();
				
			} else if (menu.equals("3")) {
				
				System.out.println("멜론을 종료합니다.");
				break;
				
			} else { // 잘못입력
				
				System.out.println("1. 추가, 2. 재생, 3. 종료만 입력해 주세요.");
			}
		}
		
		scan.close();
	}
}
