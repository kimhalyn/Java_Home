/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_�̸� ���� �ݺ���
 * �̸�: ���ϸ�
 * �ݺ����� �̸��� �ٿ��� �ϳ� �̻��� �ݺ����� ���
 * */
public class Ex4_029 {

	public static void main(String[] args) {
		
		loop1 : for(int i=2; i<=9; i++) {
					for(int j=1; j<=9; j++) {
						if(j==5)
//							break loop1;
							break;
							System.out.println(i+"*"+ j +"="+ i*j);
					}
					System.out.println();
		}
		
	}
}
