package abstraction01;


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

        /* 
            쥐는 꼬리가 1개 라는 것을 각 객체가 일일이 할당 하는 것이 아니라,
            클래스 멤버 속성을 사용해 한번만 할당 할 수 있도록 한다.
            여기서 static 이 안 붙은 속성은 객체 멤버 속성이라고 한다.
            클래스 멤버 = static 멤버 = 정적 멤버
            객체 멤버 = 인스턴스 멤버

            - 정적 멤버들은 객체가 아닌 클래스에 속해 있으며,
              클래스는 JVM 구동 시 T 메모리의 스태틱 영역에 바로 배치되기 때문에 객체의 존재 여부에 관계없이 쓸 수 있다.
            - T 메모리의 스태틱 영역에 클래스가 배치될 때 객체 속성은 속석명만 있지 실제 메모리 공간 확보 X
              힙 영역에 객체가 생성된면 바로 그 때 각 객체안에 멤버 속성을 위한 메모리 공간이 할당된다.
        */ 
        System.out.println(mickey.countOfTail);

        mickey.sing();

        mickey = null;
        // mickey 변수에 null을 할당해 더 이상 힙 영역에 존재하는 Mouse 객체를 참조하지 않는다.
        // 그러면 가비지 컬렉터(Garbage Collector)가 아무도 참조해 주지 않는 Mouse 객체를 쓰레기로 인지하고 수거한다.

        Mouse jerry = new Mouse();

        jerry.name = "제리";
        jerry.age = 73;

        jerry.sing();
    }
}


/*
    지역변수 : 개발자가 별도로 초기화하지 않으면 쓰레기 값을 갖게 된다.
    객체 변수 : 하나의 객체 안에서 다수의 객체 메서드가 공유하는 변수.
    클래스 변수 : 전역 번수로서 프로그램 어디서든 접근 가능한 공유 변수.

 */