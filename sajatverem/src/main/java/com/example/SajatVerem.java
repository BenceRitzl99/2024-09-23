package com.example;

public class SajatVerem<T> {
    private T[] elemek;
    private int top;

    @SuppressWarnings("unchecked")
    public SajatVerem(int meret) {
        elemek = (T[]) new Object[meret];
        top = 0;
    }

    public void push(T elem) {
        elemek[top] = elem;
        top++;
    }

    public T pop() {
        top--;
        return elemek[top];
    }
}
