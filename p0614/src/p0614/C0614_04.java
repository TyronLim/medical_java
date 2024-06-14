package p0614;

public class C0614_04 {

	static int num; // 클래스 내 변수(인스턴스 변수) : 자동으로 초기화가 됨
	
	
	
	public static void main(String[] args) {
		
		// 메소드 내에서는 무조건 변수값을 초기화를 해야 함.
		int score; // 자동 초기화 안 됨.
		score = 10;
		
		System.out.println(score); // score를 초기화 해주지 않으면 에러
		System.out.println(num);   // 클래스 변수이기에 초기화를 안 해줘도 됨.
		

	}

}
