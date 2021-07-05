import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

/*
 * 날짜: 2021/05/31
 * 내용: 자바의 정석_스택과 큐의 활용_큐
 * 이름: 김하린
 * 스택의 활용: 수식계산, 수식괄호검사, 워드프로세서의 undo, redo, 웹브라우저의 뒤로/앞으로
 * 큐의 활용: 최근사용문서, 인쇄작업 대기목록, 버퍼
 */
public class Ex11_006 {

	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //Queue에 최대 5개까지만 저장되도록 함

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.println(">>");
			try {
				
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0); //프로그램 종료
					
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 "+ MAX_SIZE +"개 보여줍니다.");
					
				}else if(input.equalsIgnoreCase("history")) {
					save(input); //입력받은 명령어 저장
					
					LinkedList list = (LinkedList)q;
					
					final int SIZE = list.size();
					for(int i=0; i<SIZE; i++) {
						System.out.println((i+1)+"."+list.get(i));
					}
				}else {
					save(input);
					System.out.println(input);
				}
			}catch (Exception e) {
				System.out.println("입력오류입니다.");
			}
		}
	}

	public static void save(String input) {
		if (!"".equals(input)) { //빈 문자열이 아닐 때
			q.offer(input);
		}
//		최대 크기를 넘으면, 제일 처음 입력된 것을 삭제함
		if (q.size() > MAX_SIZE) {
			q.remove();
		}
	}
}