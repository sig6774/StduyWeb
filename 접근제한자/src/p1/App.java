package p1;

import p2.A;
// A클래스의 접근제한자는 public이라서 import 가능
// 공개되지않는(not public) 클래스는 import 불가라고 생각 


class A2 {
	private void g() {System.out.println("접근O");}
	public void h() {
		g();
	}
	protected int e() {
		return 7;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A A1 = new A();
		A1.v2 = 3;
//		A1.v1 = 3; 안됨 
		A1.h();
		// A클래스의 행동(메소드) 불러오기 가능 
//		A1.g(); 접근못함
		System.out.println("public인 변수값 : " + A1.v2);
		System.out.println("A클래스의 Public만 현재 App클래스에서 접근할 수 있고 default인 h()는 현재 접근못함");
		// public을 제외한 나머지를 사용하는 이유는 필요할 때 조건이나 제한을 걸어 이상값이 오는 것을 막을 수 있다고 생각?
		/*
		 public class Board {
		 		private no; 
		 		public int getNo() {
		 					return no;
		 					}
		 		public void setNo(int no) {
		 					if (no<0) {return    ;}
		 					this.no = no;
		 					}
		 - public외의 다른 것을 사용하는 이유이며 no가 public이면 직접 접근해서 이상한 값이 들어올 수 있기 때문에
		 - 행동(메소드)을 통해 값이 들어오는 것을 제한할 수 있기 때문에 사용 
		 */
		
		A2 a2 = new A2();
		a2.h();
		// h()안에 private 행동(메소드)이 있고 같은 클래스안에 있기 때문에 g() 행동(메소드) 출력가능
		// 즉, 같은 클래스에서 private을 감싸고 있는 행동(메소드)이 private이 아니면 다른 클래스에서도 출력가능
		System.out.println(a2.e());
		
		
		
		

	}

}
