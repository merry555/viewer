import javax.swing.JOptionPane;

//����� Ŭ����
public class Person {

	String name;
	int age;
	boolean hasPhone;
	
	void setName(){
		name = JOptionPane.showInputDialog("�̸�");
	}
	void setAge(){
		String a = JOptionPane.showInputDialog("����");
		age = Integer.parseInt(a);
	}
	void setHasphone(){
		String h = JOptionPane.showInputDialog("�ڵ��� �ֽ��ϱ�?(Y/N)");
		if(h.equals("Y") || h.equals("y")){
			hasPhone = true;
		}else {
			hasPhone = false;
		}
	}
	
	void showFields(){
		String shw = "�̸� : " + name + "\n" 
				+ "���� : " + age + "\n"
				+ "�ڵ��� ���� : " + hasPhone;
		JOptionPane.showMessageDialog(null,shw);
	}

}