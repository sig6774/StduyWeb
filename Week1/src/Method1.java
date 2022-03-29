class 게시물{
	int 번호;
	String 제목;
}

class 게시물관리자{
	게시물 최근게시물을찾아주다(){
		// 행동(메소드)의 결과로 짝지어진 것은 위의 게시물 클래스에서 생성된 하나의 객체 
		게시물 최근게시물 = new 게시물();
		// 최근 게시물이라는 객체를 게시물 클래스에서 생성 
		최근게시물.번호 = 10;
		최근게시물.제목 = "봄";
		return 최근게시물;
		// 최근게시물을찾아주다의 행동(메소드)으로 최근게시물을 짝지어라라는 뜻 
		// 최근게시물을찾아주다() = 최근게시물 
	}
}
public class Method1 {

	public static void main(String[] args) {
		게시물관리자 어떤게시물관리자 = new 게시물관리자();
		// 어떤게시물관리자라는 객체 생성 
	
		게시물 찾은게시물 = 어떤게시물관리자.최근게시물을찾아주다();
		// 리턴이 되는거니깐 int a = ~~~ 이런거랑 똑같은 형태 즉, 새로운 객체에 어떤 메소드의 결과를 넣어주는데 메소드의 결과가 객체
		// 위에꺼처럼 생각하지말고 그냥 찾은 게시물이 "어떤게시물관리자.최근게시물을찾아주다();"라는 객체를 가르킨다라고 생각 
		// 어떤게시물관리자.최근게시물을찾아주다(); == new 게시물();
		// 찾은게시물이 메소드의 결과를 가르킴 
		
		System.out.println(찾은게시물.제목);
		System.out.println(찾은게시물.번호);
		// 메소드의 반환값들을 객체에 저장했으므로 변수와 다르게 여러개의 값이 저장된 것을 확인 
		
		찾은게시물.번호 = 135;
		System.out.println(찾은게시물.번호);
		// 참조한 객체안의 값을 바꿀 수 있네 
	}

}
