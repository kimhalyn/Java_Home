import java.util.StringJoiner;

/*
 * 날짜: 2021/05/19
 * 내용: 자바의 정석_join()과 StringJoiner
 * 이름: 김하린
 * join(): 여러 문자열 사이에 구분자를 넣어서 결합
 */
public class Ex9_006 {

	public static void main(String[] args) {

		String animals = "dog,cat,bear";
		String arr[] = animals.split(",");
		
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/","<","]");
		for(String s : arr)
			sj.add(s);
		
		System.out.println(sj.toString());
	}
}