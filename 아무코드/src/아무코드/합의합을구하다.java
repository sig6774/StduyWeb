package 아무코드;

public class 합의합을구하다 {
	static int 수까지의합을구하다(int 수) {
		
		int 번 = 1;
		int 합 = 0;
		while (번 <= 수) {
			int 항 = 번;
			합 = 합 + 항;
			// 항을 누적한다.
			번 = 번+1;
		}
		return 합;
}

	static int 합의합(int 중첩더하고싶은수) {
		int 회 = 1;
	    int 전체합 = 0;
	    while (회 <= 중첩더하고싶은수) {
	    	int 부분합 = 합의합을구하다.수까지의합을구하다(회);
	    	// 요렇게 표현 가능 
	    	전체합 = 전체합 + 부분합;
	    	회 = 회+1;
	    }
	    return 전체합;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(합의합(100));
	}

}
