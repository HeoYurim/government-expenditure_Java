package ch04;

public class IfNestedExam {

	public static void main(String[] args) {

		//81~100 사이 값을 난수로 발생시킨다.
		int score = (int)(Math.random() * 20) + 81;
		
		System.out.println("현재 점수는 : " + score);
		
		String grade;
		
		if(score >= 90) {	//90점 이상인지를 묻는다.
			if(score >= 95) {	//95점 이상인지를 묻는다.
				grade = "A+";	//95점 이상이면 A+
			}else {
				grade = "A";	//90점 이상이면 A
			}
		}else {
			if(score >= 85) {	//85점 이상인지를 묻는다.
				grade = "B+";	//85점 이상이면 B+
			}else {
				grade = "B";	//85점 이상이면 B
			}
		}
		System.out.println("학점 : " + grade);
	}

}
