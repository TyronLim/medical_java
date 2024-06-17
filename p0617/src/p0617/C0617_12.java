package p0617;

import java.util.Scanner;

public class C0617_12 {

	public static void main(String[] args) {
		// 점수를 입력받아 A, B, C, D, F를 출력할 수 있게 구현
		// 90~92: A-   97~100:A+  ...
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		
		if (score>=90) {
			if(score<=92) {
				System.out.println("A-");
			}else if(score>=97) {
				System.out.println("A+");
			}else
				System.out.println("A");
		}else if(score>=80) {
			if(score<=82) {
				System.out.println("B-");
			}else if(score>=87) {
				System.out.println("B+");
			}else
				System.out.println("B");
		}else if(score>=70) {
			if(score<=72) {
				System.out.println("C-");
			}else if(score>=77) {
				System.out.println("C+");
			}else
				System.out.println("C");
		}else if(score>=60) {
			if(score<=62) {
				System.out.println("D-");
			}else if(score>=67) {
				System.out.println("D+");
			}else
				System.out.println("D");
		}else
			System.out.println("F");
		
	}
}
