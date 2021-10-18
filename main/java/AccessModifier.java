// 스프링 입문을 위한 자바 객체 지향의 원리와 이해 135 ~ 140p

public class AccessModifier {
    
    public class ClassA {
        
        // private - 본인만 접근 가능
        private int pri;
        
        // default - 같은 패키지 내의 클래스에서 접근 가능
        int def;
        
        // protected - 상속 / 같은 패키지 내의 클래스에서 접근 가능
        protected int pro;
        
        // public 모두가 접근 가능
        public int pub;
        
        void runSomething() {
            
        }
        
        static void runStaticThing() {
            
        }
    }
}

/* # 상속을 받지 않았다면 객체 멤버는 객체를 생성한 후 객체 참조 변수를 이용해 접급해야 한다.
  - 정적 멤버는 클래스명.정적멤버 형식으로 접근하는 것을 권장한다.
  - 일관된 형식으로 접근하기 위해서

  # 이유는?
   - 사람 클래스의 인구
   - 고양이의 다리 개수

   위의 예시처럼 사람.인구, 고양이,다리개수 형식으로 접근하는 것이
   홍길동.인구수, 키티.다리개수 형식으로 접근 하느 것보다 논리적으로 맞다.
   결국 객체참조변수명.정적멤버 형식보다는 클래스명.정적멤버 형식으로 접근해야 한다.
*/
