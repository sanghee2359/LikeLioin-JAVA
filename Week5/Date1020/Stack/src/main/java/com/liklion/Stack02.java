package com.liklion;

public class Stack02 {
    private Integer arr[];
    private int top = 0;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public void push(int value) {
        //10 넣으면 arr[0] = 10
        this.arr[this.top++] = value;
    }

    public Integer[] getArr() {
        return arr;
    }

    public int pop() {  // this.top = 2 Integer은 참조형이라서 null로 초기화가 된다
        return this.arr[--this.top];
    }
}
