/*
 * ��¥: 2021/05/14
 * ����: �ڹ��� ����_instanceof ������
 * �̸�: ���ϸ�
 * ��������(������)�� ����ȯ ���ɿ��� Ȯ�ο� ���, �����ϸ� true ��ȯ
 * instanceof�� �ڽŰ� ���� �־� �׻� true�� ��ȯ��(���������� ����)
 * ����: 1) instanceof �����ڷ� �ݵ��!! ����ȯ ���� ���� Ȯ�� 2) ����ȯ ����
 * 
 */
class Market{}
class Emart extends Market{}

public class Ex7_016 {

	public static void main(String[] args) {
		
		Emart e = new Emart();
		
		if(e instanceof Emart) {
			System.out.println("This is a Emart instance");
		}
		if(e instanceof Market) {
			System.out.println("This is a Market instance");
		}
		if(e instanceof Object) {
			System.out.println("This is a Object instance");
		}
	}
} 
