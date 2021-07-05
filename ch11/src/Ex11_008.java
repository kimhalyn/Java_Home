import java.util.Arrays;

/*
 * ��¥: 2021/05/31
 * ����: �ڹ��� ����_ArraysŬ����
 * �̸�: ���ϸ�
 * �迭�� �ٷ�� ���� �޼��� ����
 * copyOf(): �迭 ��ü ����
 * copyOfRange(): �迭 �Ϻ� ����
 * fill(): �迭�� ��� ��Ҹ� ���� ������ ä��
 * setAll(): ���ٽ� ����
 * sort(): ���� 
 * binarysearch(): �ݵ�� ���ĵ� ���¿��� -> ����� ��� �˻�(index�� �ƴ�)
 * deepToString(): ������ �迭 ���
 * deepEquals(): ������ �迭 ��
 * asList(): �迭�� list�� ��ȯ
 */
public class Ex11_008 {

	public static void main(String[] args) {

		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));
		System.out.println();
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3); //3���� �����Ͷ�
		int[] arr4 = Arrays.copyOf(arr, 7); //7�� �����Ͷ�
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); //index 2, 3�� ����
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr3="+Arrays.toString(arr3));
		System.out.println("arr4="+Arrays.toString(arr4));
		System.out.println("arr5="+Arrays.toString(arr5));
		System.out.println("arr6="+Arrays.toString(arr6));
		System.out.println();
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		System.out.println("arr7="+Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1); //(0 ~ 5����) + 1 = ������ 1 ~ 6���� ����
		System.out.println("arr7="+Arrays.toString(arr7));
		System.out.println();
		
		for(int i : arr7) { //���� for�� -> arr7���� ������� ������ i�� �ִ´�
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i); //���ڿ��� �ٲٷ� +i
		}
		System.out.println();
		
		String [][] str2D = new String [][] {{"aaa","bbb"},{"AAA","BBB"}};
		String [][] str2D2 = new String [][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		System.out.println();
		
		char[] chArr = {'A','B','C','D','E'};
		
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B="+Arrays.binarySearch(chArr, 'B'));
		System.out.println("= After sorting =");
		Arrays.sort(chArr);
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B="+Arrays.binarySearch(chArr, 'B'));
	}
}