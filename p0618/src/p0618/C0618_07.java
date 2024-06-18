package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 45개의 ball 배열을 생성 1-45까지 숫자를 입력
		int ball[] = new int[45];
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
//		System.out.println(Arrays.toString(myArr));
		// 45개 랜덤 섞기
		int no = 0; 	//랜덤번호
		int t_value = 0;   //값 저장
		
		for(int i=0;i<300;i++) {
			no = (int)(Math.random()*45); // 0~44 랜덤 숫자 하나
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		}
		System.out.println(Arrays.toString(ball));
		// 그 중에 당첨번호 6개 뽑아서 출력
		System.out.print("로또 번호 :");
		for(int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println(" ");
		
//		System.out.println(Arrays.toString(ball));
		// 1-45까지 6개 숫자를 입력받아 myArr
		int myArr[] = new int[6];
		for (int i=0;i<myArr.length;i++) {
			System.out.printf("1~45까지 숫자 중 %d번째 숫자를 입력하세요",i+1);
			int num = scan.nextInt();
			myArr[i] = num;
		}
		
		System.out.print("입력한 숫자 : ");
		for(int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		}
		
		
//		// 10개짜리 배열을 생성하고 숫자를 입력받아 3,4번째 숫자만 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		
//		int arr[] = new int[10];
//		for (int i=0;i<10;i++) {
//			System.out.printf("%d번째 숫자를 입력하세요",i);
//			int num = scan.nextInt();
//			arr[i] = num;
//		}
//		System.out.printf("3번째 숫자 : %d, 4번째 숫자 : %d",arr[3],arr[4]);
//		
	}
}
