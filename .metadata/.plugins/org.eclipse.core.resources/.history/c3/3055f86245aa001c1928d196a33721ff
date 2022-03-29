package Day7;
/*
- 게시물, 게시물저장소, 게시물관리자를 만들어 서로 관계를 맺도록 진행 
- 게시물관리자를 통해 게시물 저장소에 접근하고 게시물 저장소에서 게시물들에 접근 
- 이후 원하는 게시물을 게시물번호로 확인하여 반환
- 전체 게시물을 반환 
- 반복문을 사용하여 게시물들에 대해서 순차적 출력 
 */
class 게시물{
	int 번호;
	String 제목;
	String 내용;
	String 작성일;
}

class 게시물저장소{
	게시물[] 게시물들;
	게시물저장소(){
		this.게시물들 = new 게시물[2];
		
		this.게시물들[0] = new 게시물();
		this.게시물들[0].번호 = 2;
		this.게시물들[0].제목 = "점심메뉴";
		this.게시물들[0].내용 = "중식";
		
		this.게시물들[1] = new 게시물();
		this.게시물들[1].번호 = 1;
		this.게시물들[1].제목 = "저녁메뉴";
		this.게시물들[1].내용 = "한식";
	}
	
	int 게시물들개수() {
		return 게시물들.length;
	}
	
	게시물 특정게시물찾기(int 게시물번호) {
		return 게시물들[게시물번호-1];
	}
	
	게시물[] 전체게시물( ) {
		return 게시물들;
	}
}

class 게시물관리자{
	게시물저장소 게시물들전체 = new 게시물저장소();
	
	게시물 게시물찾다(int 게시물번호) {
		return this.게시물들전체.특정게시물찾기(게시물번호);
	}
	
	게시물[] 전체조회() {
		return this.게시물들전체.전체게시물();
	}
}
public class 게시물연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int 게시물번호 = 2;
		게시물관리자 한게시물관리자 = new 게시물관리자();
		게시물 특정게시물 = 한게시물관리자.게시물찾다(게시물번호);
		System.out.println(특정게시물.번호);
		System.out.println(특정게시물.제목);
		System.out.println(특정게시물.내용);
		
		게시물[] 모든게시물 = 한게시물관리자.전체조회();
		System.out.println(모든게시물[0].번호);
		System.out.println(모든게시물[0].제목);
		System.out.println(모든게시물[0].내용);
		
		System.out.println("게시물 목록");
		System.out.println("===========================");
		for (int 회 = 0;  회 < 모든게시물.length; 회++) {
			System.out.printf("%d %s%n", 회+1, 모든게시물[회].제목);
			System.out.printf("%d %s%n", 회+1, 모든게시물[회].내용);
		}
	}

}
