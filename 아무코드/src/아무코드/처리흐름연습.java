package 아무코드;

import java.util.ArrayList;

public class 처리흐름연습 {

static int max(int 수1, int 수2){
	if (수1 > 수2){ return 수1;}
	else { return 수2;}
}

static int absolute(int 수1) {
	int 절대값;

	if(수1 < 0) { 절대값 = (수1*-1); ;}
	else { 절대값 = 수1;}
	return 절대값;
}
static void countprint() {
	for (int i = 1; i <= 10; i++) {
		System.out.println(i + "번 출력");
	}
}

static void sumno() {
	int 합 = 0;
	for (int i = 1; i <= 10; i++) {
		합 += i;
	}
	System.out.println(합);
}

static void sumno1() {
	int 합 = 0;
	int 넣을수 = 1;
	while (넣을수 <= 10) {
		합 = 합 + 넣을수;
		넣을수 = 넣을수 + 1;
	}
	System.out.println(합);
}

static int 큰수구하기(ArrayList<Integer> 숫자들) {
	int 큰수 = 0;
	for (int i = 0; i<숫자들.size(); i++) {
		if (숫자들.get(i) > 큰수) {
			큰수 = 숫자들.get(i);
		}
	}
	return 큰수;
}

static int 가장큰수구하다( int[] 수들) {// 1. 수들 입력 
	// 2. 가장 큰 수 구함 
	// 2.1 첫수를 가장 큰 수로 가정 
	int 큰수 = 수들[0];
	// 2.2 나머지 수들과 비교하여 가장 큰 수를 정함 
	// (2번째부터 개수까지) 동안 
	int 번 = 1;
	while (번 < 수들.length) {
		if (수들[번] > 큰수) {
			큰수 = 수들[번];
		}
		번++; // 번째세기 
	}
	return 큰수;
	// 3. 가장 큰 수를 출력 
}

static int 총임금(int 사원분류코드, int 근무시간) {
	int 총임금 = 0;
	
	if (사원분류코드 == 1) {
		총임금 = 근무시간 * 150;
	}
	else if (사원분류코드 == 2){
		총임금 = 근무시간 * 200;
	}
	else {
		총임금 = 근무시간 * 300;
	}
	return  총임금;
}

static int 총임금1(int 사원분류코드, int 근무시간) {
	int [] 시간당임금 = new int [] {150, 200, 300};
	int 총임금;
	if (사원분류코드 == 1) {
		총임금 = 시간당임금 [사원분류코드+1] * 근무시간;
	}
	else if (사원분류코드 == 2) {
		총임금 = 시간당임금[사원분류코드+1] * 근무시간;
	}
	else {
		총임금 = 시간당임금[사원분류코드+1] * 근무시간;
	}
	return 총임금;
}

static int 최종합() {
	int 부분합 = 0;
	int 최종합 = 0;
	
	for (int 횟수 = 1; 횟수 <= 10; 횟수++) {
		부분합 = 부분합 +  횟수; 
		최종합 = 최종합 + 부분합;
	}
	return 최종합;
}

static int 수까지합구하다(int 회) {
	int 합 = 0;
	int 넣을수 = 1;
	while (넣을수 <= 회) {
		합 = 합 + 넣을수;
		넣을수 = 넣을수 + 1;
	}
	return 합;
}

static int 중첩합구하기() {
	int 횟수 = 1;
	int 전체합 = 0;
	
	while (횟수 <= 10) {
		int 부분합 = 수까지합구하다(횟수);
		// 부분합은 특정 횟수일때만 있는 변수이며 횟수가 넘어가면 새로운 부분합이 생김
		전체합 = 전체합 + 부분합;
		횟수 = 횟수+1;
	}
	return 전체합;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(30,20));
		System.out.println(absolute(-239));
		System.out.println(absolute(0));
		
		countprint();
		sumno();
		sumno1();
		ArrayList<Integer> 값들 = new ArrayList<Integer>();
		값들.add(3422);
		값들.add(422);
		값들.add(32);
		값들.add(2);
		System.out.println(큰수구하기(값들));
		
		int[] 수들 = new int [] {24234, 23, 12 , 5, 4};
		System.out.println(가장큰수구하다(수들));
		
		System.out.println(총임금(2, 8));
		System.out.println(총임금(3, 8));
		System.out.println(최종합());
		System.out.println(수까지합구하다(5));
		System.out.println("중첩합 : " + 중첩합구하기());

	}

}
