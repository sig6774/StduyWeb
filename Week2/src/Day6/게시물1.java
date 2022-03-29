package Day6;

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
	
	게시물123[] 모든게시물() {
		return 한저장소.전체게시물();
	}
}
public class 게시물1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 게시물번호 = 1;
		게시물관리자1 한명 = new 게시물관리자1();
		게시물123 특정게시물 = 한명.게시물조회12(게시물번호);
		System.out.println(특정게시물.번호);
		System.out.println(특정게시물.제목);
		System.out.println(특정게시물.내용);
		
		게시물123[] 전부다있는게시물 = 한명.모든게시물();
		System.out.println(전부다있는게시물[1].번호);
		System.out.println(전부다있는게시물[1].제목);
		System.out.println(전부다있는게시물[1].내용);
		
		게시물저장소1 테스트용 = new 게시물저장소1();
		int 게시물개수 = 테스트용.게시물개수();
		System.out.println("게시물개수는: " + 게시물개수);
	
		

	}

}
