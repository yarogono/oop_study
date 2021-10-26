// 스프링 입문을 위한 자바 객체 지향의 원리와 이해 178 ~ 183p

package SRP;

public class 강아지01 {
    final static Boolean 수컷 = true;
    final static Boolean 암컷 = false;
    Boolean 성별;

    void 소변보다() {
        if(this.성별 == 수컷) {
            // 한쪽 다리를 들고 소변을 본다.
        } else {
            // 뒷다리 두 개를 굽혀 앉은 자세로 소변을 본다.
        }
    }
}
