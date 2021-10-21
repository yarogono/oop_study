// 스프링 입문을 위한 자바 객체 지향의 원리와 이해 150 ~ 153p

package constructor01;

public class Driver {
    public static void main(String[] args) {

        // new 클래스명() => 열고 닫는 소괄호는 메서드를 의미, 클래스명()도 메서드이다.
        // 객체 생성자 메서드: 반환값이 없고 클래스명과 같은 이름을 가진 메서드를 객체를 생성하는 메서드 => 줄여서 생성자
        Animal noname = new Animal();
        noname.ShowName();          // null

        Animal pororo = new Animal("뽀로로");
        pororo.ShowName();          // "뽀로로"
    }
}


// - 개발자가 아무런 생성자도 만들지 않으면 자바는 인자가 없는 기본 생성자를 자동으로 만들어준다.
// - 인자가 있는 생성자를 하나라도 만든다면 자바는 기본 생성자를 만들어 주지 않는다.
