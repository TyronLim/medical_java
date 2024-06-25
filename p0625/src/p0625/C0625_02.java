package p0625;

import java.util.Arrays;

public class C0625_02 {

	public static void main(String[] args) {
		
		Deck d = new Deck(); //52장 트럼프 카드가 있음.
				
		d.shuffle();
		Card[] cc = d.pick5();
		for(int i=0;i<cc.length;i++) {
		System.out.printf("카드%d : (%d,%s)\n",i+1,cc[i].number,cc[i].kind);			
		}
		
		Card[] cc2 = d.pick5();
		for(int i=0;i<cc.length;i++) {
			System.out.printf("카드%d : (%d,%s)\n",i+1,cc2[i].number,cc2[i].kind);			
		}
		
		System.out.println("카드 객체 : "+cc2[0]);
		
		
//		for(int i=0;i<52;i++) {
//			System.out.printf("카드%d : (%d,%s)\n",i+1,d.c[i].number,d.c[i].kind);
//		}
		
//		d.shuffle();
//		Card card = d.pick();
//		System.out.printf("카드1장 : %s,%d \n",card.kind,card.number);
//		Card card2 = d.pick(4); // 몇 번째 뽑을 건지.
//		System.out.printf("카드1장 : %s,%d \n",card2.kind,card2.number);
		
//		Card[] c = new Card[52];
//		int[] number = new int[52];
//		String[] kind = new String[52];
//		String[] shape = {"CLOVER","HEART","DIAMOND","SPADE"};
//		for(int i=0; i<52; i++) {
//			number[i] = i%13+1;
//			kind[i] = shape[i/13];
//		}
//				
//		System.out.println(Arrays.toString(number));
//		System.out.println(Arrays.toString(kind));

		
//		for(int i=0;i<4;i++) {
//			for(int j=0; j<13; j++) {
//				kind[(i*13)+j]= shape[i];
//				
//			}
//		}
		
//		int arrr[] = new int[30];
//		for(int i=0; i<30;i++) {
//			arrr[i] = i/10*10+1;
//		}
//		System.out.println(Arrays.toString(arrr));
	}
}
