/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_���ǹ�(switch���� �̿��Ͽ� ������ ���� �����)
 * �̸�: ���ϸ�
 * 0.0 <= Math.random() < 1.0 - 0.0�� 1.0������ ������ double���� ��ȯ
 * */
public class Ex4_007 {

	public static void main(String[] args) {
	
//		Quiz1. 1~10������ ������ 20�� ����Ͻÿ�.
		for(int i = 1; i <= 20; i++) {
//			System.out.println(Math.random()); 0.0 <= x < 1.0
//			System.out.println(Math.random()*10); 0.0 <= x < 10.0
//			System.out.println((int)(Math.random()*10)); 0 <= x < 10
//			System.out.println((int)(Math.random()*10)+1); //1 <= x < 11, 1~10���� ���  
		}
		
//		Quiz2. -5~5������ ������ 20�� ����Ͻÿ�.
		for(int i = 1; i <= 20; i++) {
			System.out.print((int)(Math.random()*11)-5); //(0<=x<11)-5 -> -5<=x<6
			
		}
	}
}
