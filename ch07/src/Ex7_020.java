/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_�߻� Ŭ����
 * �̸�: ���ϸ�
 * �߻� �޼���(=�̿ϼ� �޼���)�� ���� �ִ� Ŭ����(abstract ����Ÿ�� �޼����̸�();)
 * �߻� �޼���(�����+������)�� �޼��� ������{}�� ���� -> 
 * �� �ʿ������� �ڼո��� �ٸ��� ������ ������ ����Ǵ� ��� ���
 * �߻� Ŭ����: �ٸ� Ŭ���� �ۼ��� ������ �ֱ� ���� �� -> ����� ���� �߻� Ŭ������ �ϼ��ϰ� �ν��Ͻ� ����
 * 
 * �׳� �� ������ ���� ����ϸ� �ȵǳ�? -> �ʼ�/������ ������ �����
 */
abstract class Player{ //�߻� Ŭ����(=�̿ϼ� Ŭ����/���赵)
	abstract void play(int pos); //�߻� �޼���(=�̿ϼ� �޼���)
	abstract void stop(); //�߻� �޼���(����θ� �ְ� �����ΰ� ���� �޼���)
}
//�߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ���� ����
class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos +" ��ġ���� play�մϴ�");}
	void stop() {System.out.println("����� ����ϴ�");}
}
public class Ex7_020 {

	public static void main(String[] args) {

//		Player p = new Player(); ���� -> �߻� Ŭ������ ��ü ������ �Ұ�
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer(); //������������ ����
		ap.play(100);
		ap.stop();
	}
} 
