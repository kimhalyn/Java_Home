import java.util.EmptyStackException;
import java.util.Stack;

/*
 * 날짜: 2021/05/31
 * 내용: 자바의 정석_스택과 큐의 활용_스택
 * 이름: 김하린
 * 스택의 활용: 수식계산, 수식괄호검사, 워드프로세서의 undo, redo, 웹브라우저의 뒤로/앞으로
 * 큐의 활용: 최근사용문서, 인쇄작업 대기목록, 버퍼
 */
public class Ex11_005 {

	public static void main(String[] args) {

//		if(args.length!=1) {
//			System.out.println("Usage:java Ex11_005 \"EXPRESSION\"");
//			System.out.println("Example:java Ex11_005 \"((2+3)*1)+3\"");
//			System.exit(0);
//		}
		
		Stack st = new Stack();
		String expression = "((3+5)*8-2";   //args[0];
		
		System.out.println("expression:"+ expression);
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch=='('){ //여는 괄호이면
					st.push(ch+"");
				}else if(ch==')') { //닫는 괄호이면
					st.pop();
				}
			}
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			}else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		}catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.2");
		}
	}
}
