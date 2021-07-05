/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_반복문(do-while문)
 * 이름: 김하린
 * while문의 조건식과 블럭{}의 순서를 바꾼 것, 반드시 1번은 실행됨
 * do{while 조건문이 참인 경우} while(조건문)
 * */
public class Ex4_025 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			System.out.printf("i=%d ", i);
			
			int tmp = i; //i가 for문의 변수 -> tmp에 담아서 작업
			
			
			do { 
				if(tmp%10%3==0 && tmp%10!=0) 
					System.out.printf("짝");
			}while((tmp/=10)!=0); 

			System.out.println();
		}
		
		
	}
}
