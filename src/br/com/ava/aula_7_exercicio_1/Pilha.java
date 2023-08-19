package br.com.ava.aula_7_exercicio_1;

abstract class Pilha<T> {
	
    public abstract void push(T item);

    public abstract T pop();

    public abstract T peek();
}
