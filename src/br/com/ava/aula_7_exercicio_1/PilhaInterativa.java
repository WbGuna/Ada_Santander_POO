package br.com.ava.aula_7_exercicio_1;

import java.util.Scanner;

class PilhaInterativa<T> extends PilhaArrayList<T> {
    public PilhaInterativa(T item) {
        super();
        Scanner scanner = new Scanner(System.in);
        if (item instanceof String) {
            System.out.println("Qual é o seu nome?");
            String nome = scanner.nextLine();
            push((T) nome);
        } else if (item instanceof Integer) {
            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
            push((T) Integer.valueOf(idade));
        } else if (item instanceof Double) {
            System.out.println("Qual o seu salário?");
            double salario = scanner.nextDouble();
            push((T) Double.valueOf(salario));
        }
    }
}
