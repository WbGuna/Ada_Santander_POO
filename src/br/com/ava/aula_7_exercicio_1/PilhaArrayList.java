package br.com.ava.aula_7_exercicio_1;

import java.util.ArrayList;

public class PilhaArrayList<T> extends Pilha<T> {

	private ArrayList<T> stack;

	public PilhaArrayList() {
	        stack = new ArrayList<>();
	    }

	@Override
	public void push(T item) {
		stack.add(item);
	}

	@Override
	public T pop() {
		if (stack.isEmpty()) {
			throw new RuntimeException("Pilha esta vazia");
		}
		return stack.remove(stack.size() - 1);
	}

	@Override
	public T peek() {
		if (stack.isEmpty()) {
			throw new RuntimeException("Pilha esta vazia");
		}
		return stack.get(stack.size() - 1);
	}
}
