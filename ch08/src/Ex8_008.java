/*
 * ��¥: 2021/05/17
 * ����: �ڹ��� ����_�޼��� ���ܼ���(1)
 * �̸�: ���ϸ�
 * ���� ó�� ��� 1)try-catch 2)���� ����(=���� ���ѱ��) 3)����
 * void method() throws Exception1, Exception2, ....ExceptionN{�޼��� ����}
 * void method() throws Exception{�޼��� ����}
 */
class Ex8_008 {

	public static void main(String[] args) throws Exception{ //����ó�� x -> ���ѱ�(JVM)
		method1(); //����ó�� x -> ���ѱ�
	}
	static void method1() throws Exception{
		method2(); //����ó�� x -> ���ѱ�
	}
	static void method2() throws Exception{
		throw new Exception(); //���ܹ߻� -> ó�����ϰ� die -> ���ѱ�
	}
}