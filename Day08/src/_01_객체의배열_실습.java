import javax.swing.JOptionPane;

//메인용 클래스 
public class _01_객체의배열_실습 {

	public static void main(String[] args) {
		String shwMsg = 
				"1. Pet 등록하기\n"
				+"2. Pet 정보보기\n"
				+"3. Pet 먹이주기\n"
				+"4. 프로그램 종료하기";
		Pet[] p = new Pet[5]; 
		// 객체생성 5개 되는게 아니라, 집문서만 5개 생기는 거임
		int count = 0;	// 현재 몇 마리인지 기록용
		
		menu : while(true){
			String ans = JOptionPane.showInputDialog(shwMsg);
			switch(ans){
			case "1":
				if (count == 5){
					JOptionPane.showMessageDialog(null, "더이상 기를 수 없어요!");
				} else {
					p[count] = new Pet();
					p[count].type = JOptionPane.showInputDialog("종류");
					p[count].name = JOptionPane.showInputDialog("이름");
					String month = JOptionPane.showInputDialog("개월 수");
					p[count].month = Integer.parseInt(month);
					JOptionPane.showMessageDialog(null, p[count].name +"을(를) 등록했어요~");
					count++; // 1마리 추가 표시
				}
				break;
			case "2":
				if(count != 0){
					String shwData = "";
					for(int i = 0; i<count; i++){
						shwData += 
								"이름 : " + p[i].name + "\n"
								+"종류 : " + p[i].type + "\n"
								+"개월 수 :" + p[i].month + "개월 \n"
								+"========================\n";
					}
					JOptionPane.showMessageDialog(null, shwData);
					
					String who="< 현재 배고픈 pet >\n";
					double avg = 0;
					for(int i = 0; i<count; i++){
						if(p[i].hungry == true){
							who += p[i].name + "\n";
						}
						avg += p[i].month;
					}
					avg /= count; // avg = avg/count;
					JOptionPane.showMessageDialog(null, who);
					JOptionPane.showMessageDialog(null, "평균 : " + avg + "개월");
					
				} else {
					JOptionPane.showMessageDialog(null, "현재 등록된 Pet이 없어요..");
				}
				break;
			case "3":
				String name = JOptionPane.showInputDialog("누구에게 먹이를 주시겠어요?");
				for(int i = 0; i<count; i++){
					if(name.equals(p[i].name)){ // o.name.equals(name)
						if(p[i].hungry == false)// 이미 밥을 먹었으면
							JOptionPane.showMessageDialog(null, "이미 배불러요~");
						else {
							p[i].hungry = false;
							JOptionPane.showMessageDialog(null, p[i].name + "에게 먹이를 주었습니다.");	
						}
					}
				}
				break;
			case "4":
				String aa = "";
				for(int i = 0; i<count; i++){
					aa += p[i].name + " ";
				}
				String yes = JOptionPane.showInputDialog(aa + "(이)가 슬퍼합니다. 그래도 가시겠어요?");
				if(yes.equals("예")){
					break menu;
				}
			default:
				JOptionPane.showMessageDialog(null, "잘못 입력!!");
			}
		}
		
	}
}














