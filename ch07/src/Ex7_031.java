/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_���� Ŭ������ �����ڿ� ���ټ�(5)
 * �̸�: ���ϸ�
 */
class Outer2{
		int value = 10; //Outer2.this.value
	
		class Inner{
		int value = 20; //this.value

		void Method() {
			int value = 30;
			System.out.println("value :"+ value);
			System.out.println("this.value :"+ this.value);
			System.out.println("Outer2.this.value :"+ Outer2.this.value);
		}
	}
}
public class Ex7_031 {
	public static void main(String[] args) {
		
		Outer2 outer2 = new Outer2();
		Outer2.Inner inner = outer2.new Inner();
		inner.Method();
	}
}
