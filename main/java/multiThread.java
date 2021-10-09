/* 멀티 스레드의 T 메모리 모델은 스택 영역을 스레드 개수만큼 분할해서 쓰는 것이다.
   - 하나의 T 메모리만 사용하는데, 스택 영역만 분할해서 사용하는 구조다.
   - 하나의 T 메모리 안에서 스택 영역만 분할한 것이기 때문에 하나의 스레드에서 다른 스레드의 스택 영역에는 접근할 수 없지만
     스태틱 영역과 힙 영역은 공유해서 사용하는 구조다 => 멀티 프로세스 대비 메모리를 적게 사용할 수 있는 구조다.
*/

/* 멀티 프로세스는 다수의 데이터 저장 영역, 즉 다수의 T 메모리를 갖는 구조다.
 - 각 프로세스 마다 각자의 T 메모리가 있고 각자 고유의 공간이므로 서로 참조할 수 없다.
 - 하나의 프로세스가 다른 프로세스의 T 메모리 영역을 절대 침벌할 수 없는 메모리 안전한 구조이지만 메모리 사용량이 그만큼 크다.
*/
public class multiThread extends Thread {
    static int share;

    public static void main(String[] args) {
        multiThread t1 = new multiThread();
        multiThread t2 = new multiThread();

        t1.start();
        t2.start();
    }

    public void run() {
        for (int count = 0; count < 10; count++) {
            System.out.println(share++);

            try { sleep(1000); }
            catch (InterruptedException e) { }
        }
    }
}
