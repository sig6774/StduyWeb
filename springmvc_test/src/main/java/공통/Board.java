package 공통;
// VO : 값만 가지고 있고 값을 가져오거나 값을 쓰는 역할 
// 이게 VO 
public class Board {
	 // getter & setter만들기 : source를 블록지정하고  generate getter setter클릭
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	int no; 
	String title;
	String contents;
}
