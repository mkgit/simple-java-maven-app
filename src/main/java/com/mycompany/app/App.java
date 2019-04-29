package com.mycompany.app;

// Hello world example
public class App
{
    private final String message = "This is a new world!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }
}
