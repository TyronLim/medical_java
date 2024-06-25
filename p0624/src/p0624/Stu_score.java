package p0624;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Stu_score {
	
	static int count; // 클래스 변수: 모든 객체가 공통으로 사용
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{// 초기화 블럭
		count++;
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		//S20240001...
		stuNo = "S"+sdf.format(d)+String.format("%03d", count);
	}
	
	// 기본 생성자
	Stu_score(){
	}
	
	//매개변수 생성자
	Stu_score(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
		avg = total/3.0;
	}

	
	
	
	
	
}
