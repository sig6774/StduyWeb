class 게시물{
	 String d;
}

public class App {

	public static void main(String[] args) {

		int 수학점수; // 변수 준비
		수학점수 = 100; // 변수 이용 
		System.out.println(수학점수);
		
		// 참조변수 준비 
		int a;
		int [] 수틀; 
		수틀 = new int[2]; // 정수가 2개 들어갈 수 있는 주머니를 준비
		
		// 이용 
		수틀[0] = 0;
		수틀[1] = 1;
		System.out.println(수틀[0]);
		System.out.println(수틀[1]);
		
		// 참조변수 준비 
		게시물 최근게시물;
		게시물[] 수집된게시물들;
		
		수집된게시물들 = new 게시물[3];
		// new 게시물() : 객체 1개 준비 
		// new 게시물[] : 게시물을 가르키는 것 2개 준비 
		// 게시물 class가 들어갈 수 있는 3개 집합 준비
		수집된게시물들[0] = new 게시물();
		// 첫번째 게시물들을 가르키는 것 준비 
		// 수집된게시물들 이라 식별하고 참조배열 이용 
		System.out.println(수집된게시물들[0]); // 참조배열 이용 
		System.out.println(수집된게시물들);
		
		게시물[] a1 = new 게시물[3]; 
		// class도 하나씩 만드는게 아니라 여러개 만드는게 가능하네
		a1[0] = new 게시물();
		a1[1] = new 게시물();
		a1[2] = new 게시물();
		// 이게 중요! new를 통해서 준비해줌 
		
		a1[0].d = "3232";
		a1[1].d= "ㅈㄷ가ㅜ다";
		a1[2].d= "tkenrk";
		
		System.out.println(a1[0].d );
		System.out.println(a1[1].d );
		System.out.println(a1[2].d );
		// Class도 여러개 만들어서 각각 값을 지정해줄 수 있네 
		
		int [] 집비번;
		집비번 = new int[4]; // 4개가 들어갈 수 있는 배열 준비 
		// 집비번이라는 참조변수를 생성해서 집비번은 4개의 값이 들어갈 수 있는 배열을 생성
	}
}