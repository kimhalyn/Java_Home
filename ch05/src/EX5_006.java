/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_�迭�� Ȱ��(�ִ�, �ּڰ�)
 * �̸�: ���ϸ�
 * */
public class EX5_006 {

	public static void main(String[] args) {

		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0]; //�ʱ�ȭ
		int min = score[0]; //�ʱ�ȭ
		
		for(int i=1; i<score.length; i++) { //score[1]���� max, min�� ��
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("�ִ� : "+ max);
		System.out.println("�ּڰ� : "+ min);
	}
}
