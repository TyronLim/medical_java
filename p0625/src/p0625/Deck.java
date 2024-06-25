package p0625;

public class Deck {
	// 1,2,3.... 11-J,12-Q,13-K     : 무늬당 13장 * 4종류 : 52장
	
	Card[] c = new Card[52]; //배열 선언
	String[] shape = {"CLOVER","HEART","DIAMOND","SPADE"};
	int count = 0;
	
	
	// 1,2,3,4,5,6,7,8,9,10
	Deck() { //기본생성자
		int[] number = new int[52];
		String[] kind = new String[52];
		for(int i=0; i<52; i++) {
			c[i] = new Card();
//			c[i].number = i%13+1;
//			c[i].kind = shape[i/13];
			c[i] = new Card(i%13+1,shape[i/13]);
		}
	}
	
	//카드 섞기 메소드
	void shuffle() {
		for(int i=0;i<300;i++) {
			int random = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}
	
	Card pick() {
		Card card = c[count];
		count++;
		return card;
	}
	
	Card pick(int n) {
		Card card = c[n];		
		return card;
//		return c[n]; 바로 리턴할 수도 있음.
	}
	
	Card[] pick5() {
		Card[] cc = new Card[5];
		for(int i=0;i<5;i++) {
			cc[i] = c[count++];
		}
		return cc;
	}
	

}
