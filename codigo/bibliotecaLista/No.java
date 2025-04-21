package bibliotecaLista;


public class No<T>{
    private T valor;
    private No proximo;

    public No(T v) {
        this.valor = v;
        this.proximo = null;
    }

    public T getValor() {
        return this.valor;
    }

    public No getProximo() {
        return this.proximo;
    }

    public void setProximo(No n) {
        this.proximo = n;
    }
}