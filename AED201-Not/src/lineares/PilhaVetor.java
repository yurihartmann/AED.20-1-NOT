package lineares;

public class PilhaVetor<T> implements Pilha<T> {
	// quantidade de valores armazenados
	private int n;

	// vetor que armazena elementos
	private T[] vet;

	// construtores
	public PilhaVetor() {
		vet = (T[]) new Object[100];
	}

	public PilhaVetor(int tamanho) {
		vet = (T[]) new Object[tamanho];
	}


	// implementação dos métodos...
	
	@Override
	public void push(T v) throws Exception {
		if (n == vet.length) {
			throw new Exception("Pilha cheia");
		}
		vet[n] = v;
		n++;
	}

	@Override
	public T pop() throws Exception {
		if (this.vazia()) {
			throw new Exception("Pilha vazia");
		}
		T retorno = vet[n-1];
		vet[n-1] = null;
		n--;
		return retorno;
	}

	@Override
	public T peek() {
		if (this.vazia())
			return null;
		else
			return vet[n-1];
	}

	@Override
	public boolean vazia() {
		return (n==0);
	}

	@Override
	public void libera() {
		n=0;
		vet = (T[])new Object[vet.length];
	}


}
