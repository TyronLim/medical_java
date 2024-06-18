package p0618;

import java.util.Scanner;

public class C0618_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 3,3 홍길동, 유관순, 이순신의 국어, 영어, 수학 성적을 입력받아 출력하시오.
		String subject[] = {"이름","국어","영어","수학"};
		int score[][] = new int[3][3];
		String name[] = new String[3];
		
		for (int i=0;i<score.length;i++) {
			System.out.println(subject[0]+"을 입력하세요." );
			name[i] = scan.next();
			for(int j=0;j<score[i].length;j++) {
				System.out.println(subject[j+1]+"점수를 입력하세요.");
				score[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("===============================");
		for (int i=0;i<subject.length;i++){	
			System.out.print(subject[i]+"\t");
			}
		System.out.println();
		System.out.println("-------------------------------");
		
		for (int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		
	}
}
