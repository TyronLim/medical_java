package p0625;

public class Buyer {
	int money = 10000000;
	int bonusPoint=0;
	
	void buy(Product p) {
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		System.out.println(p.name+"을 구매하셨습니다.");
	}
	
}
