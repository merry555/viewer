package pck_Main;

import javax.swing.JOptionPane;

import pck_Src.Student_quiz;

public class _00_Quiz_어제꺼실습 {

	public static void main(String[] args) {
		// 메인용 클래스에서 5개의 객체를 생성하고 for문과 jop을 사용하여 정보저장, 출력
		Student_quiz[] a = new Student_quiz[5];
		int count = 0;
		menu: while (true) {
			String menu = "1. 학생 등록\n" + "2. 학생 정보\n" + "3. 모든 학생 정보\n" + "4. 5명 평균 보기\n" + "5. 정보 수정하기 \n" + "6. 종료하기";
			String ans = JOptionPane.showInputDialog(menu);
			switch (ans) {
			case "1":
				// 1) 정보 입력
				String name = JOptionPane.showInputDialog("이름");
				String phone = JOptionPane.showInputDialog("연락처");
				String score = JOptionPane.showInputDialog("국어");
				int kr = Integer.parseInt(score);
				score = JOptionPane.showInputDialog("영어");
				int en = Integer.parseInt(score);
				score = JOptionPane.showInputDialog("수학");
				int ma = Integer.parseInt(score);
				a[count] = new Student_quiz(name, phone, kr, en, ma);
				count++;
				break;
			case "2":
				// 2) 학생 정보 출력
				// - 이름으로 검색 -> 검색 성공하면 평균, 학점 출력
				String data = JOptionPane.showInputDialog("이름으로 검색합니다..");
				for (int i = 0; i < count; i++) {
					if (data.equals(a[i].getName())) {
						String shwData = "평균 : " + a[i].getAvg() + "\n학점 : " + a[i].getGrade() + "\n";
						JOptionPane.showMessageDialog(null, shwData);
						break;
					}
				}
				break;
			case "3":
				// 3) 모든 학생 정보 출력
				// 1) 이름
				// 2) 연락처
				// 3) 점수
				String shw = "";
				for (int i = 0; i < count; i++) {
					shw += (i + 1) + "번 학생 정보\n" + "이름 : " + a[i].getName() + "\n" + "연락처 : " + a[i].getPhone() + "\n"
							+ "평균 : " + a[i].getAvg() + "\n========================\n";
				}
				JOptionPane.showMessageDialog(null, shw);
				break;
			case "4":
				// 4) 학생들 평균 점수(평균 총합/5)
				double avg = 0;
				for (int i = 0; i < count; i++) {
					avg += a[i].getAvg();
				}
				avg = avg / 5.0;
				JOptionPane.showMessageDialog(null, count + "명의 평균 : " + avg);
				break;
			case "5":
				// 5) 정보 수정 : 학생 이름을 통해 검색
				// - 수정할 항목 선택
				data = JOptionPane.showInputDialog("이름으로 검색합니다..");
				for (int i = 0; i < count; i++) {
					if (data.equals(a[i].getName())) {
						String shw2 = "수정할 항목을 선택하세요..\n" + "1. 이름 2. 연락처 3. 점수";
						String ans2 = JOptionPane.showInputDialog(shw2);
						switch (ans2) {
						case "1":
							String name2 = JOptionPane.showInputDialog("수정할 이름 입력");
							a[i].setName(name2);
							break;
						case "2":
							String phone2 = JOptionPane.showInputDialog("수정할 연락처 입력");
							a[i].setPhone(phone2);
							break;
						case "3":
							score = JOptionPane.showInputDialog("국어");
							kr = Integer.parseInt(score);
							score = JOptionPane.showInputDialog("영어");
							en = Integer.parseInt(score);
							score = JOptionPane.showInputDialog("수학");
							ma = Integer.parseInt(score);
							a[i].setScore(kr, en, ma);
							break;
						default:
							JOptionPane.showMessageDialog(null, "잘못 입력!");
						}
						break;
					}
				}
				break;
			case "6":

				break menu;
			default:
				JOptionPane.showMessageDialog(null, "잘못 입력!");
			}

		}
	}
}
