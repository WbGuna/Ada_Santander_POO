package br.com.ava.aula_7_exercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> lista = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha o tipo de PilhaInterativa:");
            System.out.println("1. Integer");
            System.out.println("2. Double");
            System.out.println("3. String");
            System.out.println("4. Imprimir lista");
            System.out.println("5. Sair");
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    PilhaInterativa<Integer> pilha = new PilhaInterativa<>(0);
                    int valor = pilha.pop();
                    lista.add(valor);
                    break;
                case 2:
                    PilhaInterativa<Double> pilha2 = new PilhaInterativa<>(0.0);
                    double valor2 = pilha2.pop();
                    lista.add(valor2);
                    break;
                case 3:
                    PilhaInterativa<String> pilha3 = new PilhaInterativa<>("");
                    String valor3 = pilha3.pop();
                    lista.add(valor3);
                    break;
                case 4:
                    System.out.println(lista);
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
