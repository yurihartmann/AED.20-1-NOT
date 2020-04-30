package arvores;

public class ArvoreBinaria<T> {
    //Atributos
    NoArvoreBinaria<T> raiz = null;
    
    //Construtor
    public ArvoreBinaria() {
    }
    
    //Metodos
    
    public void setRaiz( NoArvoreBinaria<T> no )  {
        raiz = no;
    }
    
    public boolean vazia() {
        return raiz == null;
    }
    
    public NoArvoreBinaria<T> pertence(T info) {
    	if (this.vazia()) {
    		return null;
    	}
    	else {
    		return raiz.pertence( info );
    	}
    }
    
    @Override
    public String toString() {
    	if (this.vazia()) {
    		return "";
    	}
    	else {
    		return raiz.imprimePre();
    	}
    }
}
