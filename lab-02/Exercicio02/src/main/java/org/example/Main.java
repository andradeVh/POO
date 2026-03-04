package org.example;

import java.util.Random;

public class Main {
    static void main() {
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(100);
        int palpite;


        do {
            palpite = Integer.parseInt(IO.readln("Insira seu palpite: "));
            if (palpite > numeroAleatorio) {
                IO.println("O seu palpite é maior que o valor");
            } else {
                IO.println("O seu palpite é menor que o valor");
            }
        } while (palpite != numeroAleatorio);
        IO.println("Parabéns, você acertou!");
    }
}

