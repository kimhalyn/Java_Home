/*
 * ��¥: 2021/05/17
 * ����: �ڹ��� ����_���� �߻���Ű��
 * �̸�: ���ϸ�
 * ������ new -> �߻���Ű���� ���� Ŭ���� ��ü ����
 * Ű���� throw -> ���� �߻�
 */
public class Ex8_006 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("���Ƿ� �߻�������");
			throw e;
			//throw new Exception("���Ƿ� �߻�������"); -> ���ٷ� �ۼ� ����
		}catch(Exception e) {
			System.out.println("���� �޽���: "+e.getMessage());
			e.printStackTrace();
		}//try-catch ����
		System.out.println("���α׷��� ���� �����");
	}
}