package 예외처리;

class 나의예외 extends Exception{
	public 나의예외(String 메시지) {
		super(메시지);
		// Exception의 생성자 중 String의 내용을 보여줌 
		// super는 Exception을 뜻하며 포함되어지는 클래스를 뜻함 
	}
}
class 수학자{
	public void 나누다(int 나누어지는수, int 나누는수) throws Exception{ // 예외 발생 가능성 알림
		// throws Exception : 어떤 예외가 발생할 수 있는가?를 뜻하며 예외상황이 발생했을때를 표현하는 클래스  
		
		if (나누는수==0) { // 발생하면 안되는 경우의 수
			throw new Exception("0은 안돼");
			// throw new Exception() : 예외가 발생했을때 예외객체를 생성해서 사용자에게 보여줌 
			// 0일때의 예외가 발생했을때 "0은 안돼"라는 것을 보여줌
			// 예외가 발생한 상황이면 그 상황을 던진다고 생각하자 
		}
		else {
			System.out.println(나누어지는수 / 나누는수);
		}
	}
	
	public void 테스트(int 수) {
		System.out.println(수);
	}
}

class 수학자1{
	public void 나누다(int 나누어지는수, int 나누는수) throws 나의예외{
		// 나의예외 클래스는 Exception의 내용을 모두 포함하고 있고 이렇게 예외처리도 가능
		
		if (나누는수==0) { 
			throw new 나의예외("0은 안돼");
		}
		else {
			System.out.println(나누어지는수 / 나누는수);
		}
	}
}
// 아까는 Exception이라는 클래스가 숨겨져 있었고 지금은 나의예외라는 클래스가 Exception의 내용을 모두 상속받고 있어 화면에 보인다는 것 말고는 차이가 없음 

public class TryCatch {

	
	public static void main(String[] args) {

		수학자 한수학자 = new 수학자();
		수학자1 두수학자 = new 수학자1();

//		한수학자.나누다(24, 8);
//		 빨간줄이 뜨는 이유는 예외 발생 가능성이 있을때는 이것을 격리 관찰해야함으로 빨간줄 발생 
		try {
			한수학자.나누다(24, 8);
			// try블록은 예외 발생 가능성이 있는 클래스의 객체를 수행하기 위해 사용
			한수학자.나누다(23, 0);
			// try블록안에서 예외상황이 발생하게 되면 catch 블록안의 내용이 실행 
		}
		catch(Exception ex) {
			// 예외상황이 발생하여 ex라는 객체가 생성된다면 catch블록안에 내용을 수행
			// 예외상황이 발생하면 ex객체를 통해 예외 처리 
			System.out.println(ex.getMessage());
			// 예외가 발생하면 throw new Exception의 내용을 catch에서 생성한 ex객체가 가져와서 보여줌
			// 예외가 발생한 상황을 throw한 것을 여기서 catch해서 보여줌
		}
		
		한수학자.테스트(3);
		try {
			두수학자.나누다(24, 8);
			// try블록은 예외 발생 가능성이 있는 클래스의 객체를 수행하기 위해 사용
			두수학자.나누다(23, 0);
			// try블록안에서 예외상황이 발생하게 되면 catch 블록안의 내용이 실행 
		}
		catch(나의예외 ex) {
			// 예외상황이 발생하여 ex라는 객체가 생성된다면 catch블록안에 내용을 수행
			// 예외상황이 발생하면 ex객체를 통해 예외 처리 
			System.out.println(ex.getMessage());
			// 예외가 발생하면 throw new Exception의 내용을 catch에서 생성한 ex객체가 가져와서 보여줌
			// 예외가 발생한 상황을 throw한 것을 여기서 catch해서 보여줌
		}
	}
	// 예외가 발생한 가능성이 있는 메소드를 수행해야한다면 반드시 격리(try)해야하고 예외 상황이 발생했을때의 조치도 보여줘야함 
}
