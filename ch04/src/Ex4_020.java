/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_�ݺ���(while��)
 * �̸�: ���ϸ�
 * while(���ǽ�): ���ǽ��� ������ �� ������ �ݺ�
 * */
public class Ex4_020 {

	public static void main(String[] args) {
	
//		for���� while�� ��
		for(int i=1; i<=5; i++) {
			System.out.print(i);
		}
		
		System.out.println();

		int j = 1;
		while(j<=5) {
			System.out.print(j);
			j++;
		}
		
		System.out.println();
		
//		while�� ���ǹ� ���� �Ұ�
		int i =5;
		
		while(i--!=0) { // �������̹Ƿ� -> whle(i!=0), i--; Systme.out.println(i+ "") ������ ����
			System.out.println(i+" - I can do it.");
		}
		
	}
}
