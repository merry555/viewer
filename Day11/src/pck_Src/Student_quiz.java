package pck_Src;

public class Student_quiz {

	String name;
	String phone;
	int kr, en, ma;
	double avg;
	char grade;

//  1) �̸��� ���� �� �ִ� ������ ( �������� ��� 0 )
	public Student_quiz(String name){
		this.name = name;
	}
//	2) �̸�, ����ó�� ������ �� �ִ� ������ 
	public Student_quiz(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
//	3) �̸�, ����ó, ������ ������ �� �ִ� ������ 
//	   -> �̶� ��հ� ������ �ڵ� ��� 
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
//	4) ���� �̸�, ����ó, ������ ������ �� �ִ� 
//	   setName(), setPhone(), setScore() �޼ҵ� ����
	public void setName(String name){
		this.name = name;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
//	5) setScore() �����ε� 
//	( �� ���� �Է��� ��� : ���� ����, 
//	     �� �� : ��, �� ����
//	     �� �� : ��, ��, �� ���� )
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
//	6) ����  �̸�, ����ó, ������ �˷��ִ�(��ȯ�ϴ�) 
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