/*
 * ��¥: 2021/05/09
 * ����: �ڹ��� ����_��ü �迭
 * �̸�: ���ϸ�
 * ��ü �迭 == �������� �迭
 * ���� ���� ��ü�� �ٷ�� �� �� ���, ��ü�� �ּҰ� �����
 * */

	
	class Tv { //�������� Tv, ��ü color, power, channel
		String color; 
		boolean power; 
		int channel; 
		
		void power() {power = !power;}
		void channelUp() {++channel;}
		void channelDown() {--channel;}
	} 
	
public class Ex6_004 {	

	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3];
		
		for(int i=0; i<tvArr.length; i++) { //tvArr.length = 3
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
		
	}
}
