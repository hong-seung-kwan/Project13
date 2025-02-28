package lambda;

public class Quiz3 {

	public static void main(String[] args) {
		// convert 함수를 이용하여 "Hello, World!"를 대문자로 변환
		
		
		// 익명 클래스
		StringConverter converter = new StringConverter() {
			
			@Override
			public String convert(String str) {
				return str.toUpperCase();
			}
		};
		System.out.println(converter.convert("Hello, World"));
		
		// 람다식
		StringConverter converter2 = str -> str.toUpperCase();
		System.out.println(converter2.convert("Hello, World"));
	}

}

@FunctionalInterface
interface StringConverter {
	// 문자열을 대문자로 변환하여 반환하는 함수
	String convert(String str);
}