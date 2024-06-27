package p0627;

public class C0627_01 extends Object{	// 모든 클래스는 Object 상속

	public static void main(String[] args) {
		
//	Unit u = new Unit(); abstract 클래스는 객체선언 안 됨.
	Marine m = new Marine(); //보병 1명
	System.out.println("m현재 체력 : "+m.hitPoint);
	
	Tank t = new Tank(); //탱크 1개
	System.out.println("t현재 체력 : "+t.hitPoint);
	
	Dropship d = new Dropship(); //탱크 1개
	System.out.println("d현재 체력 : "+d.hitPoint);
	
	System.out.println("탱크가 포탄을 맞았습니다.");
	hpDown(t);
	hpDown(t);
	hpDown(t);
	hpDown(t);
	hpDown(t);
	System.out.println("t현재 체력 : "+t.hitPoint);
	

	System.out.println("드랍쉽이 포탄을 맞았습니다.");
	hpDown(d);
	hpDown(d);
	System.out.println("d현재 체력 : "+d.hitPoint);
	hpDown(m);
	hpDown(m);
	hpDown(m);
	System.out.println("m현재 체력 : "+m.hitPoint);
	
	// Scv는 기계를 수리할 수 있는 능력을 가짐.
	Scv s = new Scv(); // Scv 한 개 생성
	s.repair(t);
	System.out.println("t현재 체력 : "+t.hitPoint);
	
//	s.repair(m);
	System.out.println("m현재 체력 : "+m.hitPoint);
	s.repair(d);
	System.out.println("d현재 체력 : "+d.hitPoint);
	
	}
	
	static void hpDown(Unit u) {
		u.hitPoint -= 10;
		
	}

	
	
	
	
	
	
//	int add(int x,int y) {
//		int result = x+y;
//		return result;
//	}
//	
//	Marine move(int x,int y) {
//		Marine m = new Marine();
//		return m;
//	}
//	
//	Unit start(int x,int y) {
//		Marine m = new Marine();
//		return m;
//	}
	
}


