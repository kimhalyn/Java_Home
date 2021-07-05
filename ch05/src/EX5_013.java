/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_커맨드 라인 입력받기
 * 이름: 김하린
 * scanner클래스 nextLine() 외에 화면을 통해 사용자로부터 값을 입력함
 * Run configurations -> Arguments
 * */
public class EX5_013 {

	public static void main(String[] args) {
		
		System.out.println("매개변수의 개수:" +args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+ i + "] = \""+ args[i] + "\"");
		}
	}
}
