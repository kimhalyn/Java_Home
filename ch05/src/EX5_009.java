import java.util.Arrays;

/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_�迭�� Ȱ��(������ ��)
 * �̸�: ���ϸ�
 * */
public class EX5_009 {

	public static void main(String[] args) {

		int[] code = {-4, -1, 3, 6, 11}; //�ҿ������� ����� ������ �迭
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp = (int)(Math.random() * code.length);
			arr[i] = code[tmp];
		}
		System.out.println(Arrays.toString(arr));
	}
}
