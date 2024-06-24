package p0624;

public class C0624_06 {

	public static void main(String[] args) {
		
		int kor = 100;
		int eng = 100;
		int math = 100;
		System.out.println("현재 국어점수 : "+kor);
		System.out.println("현재 영어점수 : "+eng);
		System.out.println("현재 수학점수 : "+math);
		
		// 메소드 사용
		Calculate c = new Calculate();
		int score[] = new int[3];
		c.Change(score);
		
		System.out.println("변경 국어점수 : "+score[0]);
		System.out.println("변경 영어점수 : "+score[1]);
		System.out.println("변경 수학점수 : "+score[2]);
		
		
		
		
//		kor = c.Change(kor);
//		eng = c.Change(eng);
//		math = c.Change(eng);
//		
//		System.out.println("변경 국어점수 : "+kor);
//		System.out.println("변경 영어점수 : "+eng);
//		System.out.println("변경 수학점수 : "+math);
		
		
		
		
		
		
	}
}
