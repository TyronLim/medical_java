package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1-100 랜덤 숫자를 생성해서 랜덤 숫자를 맞추는 프로그램 구현하시오.
		// 숫자를 입력해서 큰 수를 입력하세요 or 작은 수를 입력하세요
		// 10번까지 시도할 수 있게 구현
		
		int rand = (int)(Math.random()*100)+1;
		int cnt = 0;
		int count[] = new int[10];
		for (int i=0;i<10;i++) {
			System.out.printf("%d번째 기회입니다. 숫자를 입력하세요.",i+1);
			int input = scan.nextInt();
			if (input==rand) {
				System.out.println("숫자를 맞히셨습니다.");
				break;
			}else if(input<rand){
				System.out.println("더 큰 수를 입력하세요.");
			}else if(input>rand) {
				System.out.println("더 작은 수를 입력하세요.");
			}else if(input<1 || input>100) {
				System.out.println("1에서 100까지의 수를 입력하세요.");
			}else {
				System.out.println("숫자를 올바르게 입력하세요.");
			}	
			count[cnt] = input;
			cnt++;
		}//for
		if (cnt == 10) {
			System.out.println("10번의 기회가 끝났습니다. 다시 시도해 주세요.");
			int count2[] = new int[10];
			for(int i=0;i<cnt;i++){
				count2[i] = rand-count[i];
				if (count2[i]<0) {
					count2[i] = (count2[i]*-1);
				}
			}
			
			System.out.println(Arrays.toString(count2));
			int cnt2 = 0;
			int num2 = 0;
			loop1:for (int i=0; i<cnt;i++) {
				for(int j=0;j<count2.length;j++) {
					if (i<=j) {
						cnt2 = i;
						num2 = count[i];
						break loop1;
					}
				}
			}
			System.out.println("cnt값 :"+cnt2);
			
			System.out.println("랜덤 값 : "+rand);
			System.out.printf("가장 근사한 입력 값은");
			System.out.println(count[cnt2]);
			System.out.print("입니다.");
				
			
			
			
		}else if(cnt <10) {
			System.out.printf("축하합니다. %d번째 기회에 숫자를 맞히셨습니다.",cnt+1);
		}
		
//		System.out.println(Arrays.toString(count));
		// 정답이 없을 때, 가장 근사치의 값을 출력시켜보세요.
		
		
		
		
		
		
		
		
	}
}
