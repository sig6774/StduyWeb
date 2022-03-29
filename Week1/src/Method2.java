class B{
	B giveB() {
		return new B();
	}
}

class 학생{
	학생 소개시키다() {
		return new 학생();
	}
}

class 학생1{
	학생1 소개시키다() {
		학생1 한여학생 = new 학생1();
		return 한여학생;
	}
	int 몇살이야() {
		return 23;
	}
}
// return이 새로운 객체 생성 
public class Method2 {

	public static void main(String[] args) {
		B b1 = new B();
		// 객체 생성 
		B b3 = b1.giveB();
		System.out.println(b3);
		
		학생 철수 = new 학생();
		학생 이상형 = 철수.소개시키다();
		// 이상형은 철수.소개시키다()라는 것을 가르킴
		
		
		
		학생1 기철이 = new 학생1();
		학생1 한예슬 = 기철이.소개시키다(); // 참조값-의미로 짝지어짐
		System.out.println(한예슬); 
		System.out.println(한예슬.몇살이야());
		int 한예슬나이 = 한예슬.몇살이야(); // 일상값으로 짝지어짐
		System.out.println(한예슬나이);
		
	}
}
