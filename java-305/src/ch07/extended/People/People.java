package ch07.extended.People;

public class People { //부모 클래스
	
	public String name;
	public String ssn;
	
	//부모 객체의 생성자 생성완료 (기본생성자 없음)
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
}
