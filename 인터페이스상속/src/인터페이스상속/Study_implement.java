package 인터페이스상속;

import java.util.ArrayList;

/*
class와 interface 차이 
- class : 객체 설명서 
- interface : 추상적인 객체 설명서 
	- 추상적 : 구체적이지 못한 -> 메소드 바디가 없는 
 */
class 프로펠러비행기 {
	public void 날다() {
		System.out.println("프로펠러가 돈다");
	}
}
interface 비행기{
	public void 날다();
	// 행동(메소드)의 내용이 없음 즉, 행동(메소드)의 바디가 없음 
	// 이러면 비행기를 가져다 쓸 때 날다의 행동을 마음대로 추가할 수 있겠네 
	// 인터페이스로는 객체를 못만든다 = 행동(메소드)을 구체화 시킬 방법이 없음 
}

class 수직이착륙비행기 implements 비행기{
	public void 날다() {
		System.out.println("슝~");
	}
}

// ========================== 새로운 예시 ======================
interface 병사{
	public void 싸우다();
	// 어떻게 싸울지(행동을 구체화) 모르기 때문에 interface사용 
}

class 검병사 implements 병사{ // implements : 추상적인것을 포함
	public void 싸우다() {
		System.out.println("검을 가지고 싸우다.");
	}
	public void 군사시설을만들다() {
		
	}
}


class 총병사 implements 병사 {
	public void 싸우다() {
		System.out.println("총을 가지고 싸우다.");
	}
	public void 군사시설을만들다() {
		
	}
}

class 마법사 implements 병사{
	public void 싸우다() {
		System.out.println("마법을 가지고 싸우다.");
	}
	public void 치료하다() {
		System.out.println("마법을 가지고 치료");
	}
}
// class와 interface의 차이점 : 행동(메소드)의 바디가 없음
/*
extends와 implements의 차이점
- extends : 행동(메소드)의 바디 상세부분이 모두 포함 
- implements: 행동(메소드)의 바디 상세부분이 없이 요약부분만 포함하여 새로운 클래스를 만들어 행동(메소드)의 상세 부분 작성   
 */

interface 강사{
	public void 가르치다();
}

interface 부모{
	public void 용돈을주다();
}

interface 유권자{
	public void 투표를하다();
}

class 나 implements 강사, 부모, 유권자{
	public void 가르치다() {
		System.out.println("자바를 가르치다");
	}
	public void 용돈을주다() {
		System.out.println("각 20만원씩 주다");
	}
	
	public void 투표를하다() {
		System.out.println("나의 권리를 보장해줄 수 있는 사람에게 투표");
	}
}

public class Study_implement {

	
	
	public static void main(String[] args) {
		비행기 비행기1 = new 수직이착륙비행기();
		비행기1.날다();
		
		병사 검사 = new 검병사();
		병사 총사 = new 총병사();
		병사 마법사1 = new 마법사();
		검사.싸우다();
		총사.싸우다();
		마법사1.싸우다();
		
		ArrayList<병사> 병사들 = new ArrayList<병사>();
		병사들.add(new 검병사());
		병사들.add(new 총병사());
		병사들.add(new 마법사());
		
		for(int 번=0; 번<병사들.size(); 번 = 번+1) {
			병사들.get(번).싸우다();
		}
		
		// 이렇게도 사용한다는게 재밌네 
		나 이경복 = new 나();
		강사 이강사 = 이경복;
		부모 아빠 = 이경복;
		유권자 국가주인 = 이경복;
		이강사.가르치다();
		아빠.용돈을주다();
		국가주인.투표를하다();
	}

}
