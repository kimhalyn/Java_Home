/*
 * ��¥: 2021/05/13
 * ����: �ڹ��� ����_���� ���, ObjectŬ����
 * �̸�: ���ϸ�
 * ���� ���: �ϳ��� �θ� ���
 * ������ ���� Ŭ���� -> ��� ����, �������� ���� ����
 * ObjectŬ����: ��� Ŭ������ ���� -> �θ� ���� Ŭ������ �ڵ������� ObjectŬ������ ��ӹ��� 
 */
class Tv1{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class VCR{
	boolean power;
	int counter = 10;
	void power() {power = !power;}
	void play() {/* ������� */}
	void stop() {/* ������� */}
	void rew() {/* ������� */}
	void ff() {/* ������� */}
	
}

public class Ex7_003 extends VCR {

	VCR vcr = new VCR();
		
		void play() {
			vcr.play();
		}
		void stop() {
			vcr.stop();
		}
		void rew() {
			vcr.rew();
		}
		void ff() {
			vcr.ff();
		}
	}
