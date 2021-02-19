package com.tyq.firstblood;

import com.alibaba.testable.core.annotation.MockMethod;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FirstbloodApplicationTests {

    @Test
    void contextLoads() {
        assertEquals("sub_string","aa".substring(1,1));

    }

    @MockMethod(targetClass = String.class)
    private String substring(int i, int j) {
        return "sub_string";
    }

}
