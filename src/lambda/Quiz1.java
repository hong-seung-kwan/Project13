package lambda;

public class Quiz1 {

	public static void main(String[] args) {
		
		// max 함수를 사용하여 5와 10 중 더 큰값을 구하세요
//		MyMax myMax = new MyMax();
//		System.out.println(myMax.max(5, 10));
		
//		익명클래스		
//		MyNumber myNumber = new MyNumber() {
//			
//			@Override
//			public int max(int x, int y) {
//				if(x>y) {
//					return x;
//				}else {
//					return y;
//				}			
//			}
//		};
		//람다식 함수
		MyNumber myNumber2 = (x, y) -> {
			if(x>y) {
				return x;
			}else {
				return y;
			}			
		};
		System.out.println(myNumber2.max(5, 10));
	}

}

@FunctionalInterface
interface MyNumber {
	int max(int x, int y);
}

//class MyMax implements MyNumber {
//
//	@Override
//	public int max(int x, int y) {
//		if(x>y) {
//		return x;	
//		}else {
//			return y;
//		}
//		
//	}
//	
//
//	
//}