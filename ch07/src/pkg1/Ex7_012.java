/*
 * ��¥: 2021/05/13
 * ����: �ڹ��� ����_���� ������
 * �̸�: ���ϸ�
 * private: ���� Ŭ���� �������� ���� ����
 * public: ���� ������ ���� ����
 * (default): ���� ��Ű��(Ŭ����) �������� ���� ����
 * protected: ���� ��Ű��(Ŭ����) ��, �ٸ� ��Ű���� �ڼ� Ŭ�������� ���� ����
 * 
 * �ϳ��� �ҽ����Ͽ��� public Ŭ������ 1���� ����
 * �ҽ����� �̸��� publicŬ������ �̸��� ���ƾ� ��
 */
package pkg1;

public class Ex7_012{
	private 	int prv; //���� Ŭ���� 
				int dft; //���� ��Ű��(Ŭ����)
	protected 	int prt; //���� ��Ű��(Ŭ����), �ٸ� ��Ű�� �ڼ� Ŭ����
	public 		int pub; //���� ����
	
	public void printMember() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}
 class  MyParent{

	public static void main(String[] args) {
		Ex7_012 p = new Ex7_012();
//		System.out.println(p.prv); ���� -> private ���� �����ڴ� ���� Ŭ���������� ����
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
		
		
	}
		
} 
