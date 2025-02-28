package lambda;

public class Ex2 {

	public static void main(String[] args) {
		
//		// 구현체를 이용하여 함수를 호출
//		Calc calc1 = new MyCalc();
//		System.out.println(calc1.add(5, 10));
		
		// 
		Calc calc2 = (num1,num2) -> num1 + num2;
		System.out.println(calc2.add(5, 10));
	}

}

// 함수형 인터페이스
// 함수형 인터페이스는 추상메소드를 하나만 가질 수 있다
// @~~ : 어노테이션
@FunctionalInterface // 인터페이스 안에 추상메소드가 하나 이상 들어오면 에러남
interface Calc {
	int add(int num1, int num2);
	// 추상 메소드가 여러개면 람다식 함수를 대입할 때, 대상을 찾을 수 없다
//	int add2(int num1, int num2);
}

// Calc의 구현체
//class MyCalc implements Calc {
//
//	@Override
//	public int add(int num1, int num2) {
//		return num1 + num2;
//	}
//	
//}