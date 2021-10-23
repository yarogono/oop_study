package finalClass;

public class finalVariable {
    final static int 정적상수1 = 1;
    final static int 정적상수2;

    final int 객체상수1 = 1;
    final int 객체상수2;

    static {
        정적상수2 = 2;

        // 상수는 한 번 초기화되면 값을 변경할 수 없다.
        // 정적상수2 = 4;
    }

    finalVariable() {
        객체상수2 = 2;

        // 상수는 한 번 초기화되면 값을 변경할 수 없다.
        // 객체상수2 = 4;

        final int 지역상수1 = 1;
        final int 지역상수2;

        지역상수2 = 2;
    }
}


// - final => 변경 불가능한 상수
// - 정적 상수는 선언 시에, 또는 정적 생성자에 해당하는 static 블록 내부에서 초기화가 가능하다.
// - 객체 상수 역시 선언 시에, 또는 객체 생성자 또는 인스턴스 블록에서 초기화할 수 있다.
// - 지역 상수 역시 선언 시에, 또는 최초 한 번만 초기화가 가능하다.
