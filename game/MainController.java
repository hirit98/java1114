package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import game.GameController;
import game.RankController;

public class MainController implements ActionListener{
	
	MainView mainView;
	
	public MainController() {
		mainView = new MainView();
		mainView.btn_game.addActionListener(this); // 게임시작 이벤트 탐지
		mainView.btn_rank.addActionListener(this); // 랭크확인 이벤트 탐지
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mainView.btn_game) { // 게임시작 버튼 true
			new GameController();
			mainView.setVisible(false);
			
		}else if(e.getSource()==mainView.btn_rank) { // 랭크확인 버튼 true
			new RankController();
			mainView.setVisible(false);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MainController();
	}

	

}
