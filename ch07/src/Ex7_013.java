/*
 * ��¥: 2021/05/14
 * ����: �ڹ��� ����_������
 * �̸�: ���ϸ�
 * ���� Ÿ�� ���� ������ �ڼ� Ÿ�� ��ü�� �ٷ�� ��(�ݴ�� �Ұ�)
 * ���������� ��ü Ÿ���� ��ġ�� ���� ����ġ�� ��(������)�� ������? -> ����� �� �ִ� ������� ������ �޶���
 */

class WideTv{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class SmartTv extends WideTv{
	String text;
	void cation() {}
}
public class Ex7_013 {

	public static void main(String[] args) {
//		(1) ���� �������� Ÿ�԰� ��ü Ÿ���� ��ġ�� ��
//		WideTv w = new WideTv();
//		SmartTv s = new SmartTv();
		
		//(2) ������ ����Ͽ� ǥ��
		WideTv w = new SmartTv();
	}
} 
