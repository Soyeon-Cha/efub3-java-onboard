# 자바 핵심 개념 정리
<details>
<summary>Java에서 제공하는 원시 타입들에 무엇이 있고, 각각 몇 바이트를 차지하나요?</summary>
<div markdown="1">
boolean 1바이트, char 2바이트, byte 1바이트, short 2바이트, int 4바이트, long 8바이트, float 4바이트, double 8바이트
</div>
</details>
<br>

<details>
<summary>오버라이딩(OverRiding)과 오버로딩(OverLoading)에 대해 설명해주세요.</summary>
<div markdown="1">
슈퍼 클래스의 메소드를 동일한 이름으로 서브 클래스마다 다르게 구현하는 것을 오버라이딩이라고 한다. 한 클래스 내에서 두 개 이상의 이름이 같은 메소드를 작성하는 것을 오버로딩이라 한다. 오버로딩 한 메소드들은 이름은 같지만 매개 변수의 개수와 타입이 다르다.
</div>
</details>
<br>

<details>
<summary>객체지향 프로그래밍(OOP)에 대해 설명해주세요</summary>
<div markdown="1">
객체지향 프로그래밍은 객체들을 설정하고 그 객체 간의 상호 관계를 모델링하여 프로그래밍하는 것이다. 캡슐화, 상속, 다형성 등의 개념을 이용한다.
</div>
</details>
<br>

<details>
<summary>추상 클래스와 인터페이스에 대해 설명해주시고, 차이에 대해 설명해주세요.</summary>
<div markdown="1">
추상 클래스는 상속을 위한 슈퍼 클래스로 이용하기 위한 장치로 abstract로 선언한 클래스이다. 인터페이스는 구현할 클래스가 가져야 하는 규격을 표현하는 기능이고 클래스를 선언할 때처럼 interface를 앞에 써준다. 추상 클래스는 구현할 때 extends를 사용하고, 인터페이스는 implements를 사용한다. 인터페이스는 추상 클래스와 달리 필드를 만들 수 없다.
</div>
</details>
<br>

<details>
<summary>가비지 컬렉션(gc)란 무엇일까요?</summary>
<div markdown="1">
가비지는 할당받은 객체 또는 배열 메모리 중에서 더 이상 사용하지 않는 메모리 즉, 참조하는 레퍼런스가 하나도 없어 더이상 접근할 수 없는 객체 또는 배열이다. 가비지 컬렉션은 이러한 가비지를 자바 가상 기계가 알아서 회수하는 것이다.
</div>
</details>
<br>

<details>
<summary>JVM의 동작 방식에 대해 설명해 주세요.</summary>
<div markdown="1">
JVM은 인터프리터 방식으로 바이트 코드를 한 명령씩 해석하고 실행한다. JVM은 플랫폼 종속적이어서 플랫폼마다 다르지만 자바 프로그램에게 어디서든 동일한 환경을 제공한다.
</div>
</details>
<br>

<details>
<summary>불변 객체란 무엇이고, final은 무엇일까요? 사용하는 이유와 함께 설명해주세요.</summary>
<div markdown="1">
불변 객체는 객체 생성 이후 객체 내부의 상태가 변하지 않는 객체이다. final이 클래스 앞에 사용되면 클래스를 상속 받을 수 없음을 나타내고, 메소드 앞에 사용되면 오버라이딩 할 수 없음을 나타내고, 필드 앞에 사용되면 한 번 초기화된 상수 값이 이후에 변경될 수 없음을 나타낸다. 불변 객체와 final은 참조를 통해 값이나 상태가 바뀌었을 때 혼동이 발생하는 것을 막기 위해 사용된다.
</div>
</details>
<br>

<details>
<summary>자바의 메모리 영역에 대해 설명해주세요.</summary>
<div markdown="1">
자바의 메모리 영역은 메소드 영역, 힙 영역, 스택 영역으로 구분된다. 메소드 영역에는 코드가 저장되고, 힙 영역에는 객체가 저장되고, 스택 영역에는 메소드를 호출할 때마다 생성되는 프레임이 저장된다.
</div>
</details>
<br>

<details>
<summary>new String()과 리터럴(" ")의 차이에 대해 설명해주세요.</summary>
<div markdown="1">
new String()로는 문자열 객체를 생성할 수 있고 이 값은 메모리의 heap 영역에 할당된다. 반면, 리터럴로 생성된 문자열은 상수풀에 할당된다. new String()은 같은 내용을 가지는 문자열을 만들더라도 각각의 객체가 생성된다.
</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 람다(lambda)에 대해 알아볼까요?</summary>
<div markdown="1">
람다식은 익명함수로, 일반적인 함수처럼 따로 선언하고 호출해서 실행시키는 것이 아니라 코드 한 줄에 함수를 쓰고 바로 호출해서 실행하는 함수이다.
</div>
</details>
<br>

<details>
<summary>⭐️ 추가 과제: 스트림(stream)에 대해 알아볼까요?</summary>
<div markdown="1">
스트림은 컬렉션에 저장된 엘리먼트들을 하나씩 순회하면서 처리하도록 할 때 사용하는 기능이다. 스트림을생성한 후 컬렉션 안의 데이터를 처리해서 어떤 값을 리턴하는 코드를 작성하고, 값을 이용해 결과를 나타내는 과정으로 스트림을 이용하면 된다.
</div>
</details>
<br>

