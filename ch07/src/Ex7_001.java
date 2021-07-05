/*
 * ��¥: 2021/05/13
 * ����: �ڹ��� ����_���
 * �̸�: ���ϸ�
 * ������ Ŭ������ ���ο� Ŭ������ �ۼ�(�ڵ� ����)
 * �� Ŭ������ �θ�� �ڽ����� ���� ����
 * �ڽ� Ŭ���� extends �θ� Ŭ����
 * �ڼ��� ������ ��� ����� ��ӹ���(�ڼ� ��� �� >= �θ� ��� ��)
 * �ڼ��� ������ ���� ���� ��ġ�� ����
 */
class Tv{
	boolean power;
	int channel;
	
	void power() 		{power = !power;}
	void channelUp() 	{++channel;}	
	void channelDown()	{--channel;}
}
class CaptionTv extends Tv{ 
	boolean caption; //ĸ�ǻ���(on/off)
	void displayCaption(String text) {
		if(caption) { //ĸ���� on(true)�� ���� ȭ�鿡 ��� 
			System.out.println(text);
		}
	}
}
public class Ex7_001 {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, world");
		ctv.caption = true; //ĸ�� on
		ctv.displayCaption("HelloWorld");
	}
}
