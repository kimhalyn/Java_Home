/*
 * ��¥: 2021/05/10
 * ����: �ڹ��� ����_������ �ʱ�ȭ(�ʱ�ȭ ��)
 * �̸�: ���ϸ�
 */ 
class Ex6_021 {	
	static int[] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(java.lang.Math.random()*10)+1;
		}
	}
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+ i +"] :" +arr[i]);
		}
		
	}
	
}
		


