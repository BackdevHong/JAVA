package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RequestLineTest {

    @DisplayName("requestLine이 제대로 되었는지 확인")
    @Test
    void create() {
        RequestLine requestLine = new RequestLine("GET /calculate?operand1=11&operator=*&operand2=55 HTTP/1.1");

        assertThat(requestLine).isEqualTo(new RequestLine("GET",
                "/calculate",
                "operand1=11&operator=*&operand2=55"));
    }
}
