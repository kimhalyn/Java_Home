/*
 * ��¥: 2021/05/17
 * ����: �ڹ��� ����_finally��(1)
 * �̸�: ���ϸ�
 * finally�� -> ���� �߻� ���ο� ������� �׻� ����Ǿ�� �ϴ� �ڵ带 ����
 */
public class Ex8_010 {

	public static void main(String[] args) {

//		try { deleteTempFiles�� �ߺ���
//			startInstall();
//			copyFiles();
//			deleteTempFiles();
//		} catch (Exception e) {
//			e.printStackTrace();
//			deleteTempFiles();
//		}

		try {
			startInstall();
			copyFiles();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			deleteTempFiles();
		}
	}

	static void startInstall() {
		System.out.println("���α׷� ��ġ");
	}

	static void copyFiles() {
		System.out.println("���� ����");
	}

	static void deleteTempFiles() {
		System.out.println("�ӽ����� ����");
	}
}
