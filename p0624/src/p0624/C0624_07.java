package p0624;

public class C0624_07 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// Element의 메소드를 활용해서 
		// a,b의 사칙연산결과값을 출력하시오.
		// 더하기:15, 빼기:5, 곱하기:50, 나누기:2
		int result[] = new int[4];
		
		Element c = new Element();
		c.allCal(a,b,result);
		System.out.println("더하기 값 : "+result[0]);
		System.out.println("빼기 값 : "+result[1]);
		System.out.println("곱하기 값 : "+result[2]);
		System.out.println("나누기 값 : "+result[3]);
		
		
		
	}
}
