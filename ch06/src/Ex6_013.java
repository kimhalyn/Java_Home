/*
 * ��¥: 2021/05/10
 * ����: �ڹ��� ����_������ �Ű�����
 * �̸�: ���ϸ�
 * ������ �Ű�����: ������ ���� �а� ������ �� ����
 * */ 

public class Ex6_013 {	
	public static void main(String[] args) {

		Ex6_013 r = new Ex6_013();
		
		int result = r.add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0}; //�迭�� �����ϰ� result2[0]�� ���� 0���� �ʱ�ȭ
		r.add(3, 5, result2);
		System.out.println(result2[0]);
		
	}
	int add(int a, int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result) { //��ȯ���� ���� �޼���� ��ȯ
		result[0] = a+b;
	}
}
