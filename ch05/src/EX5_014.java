/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_커맨드 라인 입력받기
 * 이름: 김하린
 * */
public class EX5_014 {

	public static void main(String[] args) {

		if(args.length!=3) {
			System.out.println("usage: java ArarayEx014 NUM1 OP NUM2");
			System.exit(0); //시스템을 종료함
		}
		int num1 = Integer.parseInt(args[0]); //문자열을 숫자로 변환
		char op = args[1].charAt(0); //문자열을 문자로 변환
		int num2 = Integer.parseInt(args[2]);
		int result = 0;
		
		switch(op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case 'x':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default :
				System.out.println("지원되지 않는 연산입니다.");
		}
		System.out.println("결과 :"+ result);
	}
}
