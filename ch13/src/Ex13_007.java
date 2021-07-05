/*
 * ��¥: 2021/06/10
 * ����: �ڹ��� ����_���� ������
 * �̸�: ���ϸ�
 * �Ϲ� �������� �۾��� ���� �������� ����
 * �Ϲ� �����尡 ����Ǹ� -> ���� ������� �ڵ� ����� 
 * */
public class Ex13_007 implements Runnable {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new Ex13_007());
		t.setDaemon(true); //���� ������� ����
		t.start();

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(i);

			if (i == 5)
				autoSave = true;
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

	public void run() {
		while (true) { //���ѷ���
			try {
				Thread.sleep(3 * 1000); //3�� ����
			} catch (InterruptedException e) {
			}
//			autoSave���� true�̸� autoSave()�� ȣ����
			if (autoSave) {
				autoSave();
			}
		}
	}

	public void autoSave() {
		System.out.println("�۾������� �ڵ����� �Ǿ����ϴ�.");
	}
}
