package p1;

public class 게시물저장소{
	public 게시물[] 게시물들;
	public 게시물저장소(){
		게시물들 = new 게시물[2];
		
		게시물들[0]=new 게시물();
		게시물들[0].번호=1;
		게시물들[0].제목="봄@@@";
		게시물들[0].내용="봄꽃";
		
		게시물들[1]=new 게시물();
		게시물들[1].번호=2;
		게시물들[1].제목="여름####";
		게시물들[1].내용="바다";
	}
	public int 게시물갯수를구하다() {
		return 게시물들.length;
	}
	public 게시물 게시물을찾다(int 게시물번호) {
		return 게시물들[게시물번호-1];
	}
	public 게시물[] 모든게시물을수집하다( ) {
		return 게시물들;
	}
}
