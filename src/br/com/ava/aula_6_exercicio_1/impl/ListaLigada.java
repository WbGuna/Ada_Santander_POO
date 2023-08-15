package br.com.ava.aula_6_exercicio_1.impl;

import br.com.ava.aula_6_exercicio_1.contrato.Lista;

public class ListaLigada extends Lista {

	private int size;
	private Elemento primeiro;
	private Elemento ultimo;

	@Override
	public void add(Object obj) {
		Elemento primeiro = new Elemento(obj);
		if (size == 0) {
			this.primeiro = primeiro;
			this.ultimo = primeiro;
			size++;
		} else {
			Elemento novoElemento = new Elemento(obj);
			this.ultimo.setProximo(novoElemento);

			this.ultimo = novoElemento;
			size++;
		}
	}

	@Override
	public Object get(int idx) {
		Elemento elemento = this.primeiro;
		for (int i = 0; i < idx; i++) {
			elemento = elemento.getProximo();
		}
		return elemento.getObj();
	}

	@Override
	public int size() {
		return size;
	}

	class Elemento {
        private Object obj;
        private Elemento proximo;

        public Elemento(Object obj) {
            this.obj = obj;
        }

        public Object getObj() {
            return obj;
        }

        public Elemento getProximo() {
            return proximo;
        }

        public void setProximo(Elemento proximo) {
            this.proximo = proximo;
        }
    }

	@Override
	public void remove(int idx) {
		if (idx < 0 || idx >= size) {
			throw new IndexOutOfBoundsException("Posição inexistente");
		}
		if (idx == 0) {
			primeiro = primeiro.getProximo();
		} else {
			Elemento anterior = primeiro;
			for (int i = 0; i < idx - 1; i++) {
				anterior = anterior.getProximo();
			}
			anterior.setProximo(anterior.getProximo().getProximo());
			if (idx == size - 1) {
				ultimo = anterior;
			}
		}
		size--;		
	}
}