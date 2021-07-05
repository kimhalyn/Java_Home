/*
 * 날짜: 2021/05/17
 * 내용: 자바의 정석_finally블럭(1)
 * 이름: 김하린
 * finally블럭 -> 예외 발생 여부에 관계없이 항상 수행되어야 하는 코드를 넣음
 */
public class Ex8_010 {

	public static void main(String[] args) {

//		try { deleteTempFiles가 중복됨
//			startInstall();
//			copyFiles();
//			deleteTempFiles();
//		} catch (Exception e) {
//			e.printStackTrace();
//			deleteTempFiles();
//		}

		try {
			startInstall();
			copyFiles();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			deleteTempFiles();
		}
	}

	static void startInstall() {
		System.out.println("프로그램 설치");
	}

	static void copyFiles() {
		System.out.println("파일 복사");
	}

	static void deleteTempFiles() {
		System.out.println("임시파일 삭제");
	}
}
