/*
 * 날짜: 2021/05/13
 * 내용: 자바의 정석_import문 생성
 * 이름: 김하린
 * ctrl + shift + o(영문자): 자동으로 import문 생성
 * 패키지 -> 임포트 -> 클래스 순으로 작업
 */
import java.text.SimpleDateFormat;
import java.util.*;

public class Ex7_008 {

	public static void main(String[] args) {
		
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

		System.out.println("오늘 날짜는 "+ date.format(today));
		System.out.println("현재 시간은 "+ time.format(today));
	}
	
} 
