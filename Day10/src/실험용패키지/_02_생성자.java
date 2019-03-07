package 실험용패키지;

public class _02_생성자 {

	public static void main(String[] args) {
//		Person a = new Person();
//		Person b = new Person();
//		Person c = new Person();
//		
//		a.setAllMembers("둘리", 10, false);
//		b.setAllMembers("또치", 20, true);
//		c.name = "희동이";
//		c.age = 3;
//		c.hasPhone = false;
		
		
		int n;
		n = 1;
//		int n = 1;
//		변수도 선언 따로, 초기화 따로 할 수 있지만
//		선언과 동시에 초기화해주는, 즉 한 줄로 끝내는 방법이 편하다.
//		객체도 생성함과 동시에 초기화하는 간편한 방법이 없을까?
//		=> 생성자(Constructor) 오버로딩
		
		Person p1 = new Person("둘리", 10, true);
//		에러 : Person p2 = new Person();
//		기본 모양의 생성자가 사라졌기때문! 
		System.out.println(p1.name + ", " +p1.age + ", " + p1.hasPhone);
		
		Person p2 = new Person();
		Person p3 = new Person("희동");
		Person p4 = new Person(10);
		
//		결론 : 생성자를 많이 정의해놓으면
//		좀 더 편리하게 객체를 생성할 수 있다!
		
		
		
		
		
		
	}
}
