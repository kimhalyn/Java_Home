/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_증감 연산자(operator)
 * ++의 위치에 따라 전위형, 후위형으로 나뉨
 * 이름: 김하린
 * */
public class Ex3_002 {

	public static void main(String[] args) {
		
		int i = 5, j = 0;
		//후위형
		j = i++; //j=i, i++;과 동일
		System.out.println("j=i++; 실행 후 i=" + i +", j =" + j);
		
		i = 5; 
		j = 0;
		
		//전위형
		j = ++i; //i++, j=i;와 동일 
		System.out.println("j=++i; 실행 후 i=" + i +", j =" + j);
		
	}

	
}
