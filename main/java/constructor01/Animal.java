package constructor01;

public class Animal {
    String name;

    // 동물 클래스에 아무런 메서드도 없는 것처럼 보이지만, 클래스는 아무런 인자도 갖지 않는 기본 생성자 메서드를 만들어준다.
    public Animal() {
    }

    // 인자가 있는 생성자
    public Animal(String name) {
        this.name = name;
    }

    void ShowName() {
        System.out.println(name);
    }
}
