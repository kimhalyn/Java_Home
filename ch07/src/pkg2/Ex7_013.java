/*
 * ��¥: 2021/05/13
 * ����: �ڹ��� ����_���� ������
 * �̸�: ���ϸ�
 * private: ���� Ŭ���� �������� ���� ����
 * public: ���� ������ ���� ����
 * (default): ���� ��Ű��(Ŭ����) �������� ���� ����
 * protected: ���� ��Ű��(Ŭ����) ��, �ٸ� ��Ű���� �ڼ� Ŭ�������� ���� ����
 */
package pkg2;

import pkg1.Ex7_012;

class MyChild extends Ex7_012{
	public void printMember() {
//		System.out.println(prv); ���� -> private�� ���� Ŭ���������� ����
//		System.out.println(dft); ���� -> default�� ���� ��Ű�������� ����
		System.out.println(prt); 
		System.out.println(pub);
	}
	
}

public class Ex7_013 {
	public static void main(String[] args) {
		
		Ex7_012 p = new Ex7_012();
//		System.out.println(p.prv); ���� -> ���� Ŭ���������� ���� 
//		System.out.println(p.dft); ���� -> ���� ��Ű�������� ����
//		System.out.println(p.prt); ���� -> ���� ��Ű�� + Ÿ ��Ű�� �ڼտ��� ����
		System.out.println(p.pub);
	}
}
