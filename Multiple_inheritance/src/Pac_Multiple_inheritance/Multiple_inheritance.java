package Pac_Multiple_inheritance;

class A{}
class B{}

//class C extends A, B{} 
// 자바에서는 동시에 2개이상의 클래스 상속을 할 수 없도록 막아놨음 
// java는 interface를 제외한 다른 것은 다중 상속 표현을 막음  
// java는 interface가 아닌 것은 오직 1개만 포함 가능 

interface C{
	public void 잠온다();
}

interface D{
	public void 잔다();
}

class E implements C,D{
	
	@Override 
	public void 잠온다() {
		System.out.println("밥을 많이 먹어서 잠이 온다.");
	}
	
	@Override
	public void 잔다() {
		System.out.println("쉬는시간에 잔다.");
	}
}
// interface는 다중 상속 가능 

// interface 다중 상속 예시
// 주민은 생산과 공격을 모두 할 수 있고 무사는 공격만 할 수 있음 
interface 생산캐릭터 {
	public int 생산하다();
}

interface 공격캐릭터 {
	public void 공격하다();
}



class 주민 implements 생산캐릭터, 공격캐릭터{
	@Override 
	public int 생산하다() { 
		int 자원 = 5;
		System.out.println("주민은 " + 자원 +  " 생산을 하고 있다.");
		return 자원;
	}
	@Override
	public void 공격하다() {
		System.out.println("주민은 공격을 할 수 있다.");
	}
}

class 무사 implements 공격캐릭터{
	@Override 
	public void 공격하다() {
		System.out.println("무사는 공격만 할 수 있다.");
	}
}

public class Multiple_inheritance {

	public static void main(String[] args) {
		E e1 = new E();
		e1.잔다();
		e1.잠온다();
		
		주민 주민1 =  new 주민();
		무사 무사1 = new 무사();
		주민1.공격하다();
		주민1.생산하다();
		무사1.공격하다();

	}
}
