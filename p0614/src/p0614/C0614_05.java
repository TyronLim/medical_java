package p0614;

public class C0614_05 {

	public static void main(String[] args) {

		byte b = 127;
//		byte b2 = 128; // 에러 표시
		b = (byte) (b+10);
		
		System.out.println(b); // 오버플로우
		
		int num = 2147483647;
		num = num+1;
		System.out.println(num);
		
		// 문자열 타입 변경
//		char ch='A';
////		char ch2 = 'AA'; 2개이상 문자 안 됨
//		char ch3 = ' '; //가능(띄우기)
////		char ch4 = null; // null 안됨.
//		String str = "AA";
//		String str2 = "";
//		String str3 = null;
//		
//		String s1 = "A"+"B";
//		System.out.println(s1); //AB 출력
//		System.out.println(""+7+7+7); //문자열 + 타입 = 문자열로 변경됨
//		System.out.println(7+7+7+""+7); //문자열
//		
		
		
	}

}
