package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

// 포커스 이벤트 등록
// area안으로 마우스가 들어오거나 창을 열면 "포커스가 되었습니다" 출력
// 창을 닫으면 "포커스가 벗어났습니다" 출력

public class Quiz2 {

	public static void main(String[] args) {

		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);

		// 텍스트 상자
		TextArea area = new TextArea("텍스트상자", 10, 50);
		frame.add(area);

		frame.setVisible(true);

		// 함수의 매개변수: FocusListener(인터페이스)
		// 인터페이스는 인스턴스 생성 불가
		// FocusListener의 구현 클래스로 인스턴스를 생성해서 입력
//		area.addFocusListener(new MyFocusListener());

//		익명 클래스를 만드는 방법:
		// new 부모 인터페이스의 이름 () {}
		// 부모한테 물려받은 추상메소드 재정의
		area.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("포커스가 벗어났습니다");

			}

			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("포커스가 되었습니다");

			}
		});

	}

}

// FocusListener의 구현체
// 부모가 물려준 모든 추상 메소드를 재정의
//class MyFocusListener implements FocusListener {
//
//	@Override
//	public void focusGained(FocusEvent e) {
//		System.out.println("포커스가 되었습니다");
//		
//	}
//
//	@Override
//	public void focusLost(FocusEvent e) {
//		System.out.println("포커스가 벗어났습니다");
//		
//	}
//	
//}