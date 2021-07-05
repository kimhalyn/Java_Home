/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_String배열
 * 이름: 김하린
 * */
public class EX5_010 {

	public static void main(String[] args) {

		String[] names = {"kim", "lee", "park"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+ i + "]: "+ names[i]);
		}
		
		String tmp = names[2];
		System.out.println("tmp: "+ tmp);
		names[0] = "Yu"; //인덱스 0의 값을 "Yu"로 변경
		
		for(String str : names) { //향상된 for문(배열만 사용 가능, 수정x, 값을 쓰는 것만 가능)
			System.out.println(str);
		}
	}
		
}
