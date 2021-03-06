<스프링 입문을 위한 자바 객체 지향의 원리와 이해 196 ~ 197p>

# 객체 지향 세계와 SOLID


## SoC

- 관심사의 분리(Separation Of Concerns)의 머리글자다.
- 관심이 같은 것끼리는 하나의 객체 안으로 또는 친한 객체로 모으고,  
  관심이 다른 것은 가능한 한 따로 떨어져 서로 영향을 가능한 한 따로 떨어져 서로 영향을 주지 않도록 분리하는 것.

## SOLID

- SRP(단일 책임 원칙): 어떤 클래스를 변경해야 하는 이유는 오직 하나뿐이어야 한다.
- OCP(개방 폐쇄 원칙): 자신의 확장에는 열려 있고, 주변의 변화에 대해서는 닫혀 있는 것이다.
- LSP(리스코프 치환 원칙): 서브 타입은 언제나 자신의 기반 타입으로 교체할 수 있어야 한다.
- ISP(인터페이스 분리 원칙): 클라이언트는 자신이 사용하지 않는 메서드에 의존 관계를 맺으면 안 된다.
- DIP(의존 역전 원칙): 자신보다 변하기 쉬운 것에 의존하지 마라.


## 객체 지향은 현실 세계를 모델링 한다

- 객체 지향세계는 현실 세계 같아야 한다는 것.
- 모델링을 통해 추상화됐다는 것.