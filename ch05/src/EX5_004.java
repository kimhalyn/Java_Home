import java.util.Arrays; //ctrl + shift + o �ڵ����� import�� �߰�

/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_�迭�� �ʱ�ȭ/���
 * �̸�: ���ϸ�
 * */
public class EX5_004 {

	public static void main(String[] args) {

		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i] = i+1;
		}
		
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1;
		}
		
		System.out.println(Arrays.toString(iArr1));
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3); //�迭�� �����ּ�
		System.out.println(chArr); //char�� ��� -> �迭�ּ� ��� ������ ������(����)
			
	}
}
