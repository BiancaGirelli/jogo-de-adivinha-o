package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta = (int) Math.round(Math.random()*10);
        int tentativa;


        System.out.println("#############################");
        System.out.println("##   Jogo da Adivinhação   ##");
        System.out.println("#############################");
        System.out.println();
        System.out.println("Regras do jogo!");
        System.out.println("1- Vou pensar em um número");
        System.out.println("2- Você tenta adivinhar qual número estou pensando");
        System.out.println("3- Te informo se acertou ou não");
        System.out.println("Está pronto para jogar? (s/n)");
        pronto = leitura.next();


        switch(pronto){
            case "s":
                jogo_for();

               break;
            case "n":
                System.out.println("Até mais, então.");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }


    public static void jogo_for() {

        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta = (int) Math.round(Math.random() * 10);
        int tentativa;

        for(int i=0;i<10;i++) {
            System.out.println("Qual número entre 0 e 10 estou pensando?");
            tentativa = leitura.nextInt();
            if (tentativa == resposta) {
                System.out.println("✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
                System.out.println("Parabéns, você acertou! você não é tão besta assim😃👍 ;D");
                System.out.println("✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔");
            } else {
                System.out.println("❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌");
                System.out.println("Que pena, você errou! tem mais azar que eu nos 50/50😱😱😭");
                System.out.println("A resposta era " + resposta);
                System.out.println("❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌❌");
            }

            resposta = (int) Math.round(Math.random() * 10);
        }

    }
}