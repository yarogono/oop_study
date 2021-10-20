// 스프링 입문을 위한 자바 객체 지향의 원리와 이해 146 ~ 150p

package abstractMethod01;


// 추상 메서드를 간단하게 설명하면?
// 선언부는 있는데 구현부가 없는 메서드를 말한다.
// - 추상 메서드를 하나라도 갖고 있는 클래스는 반드시 추상 클래스 (Abstract Class)로 선언해야 한다.
// - 물론 추상 메서드 없이도 추상 클래스를 선언 할 수 있지만,
//   자바에서는 하나 이상의 추상 메서드를 포함하는 클래스를 추상 클래스라고 한다.
public class Driver {
    public static void main(String[] args) {
        Animal[] Animals = new Animal[2];

        Animals[0] = new Rat();
        Animals[1] = new Chicken();

        for (int i = 0; i < Animals.length; i++) {
            Animals[i].Crying();
        }

        // 아래와 같은 방식으로 실행하면 Animal is abstract; cannot be instantiated 라는 에러 발생
        // Animal 짐승 = new Animal();

        // 추상 클래스는 인스턴스, 즉 객체를 만들 수 없는 클래스가 된다.
    }
}

// - 추상 클래스는 인스턴스, 즉 객체를 만들 수 없다. 즉, new를 사용할 수 없다.
// - 추상 메서드는 하위 클래스에게 메서드의 구현을 강제한다. 오버라이딩 강제
// - 추상 메서드를 포함하는 클래스는 반드시 추상 클래스여야 한다.