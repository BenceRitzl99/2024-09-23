package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Saját verem");
        SajatVerem<Integer> verem = new SajatVerem<>(10);
        verem.push(1);
        verem.push(2);
        verem.push(3);
        verem.push(4);
        System.out.println(verem.pop());
        System.out.println(verem.pop());
        System.out.println(verem.pop());
        System.out.println(verem.pop());
        
    }
}