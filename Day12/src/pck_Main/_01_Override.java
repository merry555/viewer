package pck_Main;
/*
 * <오버라이드 ? 부모 클래스의 메소드를, 자식 클래스가 수정하는 작업>
 *  -> 부모 클래스 '메소드의 원형을 똑같이' 가진 자식 클래스 메소드 
 *  참고) 메소드 원형 : 리턴자료형 메소드명(매개변수1 자료형, 매개변수2 자료형)
 *  	ex) void show(String)
 *  -> 부모 클래스의 메소드만 오버라이드 할 수 있다. 
 *  
 *  -> 부모 메소드의 시야는 자식 메소드에서 줄일 수 없다
 *  	public > protected > (default) > private 
 *  	public void show() -> private void show() (X)
 *  	private void show() -> public void show() (O)
 */
import pck_Src.*;
public class _01_Override {
	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student(100,100,100);		
		p.show();
		s.show();	
	}
}
// 클래스는 다중 상속이 불가능 : 메소드명 충돌 방지










