# **Sumário Interativo**

- [Listas em Java](#listas-em-java)
  - [1. Conceito de Lista](#1-conceito-de-lista)
  - [2. Interface `List` e Implementações](#2-interface-list-e-implementações)
  - [3. Operações Básicas com Listas](#3-operações-básicas-com-listas)
    - [3.1 Inserir elementos na lista: `add()`](#31-inserir-elementos-na-lista-add)
    - [3.2 Obter o tamanho da lista: `size()`](#32-obter-o-tamanho-da-lista-size)
    - [3.3 Acessar elementos: `get(position)`](#33-acessar-elementos-getposition)
    - [3.4 Percorrer a lista](#34-percorrer-a-lista)
    - [3.5 Remover elementos da lista](#35-remover-elementos-da-lista)
    - [3.6 Encontrar posições de elementos](#36-encontrar-posições-de-elementos)
  - [4. Trabalhando com Streams e Filtros](#4-trabalhando-com-streams-e-filtros)
    - [4.1 Filtrar elementos com `stream()` e `filter()`](#41-filtrar-elementos-com-stream-e-filter)
    - [4.2 Encontrar a primeira ocorrência com `findFirst()`](#42-encontrar-a-primeira-ocorrência-com-findfirst)
  - [5. Código Completo com Demonstração](#5-código-completo-com-demonstração)
  - [6. Vantagens e Desvantagens das Listas](#6-vantagens-e-desvantagens-das-listas)
  - [7. Conclusão](#7-conclusão)

---

# **Listas em Java**

## **1. Conceito de Lista**

Uma **lista** é uma estrutura de dados que armazena uma coleção de elementos de forma ordenada. Cada elemento ocupa uma posição específica, acessada por índices iniciando em `0`.

### **Características das listas:**
- **Homogênea:** Armazena dados do mesmo tipo.  
- **Ordenada:** Os elementos são mantidos em ordem de inserção e podem ser acessados por posições (índices).  

### **Vantagens**
- **Tamanho variável:** Diferente de arrays, o tamanho pode crescer ou diminuir conforme necessário.  
- **Alocação sob demanda:** Começa vazia e aloca espaço conforme elementos são adicionados.  
- **Facilidade de inserção e remoção:** Inserir ou remover elementos é mais simples em comparação a arrays.  

---

## **2. Interface `List` e Implementações**

Em Java, a **interface `List`** define o comportamento das listas.  
Não é possível instanciar o tipo List, por isso utilizamos classes que implementam a interface List, como:

- **`ArrayList`**: Melhor desempenho para acesso direto e leitura rápida.  
- **`LinkedList`**: Melhor para inserções e remoções frequentes em qualquer posição.  

---

## **3. Operações Básicas com Listas**

### **3.1 Inserir elementos na lista: `add()`**

```java
List<String> list = new ArrayList<>();
list.add("Maria");  // Adiciona no final da lista
list.add("Alex");
list.add("Bob");
list.add(2, "Marco");  // Insere "Marco" na posição 2 (empurrando os demais para frente)
```

**Resultado da lista:**  
```
[Maria, Alex, Marco, Bob]
```

---

### **3.2 Obter o tamanho da lista: `size()`**

```java
System.out.println("Tamanho da lista: " + list.size());
```

**Saída:**  
```
Tamanho da lista: 4
```

---

### **3.3 Acessar elementos: `get(position)`**

```java
System.out.println("Elemento na posição 2: " + list.get(2));  // Retorna "Marco"
```

---

### **3.4 Percorrer a lista**

#### **Com `for` tradicional:**
```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

#### **Com `for each`:**
```java
for (String nome : list) {
    System.out.println(nome);
}
```

**Saída:**  
```
Maria
Alex
Marco
Bob
```

---

### **3.5 Remover elementos da lista**

- **Remover por objeto:**  
```java
list.remove("Bob");  // Remove a primeira ocorrência de "Bob"
```

- **Remover por posição:**  
```java
list.remove(1);  // Remove o elemento na posição 1
```

- **Remover com condição (`removeIf`) usando lambda:**  
```java
list.removeIf(nome -> nome.charAt(0) == 'M');  // Remove nomes que começam com 'M'
```

**Lista após remoção condicional:**  
```
[Alex, Bob]
```

---

### **3.6 Encontrar posições de elementos**

```java
System.out.println("Index de Bob: " + list.indexOf("Bob"));  // Retorna 1
System.out.println("Index de Marco: " + list.indexOf("Marco"));  // Retorna -1 (não encontrado)
```

---

## **4. Trabalhando com Streams e Filtros**

### **4.1 Filtrar elementos com `stream()` e `filter()`**

```java
List<String> result = list.stream()
                          .filter(nome -> nome.charAt(0) == 'A')
                          .collect(Collectors.toList());
```

- Cria uma nova lista apenas com elementos que começam com a letra "A".

**Saída:**  
```
Alex
```

---

### **4.2 Encontrar a primeira ocorrência com `findFirst()`**

```java
String nome = list.stream()
                  .filter(x -> x.charAt(0) == 'J')
                  .findFirst()
                  .orElse(null);

System.out.println(nome);  // Retorna null, se não encontrado
```

---

## **5. Código Completo com Demonstração**

```java
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println("Tamanho da lista: " + list.size());
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M');  // Remove nomes que começam com 'M'
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        System.out.println("Index de Bob: " + list.indexOf("Bob"));
        System.out.println("Index de Marco: " + list.indexOf("Marco"));

        System.out.println("---------------------");
        List<String> result = list.stream()
                                  .filter(x -> x.charAt(0) == 'A')
                                  .collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        String nome = list.stream()
                          .filter(x -> x.charAt(0) == 'J')
                          .findFirst()
                          .orElse(null);
        System.out.println(nome);  // Retorna null se não encontrar
    }
}
```

---

## **6. Vantagens e Desvantagens das Listas**

### **Vantagens:**
- **Tamanho dinâmico:** Cresce ou diminui conforme necessário.
- **Facilidade de inserção e remoção:** Métodos como `add()`, `remove()` tornam a manipulação simples.
- **Integração com Streams:** Permite uso de funções de alto nível como `filter()`, `map()`, etc.

### **Desvantagens:**
- **Acesso sequencial:** Algumas implementações como `LinkedList` têm acesso mais lento por índice.
- **Consumo de memória:** Maior do que arrays simples.

---

## **7. Conclusão**

- O tipo `List` em Java é fundamental para armazenar e manipular coleções de dados de forma ordenada e flexível.  
- O uso de métodos como `add()`, `remove()`, `size()`, e recursos como **Streams** e **lambda expressions** permite manipulações poderosas e eficientes.  
- **Escolha a implementação certa:**  
  - Use **`ArrayList`** quando precisar de acesso rápido e leituras frequentes.  
  - Use **`LinkedList`** quando inserções e remoções forem mais frequentes.

---
