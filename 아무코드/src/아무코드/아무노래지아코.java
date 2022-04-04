package 아무코드;

import java.util.ArrayList;

//값을 두개 넣으면 사칙연산을 해주는 클래스 생성 
//행동에는 두개의 숫자를 입력하고 처리 후 하나의 처리결과를 반환 
class 계산기{
	int 덧셈(int 수1, int 수2) {
		return 수1 + 수2;
	}
	int 뺄셈(int 수1, int 수2) {
		return 수1 - 수2;
	}
	int 곱셈(int 수1, int 수2) {
		return 수1 * 수2;
	}
	int 몫(int 수1, int 수2) {
		return 수1 / 수2;
	}
	int 나머지(int 수1, int 수2) {
		return 수1 % 수2;
	}
}

public class 아무노래지아코 {
	
	static void 줄넘기뛰기(int 횟수) {
		// 입력으로 받은 숫자만큼 프린트하기
		int 수 = 횟수;
		for (int i = 1; i <= 수; i++) {
			System.out.println("줄넘기" + i+"번 폴짝~");
			
		}
	}
	
	static void 줄넘기열번뛰기() { // 요약
		
		int 회 = 1;
		while (회<=10) {
			System.out.println("줄넘기");
			회 = 회+1;
		}
		// 줄넘기열번뛰기는 입력이 필요없고 출력은 화면에 보여주는 것이고 내용은 화면에 보여주기 위해 필요한 처리들
	}

static int maxno(int 수1, int 수2) {
	int 큰수;
	if (수1 > 수2) {
		큰수 = 수1;
	}
	else {
		큰수 = 수2;
	}
	return 큰수;
}

static void count() {
	int 회 = 1;
	while (회 <= 10) {
		System.out.println(회 + ": 회");
		회 = 회 + 1;
	}
}



// 분을 시로 바꾸는 것이 행위의 목적이고 입력은 분이고 출력은 시간과 분으로 출력 
static ArrayList<Integer> 분to시 (int 입력) {
	
	ArrayList<Integer> 시간분 = new ArrayList<Integer>();
	int 시간;
	int 분;
	시간 = 입력 / 60;
	분 = 입력 % 60;
	시간분.add(시간);
	시간분.add(분);
	
	return 시간분;
	
}

static int 나누어지는수와나누는수(int 나누어지는수, int 나누는수) {
	while (나누어지는수 > 나누는수) {
		나누어지는수 = 나누어지는수 - 나누는수;
	}
	return 나누어지는수;
}

static int 나누어지는수와나누는수1(int 나누어지는수, int 나누는수) {
	while (나누어지는수 > 나누는수) {
		나누어지는수 -= 나누는수;
	}
	return 나누어지는수;
}

static int max(ArrayList<Integer> 임의의정수들) {
	int 최대값 = 0;
	for(int i=0; i< 임의의정수들.size(); i++) {
		if (최대값 < 임의의정수들.get(i)) {	
		최대값 = 임의의정수들.get(i);
		}
}
	return 최대값;}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		줄넘기열번뛰기();
		줄넘기뛰기(5);
		
		System.out.println(maxno(34,2348));
		
		
		count();
		
		ArrayList<Integer> 총시간과분 = 분to시(100);
		System.out.println("시간은 " + 총시간과분.get(0) + "시이며 분은 " +  총시간과분.get(1) + "분 입니다.");
		
		System.out.println(나누어지는수와나누는수(30,4));
		
		계산기 연산계산기 = new 계산기();
		System.out.println(연산계산기.덧셈(50, 20));
		System.out.println(연산계산기.뺄셈(50, 20));
		System.out.println(연산계산기.곱셈(50, 20));
		System.out.println(연산계산기.몫(50, 20));
		System.out.println(연산계산기.나머지(50, 20));
		
		System.out.println(나누어지는수와나누는수1(30,4));

		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(1);
		numbers.add(10);
		System.out.println(max(numbers));
	}

}
