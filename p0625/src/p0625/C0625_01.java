package p0625;

public class C0625_01 {

	public static void main(String[] args) {

		Circle c1 = new Circle(); // 기본생성자 호출
		
		System.out.println("반지름 : "+c1.r);
				
		System.out.println("포인트센터x : " +c1.center.x);
		System.out.println("포인트센터y : " +c1.center.y);
		
		
		Circle c2 = new Circle(new Point(150,150),50);
//		Point p = new Point(150,150);
//		Circle c2 = new Circle(p,50); 다른 방법
		
		System.out.printf("(%d,%d)\n",c2.center.x,c2.center.y);
		c2.draw();
		
		
		int[] a = {1,2,3};
		Point p1 = new Point(100,100);
		Point p2 = new Point(140,50);
		Point p3 = new Point(200,100);
		
		Point[] p = {p1,p2,p3};
		Triangle t1 = new Triangle(p);
		
		Point[] p4 = {new Point(100,100),new Point(140,50),new Point(200,100)};
		Triangle t2 = new Triangle(p4);
		
		Triangle t3 = new Triangle(new Point(0,0),new Point(100,100),new Point(50,50));
		
		
		
		
		
		
		
		
		
		
		
//		Point3D p = new Point3D();
//		// int x;
//		// int y;
//		p.x = 100;
//		int z;
//		System.out.println(p.x);
//		
//		p.r = 10;
//		System.out.println(p.r);
//		
//		Point p2 = new Point();
		
		
		
	}
}
