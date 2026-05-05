package dev.GAS.datastructures.list;

/**
 * Interface genérica que define o contrato para uma Lista Dinâmica.
 * @param <T> Tipo dos elementos armazenados na lista.
 */
public interface MyList<T> {
    /**
     * Insere o elemento no início da lista.
     */
    void addFirst(T element);
    /**
     * Insere o elemento no final da lista.
     */
    void addLast(T element);

    /**
     * Insere o elemento na posição especificada.
     * @param index posição onde o elemento será inserido (0 <= index <= size)
     */
    void insertAt(int index, T element);

    /**
     * Insere o elemento mantendo a lista ordenada (requer elementos comparáveis).
     */
    void addSorted(T element);

    // ==================== OPERAÇÕES DE REMOÇÃO ====================

    /**
     * Remove e retorna o primeiro elemento da lista.
     */
    T removeFirst();

    /**
     * Remove e retorna o último elemento da lista.
     */
    T removeLast();

    /**
     * Remove o elemento na posição especificada.
     */
    T removeAt(int index);

    /**
     * Remove a primeira ocorrência do elemento especificado.
     * @return true se o elemento foi removido
     */
    boolean remove(T element);
    /**
     * Remove todos os elementos da lista.
     */
    void clear();
    /**
     * Retorna a primeira ocorrência do elemento ou -1 se não encontrado.
     */
    int find(T element);

    /**
     * Retorna o elemento na posição especificada.
     */
    T get(int index);

    /**
     * Substitui o elemento na posição especificada e retorna o valor antigo.
     */
    T set(int index, T element);

    /**
     * Retorna a quantidade de elementos na lista.
     */
    int size();
    /**
     * Verifica se a lista está vazia.
     */
    boolean isEmpty();
}