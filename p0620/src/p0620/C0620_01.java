package p0620;

import java.util.Arrays;
import java.util.Scanner;

public class C0620_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] score = new String[45];
		for(int i=0; i<score.length;i++) {
			score[i] = i+1+"";
		}
//		System.out.println(Arrays.toString(score));
		
		String arr[][] = new String[5][5];	//  1~25까지 넣고 배열을 섞으시오.
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = (i*5)+(j+1)+"";
			}
		}
		String a = "0";
		for(int i=0;i<500;i++) {
			int ran = (int)(Math.random()*5);
			int ran2 = (int)(Math.random()*5);
			a = arr[0][0];
			arr[0][0] = arr[ran][ran2];
			arr[ran][ran2]=a;
		}
		
		int game_cnt = 0;
		// 2차원배열 출력
		while(true) {
			game_cnt ++;
			if(game_cnt>=25) {
				System.out.println("25번을 다 사용했습니다. 끝~~");
				break;
			}
			System.out.println("            [ 2차원배열 출력 ]");
			System.out.println("-------------------------------------------");
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
			
			System.out.println("1-25까지의 숫자를 입력하세요.>>");
			int input = scan.nextInt();
			if(input<1 || input>25) {
				System.out.println("잘못입력했습니다. 1~25 숫자를 다시 입력하세요.");
				continue;
			}
			
			// 1-25까지의 숫자를 넣으면 X표시가 나타나도록 구현하시오.
			
			int cnt = 0;
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if((input+"").equals(arr[i][j])) {
						arr[i][j]="X";
						cnt =1;
					}
				}
			}
			if(cnt==0) {
				System.out.println("이미 X좌표입니다. 다시 입력하세요.");
			}
			
			System.out.println("입력한 숫자 : "+input);
			System.out.println();
			
			
			
			
		}
	}
}
