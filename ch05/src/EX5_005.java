/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_�迭�� Ȱ��(���հ� ���)
 * �̸�: ���ϸ�
 * */
public class EX5_005 {

	public static void main(String[] args) {
		
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length; //float�� ����ȯ
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
	}
}
