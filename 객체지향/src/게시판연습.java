class 게시물{
	int 번호;
	String 제목;
	String 내용;
	String 작성일;
}
class 게시물저장소 {
	게시물[] 게시물들; 
	게시물저장소() { // 
		this.게시물들 = new 게시물[2];
		this.게시물들[0] = new 게시물();
		this.게시물들[0].번호 = 1;
		this.게시물들[0].제목 = "아아아";
		this.게시물들[0].내용 = "ㅎㅎ";
		
		this.게시물들[1] = new 게시물();
		this.게시물들[1].번호 = 2;
		this.게시물들[1].제목 = "아아";
		this.게시물들[1].내용 = "ㅎㅎㅎ";
	}
	
	int 게시물길이() {
		return 게시물들.length;
	}
	
	게시물 게시물을찾다(int 게시물번호) {
		return 게시물들[게시물번호-1];
	}
	
	게시물[] 게시물모으다() {
		return 게시물들;
	}
}

class 게시물관리자{
	게시물저장소 한게시물관리자 = new 게시물저장소();
	게시물 게시물조회(int 게시물번호) {
		return 한게시물관리자.게시물을찾다(게시물번호);
	}
	게시물[] 전부수집() {
		return 한게시물관리자.게시물모으다();
	}
}

public class 게시판연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int 게시물번호 = 2;
		게시물관리자 게관 = new 게시물관리자();
		게시물 찾은게시물 = 게관.게시물조회(게시물번호);
		System.out.println(찾은게시물.번호);
		System.out.println(찾은게시물.제목);
		System.out.println(찾은게시물.내용);
		
		

	}

}
