package Day6;
/*
사칙연산 수행하는 프로그램
- 수 받아오기 
- 받은 수를 바탕으로 여러 사칙연산 수행   
 */

class 수{
	int 수1, 수2;
	int[] 수를입력해주세요(int 수1, int 수2) {
		int[] 수들 = new int[2];
		수들[0] = 수1;
		수들[1] = 수2;
		return 수들;
	}
}

class 사칙연산{
	int 전체수;
	int 전체수1;
	사칙연산(int 수1, int 수2){
		this.전체수 = 수1;
		this.전체수1 = 수2;
	}
	
//	int 더하기(int 수1, int 수2) {
//		return 수1 + 수2;
//	}
//	int 빼기(int 수1, int 수2) {
//		return 수1 - 수2;
//	}
//	int 곱하기(int 수1, int 수2) {
//		return 수1 * 수2;
//	}
//	float 나누기(int 수1, int 수2) {
//		return 수1 / 수2;
//	}
	
	
	int 더하기() {
		return this.전체수 + this.전체수1;
	}
	int 빼기() {
		
		return this.전체수 - this.전체수1;
	}
	int 곱하기() {
		return this.전체수 * this.전체수1;
	}
	float 나누기() {
		return (this.전체수 / this.전체수1);
	}
	
}
public class 사칙연산프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		수 수입력 = new 수();
		int[] 수틀 = 수입력.수를입력해주세요(20,30);
		System.out.println(수틀[0]);
		System.out.println(수틀[1]);
		System.out.println("======================");
		
		사칙연산 테스트 = new 사칙연산(30,30);
		System.out.println(테스트.전체수);
		System.out.println(테스트.전체수1);
		System.out.println(테스트.더하기());
		System.out.println(테스트.빼기());
		System.out.println(테스트.곱하기());
		System.out.println(테스트.나누기());
	}

}
