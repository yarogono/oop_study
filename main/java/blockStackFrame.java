public class blockStackFrame {
    // 스프링 입문을 위한 자바 객체 지향의 원리와 이해 50 ~ 55p
    public static void main(String[] args) {
        int i = 10;
        int k = 20;

        // 참(true)인 if문 스택 프레임 생성
        // main() 메서드의 스택 프레임 안에 if 문의 블록 스택 프레임이 중첩되어 생성
        if (i == 10) {
            int m = k + 5;
                k = m;
        // 위 if문을 닫는 중괄호를 만나면 if 블록 스택 프레임은 스택 영역에서 사라진다.
        // 이 때 if 블록 스택 프레임 안에 상주하던 변수의 저장 공간도 함께 사라진다.
        } else {
            int p = k + 10;
                k = p;
        }

        // k = m + p;
        // 위 코드 실행 시 에러 발생 : 지역변수
    }
}
