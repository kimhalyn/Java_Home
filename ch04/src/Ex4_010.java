import java.util.Scanner;
/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_조건문(switch문 이용하여 동일한 문제를 다른 방식으로 풀기)
 * 이름: 김하린
 * */
public class Ex4_010 {

	public static void main(String[] args) {
	
//		char grade = ' ';
//		System.out.printf("당신의 점수를 입력하세요.(1~100)>");
//		
//		Scanner scanner = new Scanner(System.in);
//		int score = scanner.nextInt();
//		
//		switch(score) {
//		case 100: case 99: case 98: case 97: case 96: case 95:
//		case 94: case 93: case 92: case 91: case 90:
//			grade = 'A';
//			break;
//		case 89: case 88: case 87: case 86: case 85:
//		case 84: case 83: case 82: case 81: case 80:
//			grade = 'B';
//			break;
//		case 79: case 78: case 77: case 76: case 75:
//		case 74: case 73: case 72: case 71: case 70:
//			grade = 'c';
//			break;
//		default:
//			grade = 'F';
//		
//		}
//		System.out.println("당신의 학점은 "+ grade +"입니다.");	
		
		
		int score = 0;
		char grade = ' ';
		
		System.out.printf("당신의 점수를 입력하세요.(1~100)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		score = Integer.parseInt(tmp);
		
		switch(score/10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';
		}
		System.out.println("당신의 학점은 "+ grade + "입니다.");
		
		
		
	}
}
