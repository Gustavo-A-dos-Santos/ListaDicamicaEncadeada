MyLinkedList

Implementação de uma lista encadeada dinâmica em Java, utilizando nós (Node) para armazenar elementos de forma encadeada.
Simples. Direta. Sem maquiagem. Cada nó aponta para o próximo como quem sabe exatamente para onde vai.

Estrutura do Projeto
dev.GAS.datastructures.list
│
├── MyList.java
└── MyLinkedList.java
Sobre a Estrutura

A classe MyLinkedList<T> implementa uma lista encadeada genérica com operações básicas de inserção, remoção, busca e manipulação de elementos.

Ela utiliza:

head → primeiro nó da lista
tail → último nó da lista
size → quantidade de elementos

Cada elemento vive dentro de um Node<T>:

private static class Node<T> {
    T data;
    Node<T> next;
}
Funcionalidades
Inserção
Adicionar no início
addFirst(T element)

Insere um elemento no começo da lista.

Adicionar no final
addLast(T element)

Insere um elemento no fim da lista.

Inserir em posição específica
insertAt(int index, T element)

Insere um elemento em um índice específico.

Inserção ordenada
addSorted(T element)

Insere mantendo a ordem crescente.

O elemento deve implementar Comparable.

Remoção
Remover primeiro elemento
removeFirst()

Remove e retorna o primeiro elemento.

Remover último elemento
removeLast()

Remove e retorna o último elemento.

Remover por índice
removeAt(int index)

Remove o elemento de uma posição específica.

Remover por valor
remove(T element)

Remove a primeira ocorrência do elemento.

Busca e Manipulação
Buscar índice
find(T element)

Retorna o índice do elemento.

Caso não exista:

-1
Obter elemento
get(int index)

Retorna o elemento do índice informado.

Alterar elemento
set(int index, T element)

Substitui um elemento e retorna o valor antigo.

Controle da Lista
Tamanho
size()

Retorna a quantidade de elementos.

Verificar se está vazia
isEmpty()
Limpar lista
clear()

Remove todos os elementos.

Métodos Extras
Remove_nd
Remove_nd(int index)

Remove o elemento baseado na posição contando do final da lista.

Exemplo:

Lista: [10, 20, 30, 40]

Remove_nd(1) → remove 40
Remove_nd(2) → remove 30
Método em Desenvolvimento
reverse()
reverse()

Método iniciado para inverter a lista, mas ainda não implementado.

Porque até estruturas também precisam aprender a olhar para trás.

Exemplo de Uso
MyLinkedList<Integer> list = new MyLinkedList<>();

list.addLast(10);
list.addLast(20);
list.addFirst(5);

System.out.println(list.get(0)); // 5
System.out.println(list.get(1)); // 10
System.out.println(list.get(2)); // 20

list.remove(10);

System.out.println(list.find(20)); // 1
Complexidade
Operação	Complexidade
addFirst	O(1)
addLast	O(1)
insertAt	O(n)
removeFirst	O(1)
removeLast	O(n)
removeAt	O(n)
get	O(n)
find	O(n)
Observações
Estrutura genérica usando <T>
Suporte para valores null
Controle manual de ponteiros
Sem uso de estruturas prontas do Java para armazenamento principal
Autor

Desenvolvido por Gustavo Anthony dos Santos.
