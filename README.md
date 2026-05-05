# MyLinkedList - Lista Dinâmica Encadeada

Implementação de uma **Lista Dinâmica Encadeada (Linked List)** genérica em Java, seguindo os princípios de TAD (Tipo Abstrato de Dados).

## 📋 Funcionalidades Implementadas

- `addFirst(T element)`
- `addLast(T element)`
- `insertAt(int index, T element)`
- `addSorted(T element)` (para elementos `Comparable`)
- `removeFirst()`
- `removeLast()`
- `removeAt(int index)`
- `remove(T element)`
- `clear()`
- `find(T element)`
- `get(int index)`
- `set(int index, T element)`
- `size()` e `isEmpty()`

## 🛠️ Tecnologias
- Java 17+
- Paradigma Orientado a Objetos
- Generics

## 📂 Estrutura de Pacotes

- `dev.aluno.datastructures.list` → Classes principais
- `dev.aluno.datastructures.list.tests` → Classe de testes

## ▶️ Como Executar

### Compilação manual:
```bash
# Navegue até a pasta src
cd src

# Compilar
javac dev/aluno/datastructures/list/*.java dev/aluno/datastructures/list/tests/*.java

# Executar testes
java dev.aluno.datastructures.list.tests.MyLinkedListTests
