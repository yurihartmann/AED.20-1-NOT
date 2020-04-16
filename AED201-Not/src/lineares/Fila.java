package lineares;

public interface Fila<T> {
	void insere(T v) throws Exception;
	T retira() throws Exception;
	boolean vazia();
	void libera();
}
