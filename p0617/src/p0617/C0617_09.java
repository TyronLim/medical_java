package p0617;

public class C0617_09 {

	public static void main(String[] args) {
		// 문자열은 선언 방법 2가지
		String str = "안녕";
		String str2 = "안녕2";
		String str3 = new String("안녕");
		int num = 5;
		int num2 = 5;
		// 기본타입 8개는 비교연산자를 통해 확인 가능
		if(num==num2) {
			System.out.println("같은 숫자입니다.");
		}else {
			System.out.println("다은 숫자입니다.");
		}
		
		
		// 문자열, 참조변수 비교는 "=="으로는 비교가 안 됨. equals메소드 사용해야 함.
		if (str.equals(str3)) {
			System.out.println("같은 문자입니다.");
		}else {
			System.out.println("다른 문자입니다.");
		}
		
		System.out.println("str :"+str);
		System.out.println("new str :"+str3);
		
		System.out.println("---------------------");
		if(str3.equals("안녕")) {
			System.out.println("같은 문자입니다.");
		}else {
			System.out.println("다른 문자입니다.");
		}
		
		
	}
}
