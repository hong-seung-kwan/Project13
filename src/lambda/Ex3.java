package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		
		// 문자열 리스트 생성
		// List는 ArrayList의 부모이므로 타입으로 사용 가능
		List<String> list = new ArrayList<String>();
		
		list.add("aa");
		list.add("cc");
		list.add("bb");

		// sort: 리스트 순서대로 정렬
		// 인자: 리스트, Comparator (함수형 인터페이스)
		// 함수형 인터페이스는 람다식 함수로 구현할 수 있다
		// 인터페이스는 인스턴스 생성 불가
		
		
		// 매개변수가 함수형 인터페이스 일때는 람다식 함수로 대체
		Collections.sort(list, (o1,o2) -> o1.compareTo(o2));
		
		
//		Collections.sort(list, new Comparator<String>() {
//			// 리스트 안에 문자열을 비교해서 정렬하는 함수
//			@Override
//			public int compare(String o1, String o2) {
//				// String 클래스의 compareTo 함수: 두 문자열을 비교해서 숫자로 반환
//				return o1.compareTo(o2);			
//			}});
		System.out.println(list);
		
		
		
//		System.out.println("aa".compareTo("bb")); // -1
//		System.out.println("aa".compareTo("cc")); // =2
//		System.out.println("aa".compareTo("aa")); // 0
//		System.out.println("cc".compareTo("aa")); // 2
	}

}
