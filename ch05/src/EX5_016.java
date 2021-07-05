/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_2���� �迭(���� �迭)
 * �̸�: ���ϸ�
 * ���̺� ������ �����͸� �����ϱ� ���� �迭
 * */
public class EX5_016 {

	public static void main(String[] args) {

		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println(" ��ȣ  ����  ����  ����  ����  ���");
		System.out.println("=================================");
		
		
		
		for(int i=0; i<score.length; i++) { //score.length: ��
			int sum = 0; 
			float avg = 0.0f;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1); //��ȣ ���
			
			for(int j=0; j<score[i].length; j++) { //score[i].length: ��
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]); //
			}
			
			avg = sum / (float)score[i].length; //score[i].length: ��
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		
		System.out.println("=================================");
		System.out.printf("����: %3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}
}
