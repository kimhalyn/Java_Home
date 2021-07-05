import java.util.Arrays;

/*
 * 날짜: 2021/05/31
 * 내용: 자바의 정석_Arrays클래스
 * 이름: 김하린
 * 배열을 다루기 편리한 메서드 제공
 * copyOf(): 배열 전체 복사
 * copyOfRange(): 배열 일부 복사
 * fill(): 배열의 모든 요소를 지정 값으로 채움
 * setAll(): 람다식 지정
 * sort(): 정렬 
 * binarysearch(): 반드시 정렬된 상태에서 -> 저장된 요소 검색(index값 아님)
 * deepToString(): 다차원 배열 출력
 * deepEquals(): 다차원 배열 비교
 * asList(): 배열을 list로 변환
 */
public class Ex11_008 {

	public static void main(String[] args) {

		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));
		System.out.println();
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3); //3개만 가져와라
		int[] arr4 = Arrays.copyOf(arr, 7); //7개 가져와라
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); //index 2, 3만 복사
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
		
		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1); //(0 ~ 5범위) + 1 = 범위가 1 ~ 6으로 변경
		System.out.println("arr7="+Arrays.toString(arr7));
		System.out.println();
		
		for(int i : arr7) { //향상된 for문 -> arr7에서 순서대로 꺼내서 i에 넣는다
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i); //문자열로 바꾸로 +i
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