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