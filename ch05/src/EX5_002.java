/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_�迭�� ����
 * �̸�: ���ϸ�
 * �迭�� �ѹ� �����ϸ� ���ൿ�� �� ���̸� �ٲ� �� ����(���)
 * */
public class EX5_002 {

	public static void main(String[] args) {
		
		//�迭�̸�.length: �迭 ���� 
		int[] arr = new int[5];
		int tmp = arr.length; 
		
		System.out.printf("tmp: "+ tmp);
		System.out.println();
		
//		int[] score = new int[6];
//		for(int i=0; i<6; i++) {�迭�� ������ �� ���� -> i<6 �����ؾ� ��
//			System.out.println(score[i]);
//		}
		
		int[] score = new int[6];
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+ i +"]=" +score[i]);
		}
		
	}
}
