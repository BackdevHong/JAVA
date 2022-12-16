# 계산기 웹 프로그램 구현

한번 해봅시다.

## 객체 설계

- HttpRequest
    - RequestLine ( GET /calculate?operand1=11&operator=*&operand2=55 HTTP/1.1 )
        - HttpMethod
        - path
        - queryString
    - Header ( 크게 필요 없음 )
    - Body ( 필요 없음 )
- HttpResponse

## WAS란?
- 웹서버 + 웹 컨테이너
- 웹 서버 단독으로 처리 불가능한 DB 조회가 가능.
- 다양한 로직 처리가 칠요한 동적 컨텐츠를 제공.
- JSP, Servlet 구동 환경을 제공해줌.

## CGI란?
- Common Gateway Interface
- 웹 서버와 애플리케이션 사이에 데이터를 주고받는 구약.
- 이 규칙에 따라서 만들어진 프로그램을 CGI 프로그램이라고 함.
- CGI 프로그램 종류로는 크게 2가지가 있음
  - 컴파일 방식
    - C, C++, JAVA
  - 인터프리터 방식
    - PHP, Python
    
## Servlet이란?
- 자바에서 웹 애플리케이션을 만드는 기술
- 동적인 웹 페이지를 구현하기 위한 표준

## Servlet Container란?
- 서블릿의 생성 ~ 소멸까지의 라이프사이클을 관리하는 역할
- 서블릿 컨테이너는 웹 서버와 소켓을 만들고 통신하는 과정을 대신 해줌.
- 개발자는 비즈니스 로직에만 집중하면 됨.
- 서블릿 객체를 싱글톤으로 관리해야 함 (인스턴스 하나만 생성하여 공유하는 방식)
  - 상태를 유지(stateful)하게 설계하면 안됨
  - Thread safety 하지 않음.

## WAS vs Servlet Container
- WAS는 Servlet Container를 포함하는 개념임.
- WAS는 매 요청마다 스레드 풀에서 기존 스레드를 사용함.
- WAS의 주요 튜닝 포인트는 Max Thread 수
- 대표적인 WAS로는 Tomcat이 있다.
