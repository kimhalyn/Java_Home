/*
 * ��¥: 2021/05/10
 * ����: �ڹ��� ����_static�޼���� �ν��Ͻ� �޼���
 * �̸�: ���ϸ�
 * �ν��Ͻ� �޼���: �ν��Ͻ� ���� ��(�������� ����) �ν��Ͻ��޼��� ȣ��, ��������.�޼����̸�();
 * static �޼���: Ŭ�����޼��� ���� �� �Ű����� ���, Ŭ�����̸�.�޼����̸�();
 */ 
class MyMath2{
	long a, b;

//�ν��Ͻ� ���� a,b�� ����ϹǷ� �Ű����� �ʿ�
long add() {return a+b;}
long subtract() {return a-b;}
long multiply() {return a*b;}
double divide() {return a/b;}

//�Ű����������� �۾�, a,b�� ��������
static long add(long a, long b) {return a+b;}
static long subtract(long a, long b) {return a-b;}
static long multiply(long a, long b) {return a*b;}
static double divide(double a, double b) {return a/b;}
}

public class Ex6_015 {	
	public static void main(String[] args) {

		//static �޼��� ȣ��
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));

		//�ν��Ͻ� �޼��� ȣ��
		MyMath2 mm = new MyMath2(); //�ν��Ͻ� ����(��������)
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
