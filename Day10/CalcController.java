package Day10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController implements ActionListener{ // 모든 페이지를 제어 하고 연결 (/src/CalcView): mapping
	
	CalcView cv; // 객체를 변수로 받는다 (객체변수 선언)
	// 생성자에 View 에 해당하는 클래스를 인스턴스화 시켜서 -> View 객체 실행
	
	CalcController(){
		cv = new CalcView();
		cv.btn_plus.addActionListener(this); // 버튼의 이벤트가 발생 되었을때 알려준다.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == cv.btn_plus) {
			int num1 = Integer.parseInt(cv.tr_num1.getText());  // 텍스트 값을 반환한다.
			int num2 = Integer.parseInt(cv.tr_num2.getText());
			
			CalcModel calc = new CalcModel();
			int result = calc.plus(num1, num2); // Controller가 Model을 처리하고 결과값을 return 한다.
			
			cv.la_result.setText("결과는 "+result+" 입니다.");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CalcController();
		
		
	}

	

}
