/*
 * ��¥: 2021/05/17
 * ����: �ڹ��� ����_����� ���� ���� �����, ���� �Ǵ�����
 * �̸�: ���ϸ�
 * ����� ���� ����: ������ Exception�� RuntimeException�߿��� ����, String�� �Ű������� �޴� ������
 * ���� �Ǵ�����: ���ܸ� ó���ߴµ� �ٽ� ���ܸ� �߻���Ű�� ��, ȣ���� �޼���� ȣ��� �޼��� ���� ��ο��� ���� ó��
 */
public class Ex8_012 {

	public static void main(String[] args) {
		
		try{
			method1();
		}catch(Exception e) {
			System.out.println("main�޼��忡�� ���ܰ� ó���Ǿ����ϴ�");
		}
	}
		static void method1() throws Exception{
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�");
			throw e;
		}
	}
}
