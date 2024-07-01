package p0701;

public class Card {
	private String password;
	private int number;
	private String kind;
	
	
	Card(){}
	Card(int number, String kind){ // 전체생성자
		this.number = number;
		this.kind = kind;
	}

	public int getterNumber() {
		return number;
	}
	
	public void setterNumber(int number) {
		if(number>13 || number<1) {
			return;
		}
		this.number = number;
	} //캡슐화
	
	public String getterKind() {
		return kind;
	}
	
	public void setterKind() {
		this.number = number;
	} //캡슐화
	
	
	public String getPassword(String id) {
		if(!(id.equals("admin"))) {
			return "";
		}
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return kind+","+number;
	}
	
	
	
	
}
