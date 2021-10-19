// 스프링 입문을 위한 자바 객체 지향의 원리와 이해 141 ~ 143p

//객체 참조 변수는 저장하고 있는 값을 주소로 해석한다.
package CallByReference;

public class CallByReference01 {
    public static void main(String[] args) {
        Animal ref_a = new Animal();
        // 이 부분에서 ref_a의 주소값을 ref_b에 할당 한 것이다.
        Animal ref_b = ref_a;

        // ref_a, ref_b 의 주소에 10을 할당
        ref_a.age = 10;

        // ref_a, ref_b 의 주소에 20을 할당
        ref_b.age = 20;


        // ref_a, ref_b는 같은 주소 값을 가지고 있기 때문에 최종적으로 ref_b.age = 20 을 할당한 값이 출력된다.
        System.out.println(ref_a.age); // 20
        System.out.println(ref_b.age); // 20
    }

}

class Animal {
    public int age;
}
