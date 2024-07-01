package p0701;

import java.util.ArrayList;

public class C0701_02 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<Card>();
		list.add(new Card(1,"CLOVER"));
		list.add(new Card(10,"HEART"));
		list.add(new Card(2,"SPADE"));
//		list.add(2);	// generic 덕분에 오류가 남
		
		// list를 출력하시오.
		for (int i=0;i<list.size();i++) {
//			Card c = (Card) list.get(i);
			Card c = list.get(i);	//generic 덕분에 형 변환 안 해도 됨.
			System.out.printf("%d,%s\n",c.getterNumber(),c.getterKind());
			
		}
		
		
		
		//generic
//		ArrayList<E> list = new ArrayList<E>();
		
		
		
	}
}
