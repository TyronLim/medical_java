package p0619;

public class C0619_05 {

	public static void main(String[] args) {
		// 5,5 배열 생성해서 1~25 숫자를 입력하고 랜덤으로 섞은 후 출력하시오.
		
		int[][] arr = new int[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = (i*5)+(j+1);
			}
		}
		
		int a= 0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				int b = (int)(Math.random()*5);
				int c = (int)(Math.random()*5);
				a = arr[0][0];
				arr[0][0] = arr[b][c];
				arr[b][c] = a;
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
