package stream.quiz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

// 여행사 고객 Customer 클래스 만들기
// 속성 : 이름 나이 여행비용
// 고객 리스트: (둘리, 40, 여행비용 100)), (또치, 13 ,50), (도우너,25,70) )

// 고객명단 => 둘리 또치 도우너
// 총 여행 비용 => 220
// 20세 이상의 고객 명단 => 둘리 도우너
// 나이 순 정렬
public class Quiz4 {

	public static void main(String[] args) {
		
		List<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));
		
		Stream<Customer> stream = list.stream();
		
		stream.forEach(c -> System.out.print(c.name + " "));
		
		int sum = list.stream().mapToInt(c -> c.price).sum();
		System.out.println();
		System.out.println("총 여행 비용: " + sum);
		
		list.stream().filter(c -> c.age >= 20).forEach(c -> System.out.print(c.name + " "));
		System.out.println();
		// sorted: 정렬
		// 스트림 안에 있는 요소는 인스턴스로 값을 정렬할 수 없다
		// 4-1
		list.stream().sorted(new Comparator<Customer>() {
			// 두 수를 비교하여 순서를 결정
			// 반환값: 양수 또는 음수
			@Override
			public int compare(Customer o1, Customer o2) {
				// 고객의 나이를 비교하여 양수 또는 음수를 반환
				if(o1.age > o2.age) {
					return -1; // o1의 age가 더 크면 o2를 뒤로
				} else {
					return 1; // 그렇지 않으면 o1을 뒤로 이동
				}
			}
			
		})
		.forEach(c -> System.out.print(c.name+" "+c.age+ " "));
		System.out.println();
		
		// 4-2
		list.stream()
        .sorted(Comparator.comparingInt(Customer::getAge).reversed()). // 나이 순으로 정렬
        forEach(c -> System.out.print(c.getName() + " "+ c.age+ " "));
		
		
//		public int compare((o1, o2) -> {
//			// 고객의 나이를 비교하여 양수 또는 음수를 반환
//			if(o1.age > o2.age) {
//				return -1; // o1의 age가 더 크면 o2를 뒤로
//			} else {
//				return 1; // 그렇지 않으면 o1을 뒤로 이동
//			}
//		}
//		
//	})
//	.forEach(c -> System.out.print(c.name+" "+c.age+ " "));
		
		
	}

}

class Customer {
	String name;
	int age;
	int price;
	public Customer(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
	
}