package ch09;

interface Talkable{
	void talk();
}

class Korean implements Talkable{
	public void talk() {
		System.out.println("�ȳ��ϼ���!");
	}
}

class American implements Talkable{
	public void talk() {
		System.out.println("Hello!");
	}
}

public class TalkableTest {
	static void speak(Talkable t) {
		t.talk();
	}
	
	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}
}
