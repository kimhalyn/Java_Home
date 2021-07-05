import java.awt.*;
import java.awt.event.*;

/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_익명 클래스
 * 이름: 김하린
 * 이름없는 일회용 클래스, 이름이 없기 때문에 단독으로 객체 생성 불가 
 * -> 조상클래스나 구현인터페이스 이름으로 객체 생성(클래스의 정의와 객체 생성을 동시에) 	
 */
public class Ex7_032 {
	public static void main(String[] args) {
//		익명클래스로 변경 후
		Button b = new Button("start");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occured!!!");
			}
		});
	}
}

//	익명클래스로 변경하기 전
//	public static void main(String[] args) {
//		Button b = new Button("start");
//		b.addActionListener(new EventHandler());
//	}
//}

//class EventHandler implements ActionListener{
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("ActionEvent occured!!!");
//	}
//}

