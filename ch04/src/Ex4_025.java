/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_�ݺ���(do-while��)
 * �̸�: ���ϸ�
 * while���� ���ǽİ� ��{}�� ������ �ٲ� ��, �ݵ�� 1���� �����
 * do{while ���ǹ��� ���� ���} while(���ǹ�)
 * */
public class Ex4_025 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			System.out.printf("i=%d ", i);
			
			int tmp = i; //i�� for���� ���� -> tmp�� ��Ƽ� �۾�
			
			
			do { 
				if(tmp%10%3==0 && tmp%10!=0) 
					System.out.printf("¦");
			}while((tmp/=10)!=0); 

			System.out.println();
		}
		
		
	}
}
