package CallByReference;

public class CallByReference02 {
    public static void main(String[] args) {
        Animal ref_a = new Animal();
        Animal ref_b = ref_a;

        System.out.println(ref_a); // reference.Animal@15db9742  -> 실핼할 때마다 다르다(주소 값)
        System.out.println(ref_b); // 바로 위와 같은 값이 출력된다.
    }
}


// ref_a 와 ref_b 는 완전히 다른 변수다.
// 다만 같은 값을 가지고 있고 컴퓨터는 그 값을 주소로서 활용한다.
// 결국 두 변수가 같은 객체를 참고하고 있을 뿐이다.


// Call By Value(기본 자료형 변수) : 저장하고 있는 값을 그 값 자체로 판단.
// Call By Reference(참조 변수)   : 저장하고 있는 값을 주소로 판단.