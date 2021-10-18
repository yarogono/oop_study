public class MethodStackFrame {
    // 스프링 입문을 위한 자바 객체 지향의 원리와 이해 58 ~ 64p
    public static void main(String[] args) {
        int k = 5;
        int m;

        // 메서드를 호출하면서 인자로 전달되는 것은 변수 자체가 아니라, 변수가 저장한 값만을 복제해서 전달한다.
        // 이런 전달 방식을 값에 의한 전달이라고 해서 Call By Value(값에 의한 호출) 라고 한다.
        m = square(k);
    }

    private static int square(int k) {
        int result;

        //  Call By Value(값에 의한 호출)
        // main() 메서드가 가진 변수 k와 square() 메서드가 가진 변수 k가 이름나 같지 실제로는 별도의 변수 공간
        // square() 메서드 안의 k 변수에 무슨 짓을 해도 main() 메서드 안의 k 변수는 영향이 없다.
        k = 25;

        result = k;

        return result;
    }
}
