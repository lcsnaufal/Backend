package org.example;

public class Main {

    public static void main(String[] args) {

        String name;
        name = "Lucas";

        if (name == "Lucas") {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Olá " + name + ". Essa é a vez de número " + i + " que o programa passa por aqui");
            }
        } else {
            System.out.println("O nome " + name + " não é seu nome.");
        }
    }}