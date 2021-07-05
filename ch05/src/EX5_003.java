import java.util.Arrays; //ctrl + shift + o 자동으로 import문 추가

/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_배열의 초기화/출력
 * 이름: 김하린
 * 배열의 각 요소에 처음으로 값을 저장(default: 0)
 * */
public class EX5_003 {

	public static void main(String[] args) {

		int[] iArr1 = new int[] {100, 95, 80, 70, 60}; //new int[]생략 가능
		int[] iArr2 = {100, 95, 80, 70, 60};
		
		System.out.println(iArr1); //배열 주소 출력
		System.out.println(iArr2);
		
		for(int i=0; i<iArr2.length; i++) {
			System.out.println(iArr2[i]);
		}
//		배열의 모든 요소를 [첫번째 요소, 두번째 요소...] 문자열로 출력
		System.out.println(Arrays.toString(iArr2)); 
		System.out.println(Arrays.toString(iArr1));
	}
}
