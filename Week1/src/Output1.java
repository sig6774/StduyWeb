/*
 - 출력이 없는 행동(메소드)은 자바에서는 void()로 시작 
 - 행동(메소드)안에 할일들은 존재하지만 짝지어진 값은 없음 
 - 철수가 시험을보다 ⇒ 철수.시험을보다()
    - 만약 시험을 보면 시험지를 꼭 제출해야 한다면 철수.시험을보다()는 시험지로 연결할 수 있음
- 학생이 점심을먹는다 ⇒ 학생.점심을먹는다()
    - 만약 점심을 먹으면 영수증을 꼭 제출해야 한다면 학생.점심을먹는다()는 영수증으로 연결할 수 있음
 */

class A{
	public void g() {
		System.out.println("할일1");
		System.out.println("할일2");
		System.out.println("할일3");
	}
}

class A1{
	public void h() {
		System.out.println("7");
	}
}

//class A2{
//	public int k() {
//		System.out.println("할일");
//	}
//}
//// 반환(return)할 것이 있어야하는데 없으므로 에러가 남 
//
//class A3{
//	public void m() {
//		System.out.println("할일");
//		return 8;
//	}
//}
// void가 있는데 return이 있어서 에러가 남 

class A4{
	public int g() {
		return 7;
	}
	
	
	public int h() {
		int v = 7;
		return v;
	}
	
	public int k() {
		int t = 7;
		return t + 4;
	}
	
	public String m() {
		return "Seoul";
	}
//	public int[] de() {
//		int[][] de = null;
//		return de[0];
//	}
}

public class Output1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.g();
		// 출력이 없는(void) 클래스에서 객체를 생성하였으므로 출력이 아무것도 없음
		
		A1 a2 = new A1();
//		int v = A1.h();
		// return이 없는 void인데 int v에 넣을려고 하니깐 에러가 남 

		A4 a3 = new A4(); 
		System.out.println(a3.g());
		System.out.println(a3.h());
		System.out.println(a3.k());
		System.out.println(a3.m());
//		System.out.println(a3.de());
		
	}


}
