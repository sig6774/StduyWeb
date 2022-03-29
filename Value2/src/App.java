class 게시물 {
	int 번호;
	String 내용;
	String 제목;
	String 작성일;
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		게시물 새게시물 = new 게시물(); // 참조 변수 및 객체 생성 
		새게시물.번호 = 1; // 객체의 이용 
		System.out.println(새게시물.번호);
		// 생성한 객체의 멤버 변수 이용 
	}
}