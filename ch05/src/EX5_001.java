/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_�迭 ����� ����
 * �̸�: ���ϸ�
 * */
public class EX5_001 {

	public static void main(String[] args) {
		
//		int[] score; 		//1. �迭 score�� ����(��������)
//		score = new int[5]; //2. �迭�� ����
		
		int[] score = new int[5]; //�迭�� ����� ������ ���ÿ�, �⺻�� 0���� �ʱ�ȭ
		score[3] = 100;
		
		System.out.println("score[0]="+score[0]);
		System.out.println("score[1]="+score[1]);
		System.out.println("score[2]="+score[2]);
		System.out.println("score[3]="+score[3]);
		System.out.println("score[4]="+score[4]);
		
		int value = score[3];
		System.out.println("value="+value);
		
		
	}
}
