package p0617;

import java.util.Scanner;

public class C0617_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력하세요");
		String input = scan.next();
		
		System.out.println("숫자 입력하세요");
		int num = scan.nextInt();
		System.out.printf("입력 데이터 : %s \n",input);
//		System.out.println("입력 데이터 : "+input+","+"입력한 숫자 :"+num);
	}
}
