/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_�ݺ���(while��)
 * �̸�: ���ϸ�
 * */
public class Ex4_021 {

	public static void main(String[] args) {
	
		 int i = 11;
		 
		 System.out.println("ī��Ʈ �ٿ��� �����մϴ�.");
		 
		 while(i--!=0) { //������ -> i!=0, i--
			 System.out.println(i);
			 
			 for(int j=0; j<2000; j++) {
				 ; //�ƹ��� ���뵵 ���� �� ����
			 }
		 }
		 System.out.println("game over");
	}
}
