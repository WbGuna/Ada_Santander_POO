package br.com.ava.aula_7_exercicio_1;


public class Principal {

	public static void main(String[] args) {
		Pilha<Integer> stack = new PilhaArrayList<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop()); // 3
		System.out.println(stack.peek()); // 2
		System.out.println(stack.pop()); // 2

	}

}
