import java.awt.*;
import java.awt.event.*;

/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_�͸� Ŭ����
 * �̸�: ���ϸ�
 * �̸����� ��ȸ�� Ŭ����, �̸��� ���� ������ �ܵ����� ��ü ���� �Ұ� 
 * -> ����Ŭ������ �����������̽� �̸����� ��ü ����(Ŭ������ ���ǿ� ��ü ������ ���ÿ�) 	
 */
public class Ex7_032 {
	public static void main(String[] args) {
//		�͸�Ŭ������ ���� ��
		Button b = new Button("start");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occured!!!");
			}
		});
	}
}

//	�͸�Ŭ������ �����ϱ� ��
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

