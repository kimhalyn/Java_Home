/*
 * 날짜: 2021/05/17
 * 내용: 자바의 정석_예외처리, try-catch(1)
 * 이름: 김하린
 * try{
 *		예외가 발생할 가능성이 있는 문장들 (ex. 쇼핑)
 *} catch(Exception1 e1){
 *		Exception1이 발생했을 때, 이를 처리하기 위한 문장 (ex. 돈이 부족)
 *} catch(Exception2 e2){
 *		Exception2가 발생했을 때, 이를 처리하기 위한 문장 (ex. 재고 부족)
 *}	catch(Exception3 e3){
 *		Exception3이 발생했을 때, 이를 처리하기 위한 문장 (ex. 가게 폐업)
 *}
 */
public class Ex8_002 {

	public static void main(String[] args) {
			System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch(Exception e) {
			System.out.println(4); //예외가 발생했을 때만 실행, 예외없을 시 -> catch블럭 통과
		} //try-catch 종료
		System.out.println(5);
	}
}
