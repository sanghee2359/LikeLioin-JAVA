package com.liklion;

public class Stack01 {
    private int[] arr = new int[10000];
    private int top = 0;

    public Stack01() {  // stackTest에서 실행됨
    }

    public Stack01(int size){
        this.arr = new int[size];
    }
    public void push(int value) {
        // 10 arr[0]
        // 20 arr[1]
        arr[this.top] = value;
        this.top ++;
    }
    public int[] getArr(){
        return arr;
    }

    public int pop() {
        // push 10/ push20을 하면 point = 2를 가리킴. (this.pointer++)
        int value = arr[this.top-1]; // 현재의 pointer의 위치 값 담음
        this.top--;
        return value;
    }
}
