package p0617;

public class C0617_17 {

	public static void main(String[] args) {
		// 1-100까지의 랜덤 숫자 10개 생성해서 10개의 숫자의 합을 출력하시오.
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			int num = (int)(Math.random()*100)+1;
			sum = sum+num;
			System.out.printf("랜덤숫자 : %d ",num);
			System.out.printf("지금까지 합 : %d \n",sum);
		}
		System.out.println("결과 : "+sum);
		
		
	}
}
