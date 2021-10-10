package abstract01;


// 모든 클래스들(Mouse, MouseDriver)이 T 메모리의 스태틱 영역에 배치된다.
// 여기서 Mouse 클래스의 세 개의 속성(name, age, countOfTail)은 클래스에 속한 속성이 아닌 Mouse 객체에 속한 속성이다.
// * 그래서 T 메모리의 스태틱 영역에 있는 Mouse 클래스에는 변수 저장 공간이 안보이고 그저 이름만 존재할 뿐이다.
public class MouseDriver {
    public static void main(String[] args) {
        // 객체가 생성돼야만 속성의 값을 저장하기 위한 메모리 공간이 스태틱 영역이 아닌 힙 영역에 할당된다.
        Mouse mickey = new Mouse();

        // Mouse mickey => Mouse 객체에 대한 참조 변수 mickey 를 만든다.
        // new Mouse()  => Mouse 클래스의 인스턴스를 하나 만들어 힙에 배치한다.
        // 대입문        => Mouse 객체에 대한 주소(포인터)를 참조 변수 mickey에 할당한다.
        // - new Mouse() 는 객체 생성자를 호출하는 구문이다. 생성된 객체는 T 메모리의 힙 영역에 배치된다.
        // - 여기서 변수 mickey 는 Mouse 객체의 주소(포인터)를 갖고 main() 스택 프레임에 배치된다.
        // * 힙은 대용량 자료를 저장할 수 있도록 메모리를 사용하는 방식이다.

        mickey.name = "미키";
        mickey.age = 85;
        mickey.countOfTail = 1;

        mickey.sing();

        mickey = null;
        // mickey 변수에 null을 할당해 더 이상 힙 영역에 존재하는 Mouse 객체를 참조하지 않는다.
        // 그러면 가비지 컬렉터(Garbage Collector)가 아무도 참조해 주지 않는 Mouse 객체를 쓰레기로 인지하고 수거한다.

        Mouse jerry = new Mouse();

        jerry.name = "제리";
        jerry.age = 73;
        jerry.countOfTail = 1;

        jerry.sing();
    }
}
