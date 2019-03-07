import javax.swing.JOptionPane;

//설계용 클래스
public class Person {

	String name;
	int age;
	boolean hasPhone;
	
	void setName(){
		name = JOptionPane.showInputDialog("이름");
	}
	void setAge(){
		String a = JOptionPane.showInputDialog("나이");
		age = Integer.parseInt(a);
	}
	void setHasphone(){
		String h = JOptionPane.showInputDialog("핸드폰 있습니까?(Y/N)");
		if(h.equals("Y") || h.equals("y")){
			hasPhone = true;
		}else {
			hasPhone = false;
		}
	}
	
	void showFields(){
		String shw = "이름 : " + name + "\n" 
				+ "나이 : " + age + "\n"
				+ "핸드폰 유무 : " + hasPhone;
		JOptionPane.showMessageDialog(null,shw);
	}

}
