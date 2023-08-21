package br.com.ava.aula_7_exercicio_1;

import java.util.Scanner;

@SuppressWarnings("resource")
class PilhaInterativa<T> extends PilhaArrayList<T> {

    public PilhaInterativa(T item) {
        super();
        Scanner scanner = new Scanner(System.in);
        if (item instanceof Heroi) {
            System.out.println("Qual é o nome do heroi?");
            String nome = scanner.nextLine();
            ((Heroi) item).setNome(nome);
            System.out.println("Qual é o poder do heroi?");
            String poder = scanner.nextLine();
            ((Heroi) item).setPoder(poder);
            push((T) item);
        } else if (item instanceof Vilao) {
            System.out.println("Qual é o nome do vilão?");
            String nome = scanner.nextLine();
            ((Vilao) item).setNome(nome);
            System.out.println("Qual é a habilidade do vilão?");
            String habilidade = scanner.nextLine();
            ((Vilao) item).setHabilidade(habilidade);
            push((T) item);
        }
    }
}
