package p0627;

public class Scv extends GroundUnit {

	Scv(){
		super(50);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		Unit u = (Unit)r; //형변환
		while(u.hitPoint != u.MAX_HP) {
			u.hitPoint+=5;
			System.out.println("에너지를 5씩 증가합니다.");
		}
	}
	
}
