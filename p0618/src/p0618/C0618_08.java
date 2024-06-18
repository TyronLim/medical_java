package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_08 {

	public static void main(String[] args) {
		
		// 로또번호 생성하기
		int ball[] = new int[45];
		for (int i=0; i<ball.length;i++) {
			ball[i] = i+1;		
		}
//		System.out.println(Arrays.toString(ball));
		
//		int no = 0; 	//랜덤번호
//		int t_value = 0;   //값 저장
//		
//		for(int i=0;i<300;i++) {
//			no = (int)(Math.random()*45); // 0~44 랜덤 숫자 하나
//			t_value = ball[0];
//			ball[0] = ball[no];
//			ball[no] = t_value;
//		}
//		System.out.println(Arrays.toString(ball));
//		
//		
		int a = 0;
		int b = 0;
		for (int i=0;i<300;i++) {
			a = (int)(Math.random()*45);
			b = ball[0];
			ball[0] = ball[a];
			ball[a] = b;
		}

		System.out.println();
		System.out.print("당첨번호 :");
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		
		System.out.println(" ");
		int myNum[] = new int[6]; 
		int num = 0;
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		while (cnt<6) {
			System.out.printf("%d번째 번호를 입력하세요",cnt+1);
			num = scan.nextInt();
			if (num<1 || num>45) {
				System.out.println("1~45까지만 입력하셔야 합니다. 다시 입력해주세요.");
				continue;
			}
			myNum[cnt] = num;
			cnt++;
		}
		
		System.out.print("내가 찍은 번호 : ");
		for(int i=0;i<myNum.length;i++) {
			System.out.print(myNum[i]+" ");
		}
		
		int count = 0;
		int lotto[] = new int[6];
		for(int i=0;i<myNum.length;i++) {
			for(int j=0; j<6;j++) {
				if(myNum[i]==ball[j]) {
					count++;
					lotto[i]=myNum[i];
				}
			}
		}
		System.out.println(" ");
		System.out.println("맞힌 개수 : "+count);
		
		System.out.print("맞힌 숫자 : ");
		for (int i=0;i<lotto.length;i++) {
			if(lotto[i]==0) continue;
			System.out.print(lotto[i]+" ");
		}
		if(count==0) {
			System.out.print("없음");
		}
		
		
		System.out.println(" ");
		switch(count) {
		case 6: 
			System.out.println("1등입니다. 100억 당첨을 축하드립니다!!");
			break;
		case 5: 
			System.out.println("2등입니다. 1억 당첨을 축하드립니다!!");
			break;
		case 4: 
			System.out.println("3등입니다. 1백만원 당첨을 축하드립니다!!");
			break;
		case 3: 
			System.out.println("4등입니다. 1만원 당첨을 축하드립니다!!");
			break;
		default:
			System.out.println("아쉽네요. 다음에 도전하세요!");
		}
		// 당첨금액 : 6:100억  5:1억  4:1백만원  3:1만원
		
	}
}
