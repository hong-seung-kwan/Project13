package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//다음과 같이 쇼핑몰의 거래내역을 저장하는 클래스를 만드세요
//속성: 주문번호, 주문연도, 거래내역(만원단위)
//[orderNo=1001, year=2022, price=300]
//[orderNo=1002, year=2022, price=150]
//[orderNo=1003, year=2022, price=200]
//[orderNo=1004, year=2023, price=500]
//[orderNo=1005, year=2023, price=400]
//[orderNo=1006, year=2023, price=600]
//[orderNo=1007, year=2023, price=650]

// 모든 거래번호 한줄에 나열
// 2022년도 거래 총금액과 건수 출력
// 2023년도 거래 총금액과 건수 출력
public class Quiz3 {

	public static void main(String[] args) {

		// 리스트 생성
		List<Order> list = new ArrayList<>();

		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));

		// 스트림 생성
		// 모든 거래번호 한줄에
		Stream<Order> stream = list.stream();

		stream.forEach(o -> System.out.print(o.orderNo + " "));

		// filter : 조건을 만족하는 요소만 추출
		// mapToInt : Order객체 (object) -> Order의 price(int)
		// 기본형 스트림 -> 정수형 스트림
		// sum: 스트림 요소의 합 구하기

		int sum1 = list.stream().filter(o -> o.year == 2022).mapToInt(o -> o.price).sum();
		System.out.println();
		System.out.println("2022년도의 거래 총금액: " + sum1);

		// count : 스트림 요소의 개수 구하기 (거래건수)
		// count : int x long o

		long count = list.stream().filter(o -> o.year == 2022).count();
		System.out.println("2022년도의 거래건수: " + count);

		int sum2 = list.stream().filter(o -> o.year == 2023).mapToInt(o -> o.price).sum();
		System.out.println("2023년도의 거래 총금액: " + sum2);

		long count2 = list.stream().filter(o -> o.year == 2023).count();
		System.out.println("2023년도의 거래건수: " + count2);

	}

}

class Order {
	int orderNo;
	int year;
	int price;

	public Order(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", year=" + year + ", price=" + price + "]";
	}

}