package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("비밀번호를 초기화한다.")
    @Test
    void passwordTest() {
        User user = new User();

        user.initPassword(() -> "abcdefgh");

        assertThat(user.getPassword()).isNotNull();
    }
    
    @DisplayName("비밀번호가 요구사항에 부합하지 않아 초기화 된다.")
    @Test
    void passwordTest2() {
        User user = new User();

        user.initPassword(() -> "abcd");

        assertThat(user.getPassword()).isNull();
    }
}