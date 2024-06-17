package p0617;

import java.util.Scanner;

public class C0617_10 {

	public static void main(String[] args) {
		// 숫자를 입력받아 60점 이상이면 합격, 60점 미만이면 불합격을 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int num = scan.nextInt();
		
		// if문
//		if (num>=60) System.out.println("합격");
//		else System.out.println("불합격");
		
		// 삼항식
//		String num2 = num>=60?"합격":"불합격";
//		System.out.println(num2);
		
		// 90이상A , 80이상B, 70이상C, 60이상D, 그외F 출력
		if (num>=90) System.out.println("A");
		else if (num>=80) System.out.println("B");
		else if (num>=70) System.out.println("C");
		else if (num>=60) System.out.println("D");
		else System.out.println("F");
		
		
		
		
		
		
		
		
		
		
		
	}
}
