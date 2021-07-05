import java.util.Scanner;

/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_다차원 배열 활용(단어 맞추기)
 * 이름: 김하린
 * */
public class EX5_018 {

	public static void main(String[] args) {
		
		String[][] words = {
							{"chair", "의자"},
							{"computer", "컴퓨터"},
							{"integer", "정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("정답입니다.");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n", words[i][1]);
			}
					
		}
		
	}
}
