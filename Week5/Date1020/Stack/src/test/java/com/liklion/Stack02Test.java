package com.liklion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Stack02Test {
    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }
    @Test
    @DisplayName("push가 잘 되는지")
    void push(){
        Stack02 st =new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        Assertions.assertEquals(20, arr[1]);
        Assertions.assertEquals(10, arr[0]);
    }

    @Test
    void pushAndPop(){
        Stack02 st =new Stack02();
        st.push(10);
        st.push(20);

        Assertions.assertEquals(20, st.pop());
        Assertions.assertEquals(10, st.pop());
//        st.pop() 비어있을 땐 pop이 안되도록 isEmpty
    }
}
