package dev.GAS.datastructures.list;

/**
 * Implementação de lista encadeada dinâmica (Linked List).
 * @param <T> Tipo dos elementos armazenados.
 */
public class MyLinkedList<T> implements MyList<T> {

    // Classe interna Node
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    // Atributos da lista
    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * Construtor padrão - cria uma lista vazia.
     */
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // ==================== IMPLEMENTAÇÃO DOS MÉTODOS DA INTERFACE ====================

    @Override
    public void addFirst(T element) {
        // TODO: implementar
    }

    @Override
    public void addLast(T element) {
        // TODO: implementar
    }

    @Override
    public void insertAt(int index, T element) {
        // TODO: implementar
    }

    @Override
    public void addSorted(T element) {
        // TODO: implementar (para elementos que implementam Comparable)
    }

    @Override
    public T removeFirst() {
        // TODO: implementar
        return null;
    }

    @Override
    public T removeLast() {
        // TODO: implementar
        return null;
    }

    @Override
    public T removeAt(int index) {
        // TODO: implementar
        return null;
    }

    @Override
    public boolean remove(T element) {
        // TODO: implementar
        return false;
    }

    @Override
    public void clear() {
        // TODO: implementar
    }

    @Override
    public int find(T element) {
        // TODO: implementar
        return -1;
    }

    @Override
    public T get(int index) {
        // TODO: implementar
        return null;
    }

    @Override
    public T set(int index, T element) {
        // TODO: implementar
        return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
}