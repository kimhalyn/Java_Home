import java.util.Arrays;

/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_Arrays�� �迭 �ٷ��
 * �̸�: ���ϸ�
 * */
public class EX5_017 {

	public static void main(String[] args) {

		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12}, {21, 22}};
	
		System.out.println(Arrays.toString(arr)); //(1���� �迭)arr�� ���ڿ��� ��ȯ
		System.out.println(Arrays.deepToString(arr2D)); // ������ �迭�� ��, ���
		
		
		String[][] str1 = new String[][] {{"abc", "def"}, {"ABC", "DEF"}};
		String[][] str2 = new String[][] {{"abc", "def"}, {"ABC", "DEF"}};
		
		
		//str1�迭�� str2�迭�� ��ġ�ϴ��� Ȯ��
		System.out.println(Arrays.equals(str1, str2)); // 1���� �迭�� ��, ���
		System.out.println(Arrays.deepEquals(str1, str2)); //������ �迭�� ��, ���
		
		//�迭 ����
		int[] arr1 = {0, 1, 2, 3, 4};
		int[] arr2 = Arrays.copyOf(arr1, arr1.length); //arr1.length: ������ ����� ����(5��)
		int[] arr3 = Arrays.copyOf(arr1, 3); //�տ��� 3��, [0,1,2]  
		int[] arr4 = Arrays.copyOf(arr1, 7); //[0,1,2,3,4,0,0]
		int[] arr5 = Arrays.copyOfRange(arr1, 2, 4); //index from~to [2,3]
		int[] arr6 = Arrays.copyOfRange(arr1, 0, 7); //[0,1,2,3,4,0,0]
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
		//�迭 ����
		int[]arr7 = {3, 2, 0, 1, 4};
		Arrays.sort(arr7); //�������� ����
		System.out.println(Arrays.toString(arr7)); 
		
	}
}
