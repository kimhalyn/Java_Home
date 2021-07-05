/*
 * ��¥: 2021/05/14
 * ����: �ڹ��� ����_ĸ��ȭ�� ���� ������
 * �̸�: ���ϸ�
 * iv�� private -> �ܺ������� ����, �޼���� public���� ����
 * �޼��带 ���ؼ� iv�� ���� -> ��? �ܺηκ��� �����͸� ��ȣ�ϱ� ���ؼ� 
 * �ܺο����� ���ʿ��ϰ�, ���������θ� ���Ǵ� �κ��� ���߱� ���ؼ�
 * 
 * ������ �޼��� ���� alt + shift + M
 * ������ �޼��� ���� alt + shift + R
 */
class Time1{
	private int hour; //0~23������ ���� ������ ��
	private int minute;
	private int second;
	
	//set�޼��� -> �Ű������� ������ ���� �˻��Ͽ� ���ǿ� ���� ���� ��� ���� �� ����
	public void setHour(int hour) {
		if(isNotValidHour(hour)) return; //��������
		 
		this.hour = hour;
	}
	//�Ű������� �Ѱ��� hour�� ��ȿ���� �˷��ִ� �޼���
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	//get�޼��� -> ������� �� ��ȯ
	public int getHour() {return hour;}
}

public class Ex7_012 {

	public static void main(String[] args) {

		Time1 t = new Time1();
		t.setHour(21);//hour�� ���� 21�� ����
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
		
	}
} 
