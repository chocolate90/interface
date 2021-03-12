package quiz14;

public class MelonMusic implements SongList {

	//멤버변수
	private String[] list = new String[100];
	private int count = 0;

	/*
	 * insertList는 list배열에 매개변수를 순서대로 저장
	 * playList는 배열안에 음악을 랜덤하게 출력
	 * playLength는 음악의 개수를 반환.
	 * 
	 */

	@Override
	public void insertList(String song) {

		list[count] = song;
		count++;
		System.out.println(song + " 곡이 추가 되었습니다.");

	}

	@Override
	public void playList() {


		for(int i = 0; i < count; i++) {
			
			int ran = (int)(Math.random() * count);
			System.out.println(list[ran] + "곡이 재생됩니다.");
			
		}

	}

	@Override
	public int playLength() {

		return count;
	}

}
