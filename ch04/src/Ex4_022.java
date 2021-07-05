import java.util.Scanner;

/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_반복문(while문)
 * 이름: 김하린
 * */
public class Ex4_022 {

	public static void main(String[] args) {

		int num = 0, sum = 0;
		System.out.printf("숫자를 입력하세요.(예:12345)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			sum+=num%10; 
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /= 10;
		}
		System.out.println("각 자리수의 합: "+sum);
	}
}
