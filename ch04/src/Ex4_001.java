/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_���ǹ�(if��)
 * �̸�: ���ϸ�
 * ������ ������ ���� {}�� ����(0~1��)
 * */
public class Ex4_001 {

	public static void main(String[] args) {
		 int x = 0;
		 System.out.printf("x=%d �� �� ���� ����%n", x);
		 
		 //������ �� ���常 ���� �� -> {}��ȣ ���� ����
		 if(x==0) System.out.println("x==0");
		 if(x!=0) System.out.println("x!=0");
		 if(!(x==0)) System.out.println("!(x==0)");
		 if(!(x!=0)) System.out.println("!(x!=0)");
		 
		 x = 1;
		 System.out.printf("x=%d �� �� ���� ����%n", x);
		 
		 if(x==0) System.out.println("x==0");
		 if(x!=0) System.out.println("x!=0");
		 if(!(x==0)) System.out.println("!(x==0)");
		 if(!(x!=0)) System.out.println("!(x!=0)");
	}
}
