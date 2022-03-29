class 게시물 {
	int 번호;
	String 제목;
	String 내용;
}

class 게시물저장소{
	게시물[] 게시물들;
	
	void 준비하다() {
		this.게시물들 = new 게시물[2];
		this.게시물들[0] = new 게시물();
		this.게시물들[0].번호 = 1;
		this.게시물들[0].제목 = "봄";
		this.게시물들[0].내용 = "봄꽃";
		
		this.게시물들[1] = new 게시물();
		this.게시물들[1].번호 = 2;
		this.게시물들[1].제목 = "여름";
		this.게시물들[1].내용 = "바다";
	}
	
	int 게시물갯수를구하다() {
		return this.게시물들.length;
	}
	
	게시물 게시물을찾다 (int 게시물번호) {
		게시물 번호게시물 = this.게시물들[게시물번호-1];
		return 번호게시물;
	}
	
	게시물[] 모든게시물을수집하다() {
		return this.게시물들;
	}
}
public class Code7 {

	public static void main(String[] args) {
		게시물저장소 한저장소;
		한저장소 = new 게시물저장소();
		한저장소.준비하다();
		
		int 갯수 = 한저장소.게시물갯수를구하다();
		
		게시물 찾은게시물 = 한저장소.게시물을찾다(1);
		
		게시물[] 모든게시물들 = 한저장소.모든게시물을수집하다();
		
		System.out.println(갯수);
		System.out.println(찾은게시물.번호);
		
		System.out.println(모든게시물들[0].번호);
		System.out.println(모든게시물들[0].제목);
		System.out.println(모든게시물들[0].내용);
		
		System.out.println(모든게시물들[1].번호);
		System.out.println(모든게시물들[1].제목);
		System.out.println(모든게시물들[1].내용);
	}
}