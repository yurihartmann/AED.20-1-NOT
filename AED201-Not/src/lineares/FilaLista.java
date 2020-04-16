package lineares;

public class FilaLista<T> implements Fila<T> {
	private ItemLista<T> ini;
	private ItemLista<T> fim;
	// implementação dos métodos

	@Override
	public void insere(T v) throws Exception {
		ItemLista<T> novo = new ItemLista<T>();
		novo.setInfo(v);
		if (vazia()) {
			ini = novo;
		} else {
			fim.setProx(novo);
		}
		fim = novo;
	}

	@Override
	public T retira() throws Exception {
		if (vazia()) {
			throw new RuntimeException("Fila vazia");
		}

		T info = ini.getInfo();
		ini = ini.getProx();

		if (vazia()) {
			fim = null;
		}

		return info;
	}

	@Override
	public boolean vazia() {
		return (ini == null);
	}

	@Override
	public void libera() {
		ini = null;
		fim = null;
	}

}
