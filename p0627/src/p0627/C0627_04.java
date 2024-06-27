package p0627;

public class C0627_04 {

	public static void main(String[] args) {
		try {
			System.out.println("시작");
//			Exception e = new Exception("고의로 발생");
//			throw e;
			System.out.println(0/0);
		}catch(Exception e){
			System.out.println("에러 메시지 : "+e.getMessage());
			e.printStackTrace();	// 보통 사용자가 보게끔 하지 않음
		}
		System.out.println("프로그램을 종료합니다.");
		
		
	}
}
