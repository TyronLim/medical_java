package p0618;

public class C0618_04 {

	public static void main(String[] args) {
		// 구구단 4X4에서 멈추기
//		loop1:for(int i=2;i<=9;i++) {
//			System.out.printf("[%d단]\n",i);
//			loop2:for(int j=1;j<=9;j++) {
//				System.out.printf("%d X %d = %d \n",i,j,i*j);
//				if (i==4 && j==4) break loop1;
//			}
//		}
		
		
		int j = 0;
		for(int i=2;i<=9;i++) {
			System.out.printf("[%d단]\n",i);
			for(j=1;j<=9;j++) {
				System.out.printf("%d X %d = %d \n",i,j,i*j);
				if (i==4 && j==4) break;
			}
			if (i==4 && j==4) break;
		}
		
		
	}
}
