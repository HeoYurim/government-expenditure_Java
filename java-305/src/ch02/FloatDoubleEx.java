package ch02;

public class FloatDoubleEx {

	public static void main(String[] args) {

		double var1 = 3.14;
	  //float var2 = 3.14;  //float 타입에는 F를 붙여야 한다.
		float var3 = 3.14F;
		
		//정밀도 테스트
		double var4 = 0.123456789123456789;
		float var5 = 0.123456789123456789F;
		
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}

}
