
class 게시물123{
	int 번호;
	String 제목;
	String 내용;
	String 작성일;
}

class 게시물저장소1{
	게시물123[] 게시물집합;
	게시물저장소1(){
		this.게시물집합 = new 게시물123[2];
		
		this.게시물집합[0] = new 게시물123();
		this.게시물집합[0].번호 = 2;
		this.게시물집합[0].제목 = "점심메뉴";
		this.게시물집합[0].내용 = "중식";
		
		this.게시물집합[1] = new 게시물123();
		this.게시물집합[1].번호 = 3;
		this.게시물집합[1].제목 = "저녁메뉴";
		this.게시물집합[1].내용 = "한식";
	}
	
	int 게시물개수() {
		return 게시물집합.length;
	}
	
	게시물123 특정게시물조회(int 게시물번호) {
		return 게시물집합[게시물번호-1];
	}
	
	게시물123[] 전체게시물() {
		return 게시물집합;
	}
}

class 게시물관리자1{
	게시물저장소1 한저장소 = new 게시물저장소1();
	게시물123 게시물조회12(int 게시물번호) {
		return 한저장소.특정게시물조회(게시물번호);
	}
}

public class 게시물연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
