/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_�ݺ���(��ø for��)
 * �̸�: ���ϸ�
 * for�� ���� �� �ٸ� for���� ����
 * */
public class Ex4_019 {

	public static void main(String[] args) {
	
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				for(int k=1; k<=3; k++) {
					System.out.println(""+i+j+k); //""+���� = ""(���ڿ�)
				}
			}
		}
		System.out.println();
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=4; b++) {
				System.out.printf("[%d, %d]", a, b);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=5; b++) {
				if(a==b) {
					System.out.printf("[%d, %d]", a, b);
				}else {
					System.out.printf("%6c", ' '); //���� ���ڿ�
				}
			}
			System.out.println();
			
		}
		
	}
}
