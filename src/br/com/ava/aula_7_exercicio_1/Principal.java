package br.com.ava.aula_7_exercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PilhaArrayList<Object> pilha = new PilhaArrayList<>();
		boolean continuar = true;
		while (continuar) {
			System.out.println("\n\nEscolha uma opção:");
			System.out.println("1. Criar heroi");
			System.out.println("2. Criar vilão");
			System.out.println("3. Remover da pilha");
			System.out.println("4. Verificar topo da pilha");
			System.out.println("5. Imprimir lista");
			System.out.println("6. Sair");
			int escolha = scanner.nextInt();
			switch (escolha) {
			case 1:
				PilhaInterativa<Heroi> pilhaHeroi = new PilhaInterativa<>(new Heroi());
				Heroi heroi = pilhaHeroi.pop();
				pilha.push(heroi);
				break;
			case 2:
				PilhaInterativa<Vilao> pilhaVilao = new PilhaInterativa<>(new Vilao());
				Vilao vilao = pilhaVilao.pop();
				pilha.push(vilao);
				break;
			case 3:
				Object removido = pilha.pop();
				if (removido instanceof Heroi) {
					Heroi heroiRemovido = (Heroi) removido;
					System.out.println("Heroi removido da pilha: Poder " + heroiRemovido.getPoder() + ", Nome "
							+ heroiRemovido.getNome() + ", Tipo " + heroiRemovido.getTipo());
				} else if (removido instanceof Vilao) {
					Vilao vilaoRemovido = (Vilao) removido;
					System.out.println("Vilão removido da pilha: Habilidade " + vilaoRemovido.getHabilidade()
							+ ", Nome " + vilaoRemovido.getNome() + ", Tipo " + vilaoRemovido.getTipo());
				} else {
					System.out.println("Valor removido da pilha: " + removido);
				}
				break;
			case 4:
				Object topo = pilha.peek();
				if (topo instanceof Heroi) {
					Heroi heroiTopo = (Heroi) topo;
					System.out.println("Heroi no topo da pilha: Poder " + heroiTopo.getPoder() + ", Nome "
							+ heroiTopo.getNome() + ", Tipo " + heroiTopo.getTipo());
				} else if (topo instanceof Vilao) {
					Vilao vilaoTopo = (Vilao) topo;
					System.out.println("Vilão no topo da pilha: Habilidade " + vilaoTopo.getHabilidade() + ", Nome "
							+ vilaoTopo.getNome() + ", Tipo " + vilaoTopo.getTipo());
				} else {
					System.out.println("Valor no topo da pilha: " + topo);
				}
				break;
			case 5:
				ArrayList<Object> lista = new ArrayList<>();
				while (!pilha.isEmpty()) {
					Object obj = pilha.peek();
					lista.add(obj);
					if (obj instanceof Personagem) {
						Personagem personagem = (Personagem) obj;
						if (personagem instanceof Heroi) {
							Heroi heroiLista = (Heroi) personagem;
							System.out.println(heroiLista.getNome() + " - " + heroiLista.getTipo() + ": Poder "
									+ heroiLista.getPoder());
						} else if (personagem instanceof Vilao) {
							Vilao vilaoLista = (Vilao) personagem;
							System.out.println(vilaoLista.getNome() + " - " + vilaoLista.getTipo() + ": Habilidade "
									+ vilaoLista.getHabilidade());
						}
					} else {
						System.out.println(obj);
					}
					pilha.pop();
				}
				for (int i = lista.size() - 1; i >= 0; i--) {
					pilha.push(lista.get(i));
				}
				break;
			case 6:
				continuar = false;
				break;
			default:
				System.out.println("Opção inválida!");
			}
		}
	}
}
