/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_�ݺ���(while��)
 * �̸�: ���ϸ�
 * */
public class Ex4_023 {

	public static void main(String[] args) {

		int sum =0;
		int i = 0;
		
		while((sum+= ++i) <= 100) { //(sum = sum+ ++i) <= 100 
			System.out.printf("%d - %d%n", i, sum);
		}
			
	}
}
