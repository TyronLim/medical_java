package p0628;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Students {
	
	static int count =1;
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		this.stuNo = "S"+sdf.format(d)+String.format("%03d", count++);
	}
	
	Students(){}
	Students(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math =math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	private String stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	
	
	
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Students.count = count;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null&&obj instanceof Students) {
			Students s = (Students) obj;
			
			return stuNo == s.stuNo;
		}else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s,%s,%d,%d,%d", stuNo,name,kor,eng,math);
	}
	
	
	
	
}
