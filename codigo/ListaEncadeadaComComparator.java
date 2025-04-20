import java.util.Comparator;

class ListaEncadeadaComComparator<T> {
    private No<T> inicio, fim;
    private int quantidadeElementos;
    private final boolean ordenada;
    private Comparator<T> comparador;

    ListaEncadeadaComComparator(boolean ehOrdenada, Comparator<T> comp) {
        this.inicio = this.fim = null;
        this.quantidadeElementos = 0;
        this.ordenada = ehOrdenada;
        this.comparador = comp;
    }

    void inserirElemento(T elemento) {
        //se a lista foi criada como ordenada entao o metodo de inserir ordenadamente eh chamado
        if(this.ordenada) {
            inserirElementoOrdenadamente(elemento);
        }
        
        //se a lista nao foi criada entao o metodo de inserir de forma sequencial eh chamado
        else{
            inserirElementoSequencialmente(elemento);
        }

        //incrementa a quantidade de elementos da lista
        this.quantidadeElementos++;

    }

    private void inserirElementoSequencialmente(T elemento) {
        No<T> novo = new No<T> (elemento);

        if(this.inicio == null) {
            this.inicio = this.fim = novo;
        }

        else{
            this.fim.setProximo(novo);
            this.fim = novo;
        }
    }

    private void inserirElementoOrdenadamente(T elemento) {
        No<T> novo = new No<T> (elemento); //cria um No passando o novo elemento
        No<T> atual, anterior;
        
        atual = this.inicio; //comeca pelo inicio da lista
        anterior = null; //anterior eh null

        //se o inicio eh null entao o No recem criado eh o primeiro da lista
        if(this.inicio == null) {
            this.inicio = this.fim = novo;
        }

        else{
            //enquanto nao for o fim da lista e o atual for um elemento menor que o novo elemento vai buscando o proximo
            //a ordem do condicional faz diferenca aqui pois pode-se tentar acessar um metodo de um objeto null
            while(atual != null && this.comparador.compare(atual.getValor(), elemento) < 0) {
                anterior = atual; //o anterior passa a ser o atual
                atual = atual.getProximo(); //e o atual passa a ser o proximo
            }

            //se o anterior for null, entao o novo elemento eh o menor da lista
            if(anterior == null) {
                novo.setProximo(this.inicio); //o proximo sera o antigo o primeiro elemento
                this.inicio = novo; //e o novo No sera o primeiro elemento da lista
            }

            //se o atual for null, entao o novo elemento eh o maior da lista
            else if(atual == null) {
                this.fim.setProximo(novo); //o antigo elemento aponta para o novo No
                this.fim = novo; //e o novo No sera o ultimo
            }

            //por fim, se as condicoes anteriores forem falsas, coloca-se o novo No na posicao adequada (entre o anterior
            //e o atual)
            else{
                anterior.setProximo(novo); //o anterior aponta para o novo No 
                novo.setProximo(atual); //e o novo no aponta para o atual
            }
        }
    }

    boolean contemElemento(T elemento) {
        No<T> auxiliar = this.inicio;

        while(auxiliar != null) {
            if(auxiliar.getValor().equals(elemento)) {
                return true;
            }

            auxiliar = auxiliar.getProximo();
        }

        return false;
    }

    boolean ExcluirElemento(T elemento) {
        No<T> auxiliar = this.inicio;
        No<T> anterior = null;

        //o loop vai ate o fim da lista
        while(auxiliar != null) {
            //verifica se encontrou o elemento
            if(auxiliar.getValor().equals(elemento)) {
                //verifica se o elemnto a ser excluido eh o primeiro da lista
                if(auxiliar == this.inicio) {
                    //se for, o proximo elemento inicial sera o proximo do antigo primeiro elemento
                    this.inicio = this.inicio.getProximo();

                    //verifica tambem se o elemento eh o ultimo da lista (ou seja, o unico)
                    if(auxiliar == this.fim) {
                        this.fim = null;
                    }
                }

                //se o elemento a ser excluido nao for o primeiro...
                else{
                    //o elemnto seguinte ao anterior sera o seguinte do elemento a ser excluido
                    anterior.setProximo(auxiliar.getProximo());

                    //verifica se o elemnto a ser excluido eh o ultimo...
                    if(auxiliar == this.fim) {
                        //se for, o novo ultimo elemento sera o anterior
                        this.fim = anterior;
                    }
                }

                //decrementa a quantidade de elementos da lista
                this.quantidadeElementos--;

                //retorna true porque a exclusao foi bem sucedida
                return true;
            }

            //se nao achou o auxiliar, o anterior vira o auxiliar e o auxiliar vira o elemento seguinte a ele
            anterior = auxiliar;
            auxiliar = auxiliar.getProximo();
        }

        //se chegou aqui eh porque o elemento nao esta na lista, retornando false
        return false;
    }

    public String toString() {
        No aux = this.inicio;
        String s = "[";

        while (aux != null) {
            s += aux.getValor();
            
            if(aux != this.fim) {
                s += ";";
            }

            aux  = aux.getProximo();
            
        }

        return s + "]";
    }


}