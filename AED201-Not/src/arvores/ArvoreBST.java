package arvores;

public class ArvoreBST<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

	public void inserir(T info) {
		if (this.vazia()) {
			this.setRaiz(new NoArvoreBST<T>(info));
		} else {
			((NoArvoreBST<T>) this.getRaiz()).inserir(info);
		}
	}

	public NoArvoreBST<T> buscar(T info) {
		if (this.vazia()) {
			return null;
		}
		return ((NoArvoreBST<T>) this.getRaiz()).buscar(info);
	}

	public void retirar(T info) {
		NoArvoreBST<T> aRetirar = this.buscar(info);
		if (aRetirar != null) {
			this.retirar(aRetirar);
		}
	}

	private void retirar(NoArvoreBST<T> aRetirar) {
		if (aRetirar == this.getRaiz()) {
			if (aRetirar.getEsq() == null && aRetirar.getDir() == null) { // é nó folha
				this.setRaiz(null);
			}
			else {
				if (aRetirar.getEsq() == null || aRetirar.getDir() == null) { // tem 1 filho
					if (aRetirar.getEsq() != null) { // filho está à esquerda
						this.setRaiz(aRetirar.getEsq());
					}
					else { // filho está à direita
						this.setRaiz(aRetirar.getDir());
					}
				} 
				else {// tem 2 filhos
					NoArvoreBST<T> sucessor = this.sucessor(aRetirar);
					T infoSucessor = sucessor.getInfo();
					this.retirar(sucessor);
					this.getRaiz().setInfo(infoSucessor);
				}
			}
		}
		else {  // aRetirar não é raiz
			//NoArvoreBST<T> pai = this.buscaPai(aRetirar);
		}
	}

	private NoArvoreBST<T> sucessor(NoArvoreBST<T> aRetirar) {
        NoArvoreBST<T> sucessor = (NoArvoreBST<T>)aRetirar.getDir();
        while (sucessor.getEsq() != null) {
            sucessor = (NoArvoreBST<T>)sucessor.getEsq();
        }
        return sucessor;
	}
	
	
}
