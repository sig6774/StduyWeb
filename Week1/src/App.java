class 게시물 {
	int 번호;
	String 내용;
	String 제목;
	String 작성일;
}

//객체 : 복합적인 것(변수와 메소드)으로 구성된 것 
//클래스 : 객체에 대한 설명서 
class 자동차 {
	 int 속도 = 0; 
	int 유량 = 0;
	
	// 값 이용 및 변경
	void 주유받다(int 주유량) {
		유량 = 유량 + 주유량;
	}
	 
	// 값 이용 및 변경
	void 가속하다() {
		유량 = 유량 -1;
		속도 = 속도 +10;
	}
	 
	// 값 이용 
	int 속도는() {
		return 속도;
	}
	// 최종적으로 return
	// 메소드는 실제 값을 이용 및 변경
}
public class App {

	public static void main(String[] args) {
		�Խù� ���Խù� = new �Խù�(); // ���������� ���� ��ü ���� 
		���Խù�.��ȣ = 1;	
		System.out.println(3+5);
		System.out.println(4+6);
		int Math; // ����
		int a; 
//		System.out.println(a);  // ���� �������� �ʾ����Ƿ� ���� 
		a = 7;
		System.out.println(a);
		int  []��Ʋ; // ���� 
		
		int [] �����; // �����Ѵ� 
		����� = new int[4]; // �����ϴ� ���� 4���� ������ ������ �ִ�. 
		�����[0] = 1234;
		// ù��° ������ 1234��� ���� ���� 
		
		System.out.println(�����[0]);
		
		�ڵ��� ���� = new �ڵ���();
		����.�����޴�(20);
		����.�����ϴ�();
		System.out.println(����.�ӵ���());
		System.out.println(����.�ӵ�);
		
		
	}
}

