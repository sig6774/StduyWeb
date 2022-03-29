class Z{
	int a = 0;
	void g() {
		this.a = 7;
	}
	void h() {
		int a; 
		a = 7;
	}
	void k(int a) {
		a = 7;
	}
	void k1(int a) {
		this.a = 7;
	}
	
	// k와 k1은 행동범위일수도 객체범위일수도 있음 그렇기 때문에 this를 붙여서 객체범위를 표현
	int m() {
		return this.a;
	}
	int r() {
		int a = 7; 
		return a;
	}
}

class Z1{
	int a = 0;
	void x(int a) {
		this.a = a;
		// 인수로 받은 a를 this.a로 지정하면 입력된 a와 같게됨
	}
	int m () {
		return this.a;
	}
	int y() {
		return this.m();
		// 위에 m()을 지칭 
	}
}

// this는 그냥 행동범위와 객체범위 변수가 헷갈리지 않도록 쓰는건가
public class Code5_z {

	public static void main(String[] args) {

		Z z1 = new Z();
		Z z2 = new Z();
		z1.a = 3;
		z2.k1(3);
		System.out.println(z1.m());
		// 위에서 a를 3으로 지정했기 때문에 this.a의 값이 출력 
		System.out.println(z2.m());
		// k1()이라는 행동을 실행했기 때문에 출력이 7 
		
		Z1 z3 = new Z1();
		z3.x(3);
		System.out.println(z3.m());
		System.out.println(z3.y());
		
		z3.a = 15;
		System.out.println(z3.m());
		// 직접 접근해서 값을 바꿀 수 있음 
		z3.x(53);
		System.out.println(z3.m());
		// 행동(메소드)을 통해 객체 범위 값을 바꿀 수 있음 
	}
}