package lambda;

public class Quiz2 {

	public static void main(String[] args) {
		// helloPrint 함수를 사용해서 "안녕하세요"를 출력
		// 1. 구현클래스 > 인스턴스 생성
		// 2. 익명클래스
		//3. 람다식함수
		// 추천 1=>3 또는 2=>3
		
		
		// 익명 클래스
//		Hello hello = new Hello() {
//			
//			@Override
//			public void helloPrint() {
//				System.out.println("안녕하세요");
//				
//			}
//		};
		//hello.helloPrint();
		
		// 람다식
		// 부모 타입 변수 = 람다식 함수
		Hello hello2 = () -> System.out.println("안녕하세요");
		hello2.helloPrint();
		
		
		// 구현
		// 부모타입변수 = 자식 인스턴스
		Hello hello = new Hellos();
		hello.helloPrint();
	}

}

@FunctionalInterface
interface Hello{
	// "안녕하세요"를 출력하는 함수
	void helloPrint();
}
// 구현
class Hellos implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요");
		
	}
	
	
}