package dev.GAS.datastructures.list.tests;

import dev.GAS.datastructures.list.MyLinkedList;
import dev.GAS.datastructures.list.MyList;

public class MyLinkedListTests {

    public static void main(String[] args) {

        MyLinkedList<Integer> lista = new MyLinkedList<>();

        System.out.println("======================================");
        System.out.println("TESTES - MyLinkedList");
        System.out.println("======================================");

        // ==================== TESTE addFirst ====================

        System.out.println("\n[TESTE] addFirst()");
        lista.addFirst(30);
        lista.addFirst(20);
        lista.addFirst(10);

        imprimirLista(lista);

        // ==================== TESTE addLast ====================

        System.out.println("\n[TESTE] addLast()");
        lista.addLast(40);
        lista.addLast(50);

        imprimirLista(lista);

        // ==================== TESTE insertAt ====================

        System.out.println("\n[TESTE] insertAt()");
        lista.insertAt(2, 99);

        imprimirLista(lista);

        // ==================== TESTE addSorted ====================

        System.out.println("\n[TESTE] addSorted()");
        MyList<Integer> listaOrdenada = new MyLinkedList<>();

        listaOrdenada.addSorted(50);
        listaOrdenada.addSorted(10);
        listaOrdenada.addSorted(30);
        listaOrdenada.addSorted(20);
        listaOrdenada.addSorted(40);

        imprimirLista(listaOrdenada);

        // ==================== TESTE get ====================

        System.out.println("\n[TESTE] get()");
        System.out.println("Elemento índice 2: " + lista.get(2));

        // ==================== TESTE set ====================

        System.out.println("\n[TESTE] set()");
        Integer antigo = lista.set(2, 777);

        System.out.println("Valor antigo: " + antigo);

        imprimirLista(lista);

        // ==================== TESTE find ====================

        System.out.println("\n[TESTE] find()");
        System.out.println("Índice do elemento 40: " + lista.find(40));
        System.out.println("Índice do elemento 999: " + lista.find(999));

        // ==================== TESTE removeFirst ====================

        System.out.println("\n[TESTE] removeFirst()");
        System.out.println("Removido: " + lista.removeFirst());

        imprimirLista(lista);

        // ==================== TESTE removeLast ====================

        System.out.println("\n[TESTE] removeLast()");
        System.out.println("Removido: " + lista.removeLast());

        imprimirLista(lista);

        // ==================== TESTE removeAt ====================

        System.out.println("\n[TESTE] removeAt()");
        System.out.println("Removido índice 1: " + lista.removeAt(1));

        imprimirLista(lista);

        // ==================== TESTE remove(element) ====================

        System.out.println("\n[TESTE] remove(element)");
        System.out.println("Removeu 777? " + lista.remove(777));
        System.out.println("Removeu 999? " + lista.remove(999));

        imprimirLista(lista);

        // ==================== TESTE Reversed ====================
        System.out.println("\n[TESTE] Remove 5");
        lista.Remove_nd(3);
        imprimirLista(lista);
    }

    /**
     * Método auxiliar para imprimir a lista.
     */
    private static void imprimirLista(MyList<Integer> lista) {

        System.out.print("Lista: [ ");

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));

            if (i < lista.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(" ]");
    }
}