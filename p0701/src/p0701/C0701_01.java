package p0701;

public class C0701_01 {

	public static void main(String[] args) {
		// ArrayList
		// Set 읽을 떄 iterator
		 
		// iterator : hasnext()
		Card c = new Card();
//		c.number = 12;
		c.setterNumber(11);
		System.out.println(c.getterNumber());
		
		c.setPassword("1111");
		String p1 = c.getPassword("admin"); /// id 입력
		System.out.println(p1);
		
		
		
		
	}
}
