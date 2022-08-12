/*
 * 1. 원래 Lambda는 Scala나 Groovy에서 사용하기 위해 만든 익명 메소드
 * 2. Java는 1.8버전에서 함수형언어를 구현하기 위해 도입함.
 * 3. 
 */
public class LambdaDemo {
	public static void main(String[] args) {
//		MyInterface mi = new MyInterface() {
//			@Override
//			public int calculate(int a, int b) {
//				return a+b;
//			}
//		};
		MyInterface mi = (a, b) -> a + b;
		int result = mi.calculate(5, 9);
		System.out.println("Result =" + result);

		mi = (a, b) -> a * b;
		result = mi.calculate(5, 9);
		System.out.println("Result =" + result);

		mi = (a, b) -> a - b;
		result = mi.calculate(5, 9);
		System.out.println("Result =" + result);
	}
}

interface MyInterface {
	int calculate(int a, int b);
}
