import java.util.Arrays; //ctrl + shift + o �ڵ����� import�� �߰�

/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_�迭�� �ʱ�ȭ/���
 * �̸�: ���ϸ�
 * �迭�� �� ��ҿ� ó������ ���� ����(default: 0)
 * */
public class EX5_003 {

	public static void main(String[] args) {

		int[] iArr1 = new int[] {100, 95, 80, 70, 60}; //new int[]���� ����
		int[] iArr2 = {100, 95, 80, 70, 60};
		
		System.out.println(iArr1); //�迭 �ּ� ���
		System.out.println(iArr2);
		
		for(int i=0; i<iArr2.length; i++) {
			System.out.println(iArr2[i]);
		}
//		�迭�� ��� ��Ҹ� [ù��° ���, �ι�° ���...] ���ڿ��� ���
		System.out.println(Arrays.toString(iArr2)); 
		System.out.println(Arrays.toString(iArr1));
	}
}
