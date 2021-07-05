import java.util.Arrays;

/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_Arrays로 배열 다루기
 * 이름: 김하린
 * */
public class EX5_017 {

	public static void main(String[] args) {

		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12}, {21, 22}};
	
		System.out.println(Arrays.toString(arr)); //(1차열 배열)arr을 문자열로 변환
		System.out.println(Arrays.deepToString(arr2D)); // 다차원 배열일 때, 사용
		
		
		String[][] str1 = new String[][] {{"abc", "def"}, {"ABC", "DEF"}};
		String[][] str2 = new String[][] {{"abc", "def"}, {"ABC", "DEF"}};
		
		
		//str1배열과 str2배열이 일치하는지 확인
		System.out.println(Arrays.equals(str1, str2)); // 1차원 배열일 때, 사용
		System.out.println(Arrays.deepEquals(str1, str2)); //다차원 배열일 때, 사용
		
		//배열 복사
		int[] arr1 = {0, 1, 2, 3, 4};
		int[] arr2 = Arrays.copyOf(arr1, arr1.length); //arr1.length: 복사할 요소의 개수(5개)
		int[] arr3 = Arrays.copyOf(arr1, 3); //앞에서 3개, [0,1,2]  
		int[] arr4 = Arrays.copyOf(arr1, 7); //[0,1,2,3,4,0,0]
		int[] arr5 = Arrays.copyOfRange(arr1, 2, 4); //index from~to [2,3]
		int[] arr6 = Arrays.copyOfRange(arr1, 0, 7); //[0,1,2,3,4,0,0]
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
		//배열 정렬
		int[]arr7 = {3, 2, 0, 1, 4};
		Arrays.sort(arr7); //오름차순 정렬
		System.out.println(Arrays.toString(arr7)); 
		
	}
}
