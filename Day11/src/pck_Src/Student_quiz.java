package pck_Src;

public class Student_quiz {

	String name;
	String phone;
	int kr, en, ma;
	double avg;
	char grade;

//  1) 이름만 넣을 수 있는 생성자 ( 나머지는 모두 0 )
	public Student_quiz(String name){
		this.name = name;
	}
//	2) 이름, 연락처만 저장할 수 있는 생성자 
	public Student_quiz(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
//	3) 이름, 연락처, 국영수 저장할 수 있는 생성자 
//	   -> 이때 평균과 학점은 자동 계산 
	public Student_quiz(String name, String phone, int kr, int en, int ma){
		this.name = name;
		this.phone = phone;
		this.kr= kr;
		this.en = en;
		this.ma = ma;
		
		this.avg = (this.kr + this.en + this.ma)/3.0;
		if(this.avg >= 90) this.grade = 'A';
		else if(this.avg>=80) this.grade = 'B';
		else if(this.avg>=70) this.grade = 'C';
		else if(this.avg>=60) this.grade = 'D';
		else this.grade = 'F';
	}
//	4) 각각 이름, 연락처, 점수를 수정할 수 있는 
//	   setName(), setPhone(), setScore() 메소드 정의
	public void setName(String name){
		this.name = name;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
//	5) setScore() 오버로딩 
//	( 한 개만 입력할 경우 : 국어 수정, 
//	     두 개 : 국, 영 수정
//	     세 개 : 국, 영, 수 수정 )
	public void setScore(int kr){
		this.kr = kr;
		setData();
	}
	public void setScore(int kr, int en){
		this.kr = kr;
		this.en = en;
		setData();
	}
	public void setScore(int kr, int en, int ma){
		this.kr = kr;
		this.en = en;
		this.ma = ma;
		setData();
	}
	private void setData(){
		this.avg = (this.kr + this.en + this.ma)/3.0;
		if(this.avg >= 90) this.grade = 'A';
		else if(this.avg>=80) this.grade = 'B';
		else if(this.avg>=70) this.grade = 'C';
		else if(this.avg>=60) this.grade = 'D';
		else this.grade = 'F';
	}
//	6) 각각  이름, 연락처, 점수를 알려주는(반환하는) 
//		- getName(), getPhone(), getAvg(), getGrade()
	public String getName(){
		return this.name;
	}
	public String getPhone(){
		return this.phone;
	}
	public double getAvg(){
		return this.avg;
	}
	public char getGrade(){
		return this.grade;
	}
	
	
	
	
	
	
	
	
	
	
	
}
