/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_�������̽��� �̿��� ������
 * �̸�: ���ϸ�
 * Ŭ�������� ����Ÿ���� �������� -> �ڼ� Ŭ���� �ν��Ͻ� ���� ����
 * �������̽� ���� �������� -> �������̽��� ������ �ڼ� Ŭ���� �ν��Ͻ� ���� ����
 * 
 * �޼����� ��ȯŸ���� �������̽� -> �޼��� ���ο����� �������̽��� ������ ��ü�� ��ȯ
 * 						  -> �޼��带 ȣ���� �������� �޼��� ��ȯŸ���� ��ġ��Ŵ 	
 */
abstract class Unit1{
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("����ϴ�");}
}
interface Fightable1{//�������̽��� ��� �޼���� public abstract
	void move(int x, int y); //public abstract�� ����
	void attack(Fightable1 f); //public abstract�� ����
}
class Fighter1 extends Unit1 implements Fightable1{
	//�������̵� ����: ���󺸴� ���������ڰ� ������ �ȵ�(public ��� ����� �� ��)
	public void move(int x, int y) { 
		System.out.println("["+ x +","+ y +"]�� �̵�");
	}
	public void attack(Fightable1 f) {
		System.out.println(f+"�� ����");
	}
	//�ο� �� �ִ� ��븦 �ҷ���
	Fightable1 getFightable() {
		Fighter1 f = new Fighter1();
		return f; //�� ��Ȯ�ϰ� (Fightable1)f; 
	}
}
public class Ex7_023 {

	public static void main(String[] args) {

		Fighter1 f = new Fighter1(); //����
		Fightable1 f2 = f.getFightable();
		
		
//		Fightable1 f = new Fighter1(); //����
		Unit1 u = new Fighter1(); 
		
		u.move(100, 200);
		u.stop();
//		u.attack(); ���� -> Unit1���� attack()�� ��� ȣ��Ұ�
		
		f.move(100, 200);
		f.attack(new Fighter1() ); //Fighter1 f2 = new Fighter1();, f.attack(f2);�� �� �������� ���� ��
//		f.stop(); ���� -> Fightable1���� stop()�� ��� ȣ��Ұ�
	}
} 
