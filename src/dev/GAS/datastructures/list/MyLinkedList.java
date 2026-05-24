package dev.GAS.datastructures.list;

import java.util.ArrayList;
import java.util.List;

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
        Node<T> newNode = new Node<>(element, head);
        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    @Override
    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    @Override
    public void insertAt(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        if (index == 0) {
            addFirst(element);
            return;
        }

        if (index == size) {
            addLast(element);
            return;
        }

        Node<T> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        Node<T> newNode = new Node<>(element, current.next);
        current.next = newNode;

        size++;
    }

    @Override
    public void addSorted(T element) {
        if (!(element instanceof Comparable)) {
            throw new IllegalArgumentException("Elemento deve implementar Comparable");
        }

        Comparable<T> comparable = (Comparable<T>) element;

        if (isEmpty() || comparable.compareTo(head.data) <= 0) {
            addFirst(element);
            return;
        }

        Node<T> current = head;

        while (current.next != null &&
                comparable.compareTo(current.next.data) > 0) {
            current = current.next;
        }

        Node<T> newNode = new Node<>(element, current.next);
        current.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }

        size++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }

        T removed = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;

        return removed;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            return null;
        }

        if (size == 1) {
            return removeFirst();
        }

        Node<T> current = head;

        while (current.next != tail) {
            current = current.next;
        }

        T removed = tail.data;
        tail = current;
        tail.next = null;

        size--;

        return removed;
    }

    @Override
    public T removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == size - 1) {
            return removeLast();
        }

        Node<T> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        T removed = current.next.data;
        current.next = current.next.next;

        size--;

        return removed;
    }

    @Override
    public boolean remove(T element) {
        if (isEmpty()) {
            return false;
        }

        if ((head.data == null && element == null) ||
                (head.data != null && head.data.equals(element))) {
            removeFirst();
            return true;
        }

        Node<T> current = head;

        while (current.next != null) {
            if ((current.next.data == null && element == null) ||
                    (current.next.data != null && current.next.data.equals(element))) {

                if (current.next == tail) {
                    tail = current;
                }

                current.next = current.next.next;
                size--;

                return true;
            }

            current = current.next;
        }

        return false;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int find(T element) {
        Node<T> current = head;
        int index = 0;

        while (current != null) {
            if ((current.data == null && element == null) ||
                    (current.data != null && current.data.equals(element))) {
                return index;
            }

            current = current.next;
            index++;
        }

        return -1;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        T oldValue = current.data;
        current.data = element;

        return oldValue;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    public void reverse() {
        Node<T> current = head;


    }

    public void Remove_nd(int index) {
        Node<T> current = head;
        List<T> list = new ArrayList<>();

        while (current != null) {
            list.add(current.data);
            current=current.next;
        }

        remove(list.get(list.size() - index));
    }
}
