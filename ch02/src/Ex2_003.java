/*
 * ��¥: 2021/05/04 
 * ����: �ڹ��� ����_����� ���ͷ�
 * �̸�: ���ϸ�
 * ����: �ϳ��� ���� �����ϱ� ���� ����
 * ���: ���� �ѹ��� ����, ���� Ÿ�� �տ� final ����, ����� ���ÿ� �ʱ�ȭ
 * ���ͷ�: �� �� ��ü�� �ǹ�
 */
public class Ex2_003 {
	public static void main(String[] args) {
		final int score = 100; //score�� ���, 100�� ����
		
		// score = 200; �Ұ� ��? score�� ����̹Ƿ�
		System.out.println(score);
		
		//����
		boolean power = true;
		
		//������(�⺻ int)
		byte b = 127; //byteŸ�� ���� ����: -128~127
		int oct = 010; // 8���� 10, 10������ 8
		int hex = 0x10; // 16���� 10, 10������ 16
		
		long l = 1000_000_000;
		long ll = 10_000_000_000L; //int������ 20���̶� ���� �߻�, �ڿ� L�ٿ��� longŸ������ ����

		//�Ǽ���(�⺻ double)
		float f = 3.14f; //f ���� �Ұ�
		double d = 3.14d; 
		double d2 = 3.14; //d ���� ����
//		float d3 = 3.14; �����߻� ��? float < double �̶� 3.14�� d3�� �� ��
		
		System.out.println(power);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3); //e3:1000.0, e-3: 0.001
	
	}
}
