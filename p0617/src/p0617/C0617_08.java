package p0617;

import java.util.Scanner;

public class C0617_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 숫자를 입력받아, 양수-음수 출력될 수 있도록 구현하시오.
		// 0은 양수로 출력
		
		int a = 0;
		if(a>0) {
			System.out.println("양수입니다.");
		}else if(a==0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		
		if(a>0) System.out.println("양수입니다.");
		else if(a==0) System.out.println("0입니다.");
		else System.out.println("음수입니다.");
		
//		System.out.println("숫자를 입력하세요");
//		int num = scan.nextInt();
//		String absNum = num>0? "양수입니다.":num==0?"0입니다":"음수입니다";
//		System.out.println(absNum);
		
		
		
		
		
		
		
//		System.out.println("숫자 입력하세요");
//		int x = scan.nextInt();
//		int absX = x>=0?x:-x;
//		System.out.println(absX);
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자를 입력하세요");
//		String str = scan.nextLine();
//		System.out.println("입력한 문자의 길이 : "+str.length());
//		
	}
}
