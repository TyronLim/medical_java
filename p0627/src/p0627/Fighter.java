package p0627;

// 클래스를 상속받아 구현하려면 extends 사용
// 인터페이스 상속받아 구현하려면 implements 사용
public class Fighter extends Unit implements Fightable{

	Fighter(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit u) {
		
	};
	
	
	
	
	
}
