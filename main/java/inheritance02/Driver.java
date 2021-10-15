// 스프링 입문을 위한 자바 객체 지향의 원리와 이해 117 ~ 122p
// 인터페이스는 상속과는 다르게 쓰는 것이 유용하다
// 인터페이스 => be able to 형식
//  - 인터페이스 구현 클래스 is able to 인터페이스
// - 해석 구현 클래스는 인터페이스할 수 있다.
// - 예제 : 고래는 헤엄칠 수 있다.
// ex) Runnable, Comparable, Cloneable
// 상위 클래스는 물러줄 특성이 풍성할수록 좋고, 인터페이스는 구현을 강제할 메서드의 개수가 적을수록 좋다

// 상위 클래스가 풍성할 수록 좋은 이유 => LSP(리스코프 치환 원칙)
// 인터페이스에 메서드가 적을수록 좋은 이유 => ISP(인터페이스 분할 원칙)

// LSP 는 서브 타입은 언제나 자신의 가반 타입으로 교체할 수 있어야 한다.
// ISP 는 클라이언트는 자신이 사용하지 않는 메서드에 의존 관계를 맺으면 안 된다.
package inheritance02;

public class Driver {
    public static void main(String[] args) {
        Flyable bird1 = new Bat();
        bird1.fly();

        Flyable bird2 = new Sparrow();
        bird2.fly();

        Swimmable[] swim = new Swimmable[2];

        swim[0] = new Whale();
        swim[1] = new Penguin();


        for (Swimmable s : swim) {
            s.swim();
        }
    }
}
