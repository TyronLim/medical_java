package p0621;

public class C0621_03 {

	public static void main(String[] args) {
		
		Cal cal = new Cal();	// 객체선언
		int result2 = cal.add(10,7);
		System.out.println("result2 : "+result2);
		
		C0621_03 c = new C0621_03();  // 객체선언
		int result = c.add(10, 5);
		System.out.println("result : "+result);
		
		
		
	}
	
	// 메소드 선언
	// 리턴타입과 return 결과값은 타입이 같아야 함.
	int add(int a,int b) {
		
		int result = a+b;
		
		return result;
	}
	
	// void 는 리턴이 필요 없음.
	void add2(int a,int b) {
		System.out.println(a+b);
		
	}
	
}
