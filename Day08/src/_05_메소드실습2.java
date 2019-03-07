import javax.swing.JOptionPane;

//메인용 클래스
public class _05_메소드실습2 {

	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();
		Person c = new Person();
		
		setPersonName(a);
		setPersonName(b);
		setPersonName(c);
		
		setPersonAge(a);
		setPersonAge(b);
		setPersonAge(c);
		
		setHasPhone(a);
		setHasPhone(b);
		setHasPhone(c);
		
		showFields(a);
		showFields(b);
		showFields(c);
		
	}
	
//	Person 객체에 이름을 저장해줄 메소드
	static void setPersonName(Person p){
		p.name = JOptionPane.showInputDialog("이름");
	}
//	Person 객체에 나이를 저장해줄 메소드
	static void setPersonAge(Person p){
		String age = JOptionPane.showInputDialog("나이");
		p.age = Integer.parseInt(age);
	}
//	Person 객체에 핸드폰유무를 저장해줄 메소드
	static void setHasPhone(Person p){
		String hasPhone = JOptionPane.showInputDialog("핸드폰 있습니까?(Y/N)");
		if(hasPhone.equals("Y") || hasPhone.equals("y")){
			p.hasPhone = true;
		}else {
			p.hasPhone = false;
		}
	}
//	Person 객체의 모든 멤버를 출력하는 메소드
	static void showFields(Person p){
		String shw = "이름 : " + p.name + "\n" 
					+ "나이 : " + p.age + "\n"
					+ "핸드폰 유무 : " + p.hasPhone;
		JOptionPane.showMessageDialog(null,shw);
	}
	
	
	
	
}

















