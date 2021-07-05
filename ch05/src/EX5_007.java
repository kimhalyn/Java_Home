import java.util.Arrays;

/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_배열의 활용(섞기)
 * 이름: 김하린
 * */
public class EX5_007 {

	public static void main(String[] args) {

		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<numArr.length; i++) {
			int n = (int)(Math.random() * 10); 
			int tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}
