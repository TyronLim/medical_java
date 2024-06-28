package p0628;

import java.util.ArrayList;
import java.util.Vector;

public class C0628_06 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		ArrayList<Students> list = new ArrayList<Students>();
		
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",99,99,99));
		list.add(new Students("이순신",80,80,99));
		list.add(new Students("강감찬",70,70,79));
		list.add(new Students("김구",100,100,99));
		list.remove(1);
		list.remove(2);	// 조심해야 함. 이미 삭제된 list에서 또 2번을 찾음.
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
//		ArrayList<Card> list = new ArrayList<Card>(); // 제너릭
//		list.add(new Card(1,"SPADE"));
//		list.add(new Card(2,"SPADE"));
//		list.add(new Card(2,"DIAMOND"));
//		list.add(new Card(3,"HEART"));
//		list.add(new Card(4,"CLOVER"));
////		list.add("안녕");	// 제너릭 때문에 Card 이외의 형태가 들어가면 에러
//		
//		for(int i=0;i<list.size();i++) {
////			Card c = (Card) list.get(i); // 제너릭 덕분에 Card로 강제형변환 할 필요 없음
//			System.out.println(list.get(i).number+","+list.get(i).kind);
//		}
		
		
		
//		ArrayList list = new ArrayList();
//		list.add("홍길동");
//		list.add("유관순");
//		list.add("이순신");
//		list.add("김구");
//		list.add("강감찬");
//		list.remove(1);	// 1번(유관순) 삭제
//		list.remove(1);	// 땡겨져서 1번(이순신) 삭제
//		list.remove("김구"); // 값을 써서 삭제
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		
//		//List : 순서가 있음. 중복을 허용함.
//		ArrayList list2 = new ArrayList();
//		list2.add(1); //add 명령어 : 추가
//		list2.add(2);
//		list2.add(3);
//		list2.add(1);
//		list2.remove(1); // remove : 삭제
//		
//		// size() : 크기 확인
//		for(int i=0;i<list2.size();i++) {
//			System.out.println(list2.get(i)); //get() : 읽어오기
//		}
//		
		
	}
}
