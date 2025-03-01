# Estrutura de dados em Java

# **Sumário**

- [1. Estrutura de Dados em Java](#1-estrutura-de-dados-em-java)
- [2. Arrays](#arrays)
  - [2.1. Motivação](#1-motivação)
  - [2.2. Declaração e Instanciação](#2-declaração-e-instanciação)
  - [2.3. Acessando Elementos](#3-acessando-elementos)
  - [2.4. Populando e Percorrendo Arrays](#4-populando-e-percorrendo-arrays)
    - [2.4.1. For Tradicional](#41-for-tradicional)
    - [2.4.2. Propriedade `length`](#42-propriedade-length)
    - [2.4.3. Enhanced `for` (Java 5+)](#43-enhanced-for-java-5)
  - [2.5. Arrays de Tipos Primitivos vs. Arrays de Objetos](#5-arrays-de-tipos-primitivos-vs-arrays-de-objetos)
    - [2.5.1. Arrays de Tipos Primitivos](#51-arrays-de-tipos-primitivos)
    - [2.5.2. Arrays de Objetos (Referências)](#52-arrays-de-objetos-referências)
  - [2.6. Arrays com Herança](#6-arrays-com-herança)
  - [2.7. Tamanho Fixo e Redimensionamento](#7-tamanho-fixo-e-redimensionamento)

- [3. Memória em Arrays de Java](#3-memória-em-arrays-de-java)
  - [3.1. Stack e Heap](#31-stack-e-heap)
  - [3.2. Organização da Memória](#32-organização-da-memória)
  - [3.3. Exemplo Visual](#33-exemplo-visual)

- [4. Boxing, Unboxing e Wrapper Classes em Java](#4-boxing-unboxing-e-wrapper-classes-em-java)
  - [4.1. Introdução](#41-introdução)
  - [4.2. Boxing](#42-boxing)
  - [4.3. Unboxing](#43-unboxing)
  - [4.4. Wrapper Classes](#44-wrapper-classes)
  - [4.5. Exemplo Prático com Boxing e Unboxing](#45-exemplo-prático-com-boxing-e-unboxing)
  - [4.6. Uso Prático em Sistemas de Informação](#46-uso-prático-em-sistemas-de-informação)
  - [4.7. Resumo](#47-resumo)

- [5. Laço `for each`](#5-laço-for-each)
  - [5.1. Introdução](#51-introdução)
  - [5.2. Sintaxe](#52-sintaxe)
  - [5.3. Diferença entre `for` tradicional e `for each`](#53-diferença-entre-for-tradicional-e-for-each)
  - [5.4. Exemplos Práticos](#54-exemplos-práticos)
  - [5.5. Quando usar o `for each`](#55-quando-usar-o-for-each)
  - [5.6. Limitações](#56-limitações)
  - [5.7. Conclusão](#57-conclusão)

- [6. Listas em Java](#6-listas-em-java)
  - [6.1. Conceito de Lista](#61-conceito-de-lista)
    - [6.1.1. Vantagens](#611-vantagens)
    - [6.1.2. Desvantagens](#612-desvantagens)
  - [6.2. Interface `List` e Implementações](#62-interface-list-e-implementações)
  - [6.3. Operações Básicas com Listas](#63-operações-básicas-com-listas)
    - [6.3.1. Inserir Elementos: `add()`](#631-inserir-elementos-add)
    - [6.3.2. Obter Tamanho: `size()`](#632-obter-tamanho-size)
    - [6.3.3. Acessar Elementos: `get(position)`](#633-acessar-elementos-getposition)
    - [6.3.4. Percorrer a Lista](#634-percorrer-a-lista)
    - [6.3.5. Remover Elementos: `remove()` e `removeIf()`](#635-remover-elementos-remove-e-removeif)
    - [6.3.6. Encontrar Posições: `indexOf()` e `lastIndexOf()`](#636-encontrar-posições-indexof-e-lastindexof)
  - [6.4. Trabalhando com Streams e Filtros](#64-trabalhando-com-streams-e-filtros)
    - [6.4.1. Filtrar Elementos com `stream()` e `filter()`](#641-filtrar-elementos-com-stream-e-filter)
    - [6.4.2. Encontrar Primeira Ocorrência com `findFirst()`](#642-encontrar-primeira-ocorrência-com-findfirst)
  - [6.5. Código Completo com Demonstração](#65-código-completo-com-demonstracao)
  - [6.6. Vantagens e Desvantagens das Listas](#66-vantagens-e-desvantagens-das-listas)
  - [6.7. Conclusão](#67-conclusão)

- [7. Matrizes em Java](#7-matrizes-em-java)
  - [7.1. O que é uma Matriz?](#71-o-que-é-uma-matriz)
    - [7.1.1. Características](#711-características)
    - [7.1.2. Exemplo Visual](#712-exemplo-visual)
  - [7.2. Declaração e Instanciação de Matrizes em Java](#72-declaração-e-instanciação-de-matrizes-em-java)
  - [7.3. Acesso aos Elementos](#73-acesso-aos-elementos)
  - [7.4. Como Percorrer uma Matriz](#74-como-percorrer-uma-matriz)
  - [7.5. Propriedade `length`](#75-propriedade-length)
  - [7.6. Exemplo Completo](#76-exemplo-completo)
  - [7.7. Vantagens e Desvantagens das Matrizes](#77-vantagens-e-desvantagens-das-matrizes)
  - [7.8. Quando usar Matrizes?](#78-quando-usar-matrizes)

---



<br>
<br>
<br>

---



# **Matrizes em Java**

## **1. O que é uma Matriz?**

Em programação, uma **matriz** é uma **estrutura de dados bidimensional** (também conhecida como "vetor de vetores"). Ela é usada para armazenar informações em formato de **tabela**, com **linhas** e **colunas**.

### **Características de uma matriz:**
- **Homogênea:** Todos os elementos são do mesmo tipo.  
- **Ordenada:** Os elementos são organizados e acessados através de índices.  
- **Acesso rápido:** É possível acessar diretamente qualquer elemento informando sua posição.  
- **Alocação contígua:** Toda a matriz é alocada em um bloco contínuo de memória.  

### **Exemplo visual de matriz (3 linhas x 4 colunas):**

|     | 0    | 1    | 2    | 3    |
|-----|------|------|------|------|
| 0   | 3.5  | 17.0 | 12.3 | 8.2  |
| 1   | 4.1  | 6.2  | 7.5  | 2.9  |
| 2   | 11.0 | 9.5  | 14.8 | 21.7 |

Para acessar o valor `7.5`, utilizamos o índice da linha e da coluna: `matriz[1][2]`.

---

<br>

## **2. Declaração e Instanciação de Matrizes em Java**

Para utilizar matrizes em Java, é necessário **declarar** e **instanciar** a matriz.

### **Sintaxe geral:**
```java
tipo[][] nomeDaMatriz = new tipo[numLinhas][numColunas];
```

- **tipo:** Tipo dos elementos da matriz (ex.: `int`, `double`, `String`).  
- **nomeDaMatriz:** Nome dado à matriz.  
- **numLinhas:** Quantidade de linhas.  
- **numColunas:** Quantidade de colunas.  

### **Exemplo com números `double`:**
```java
double[][] matriz = new double[3][4];  // Cria uma matriz com 3 linhas e 4 colunas
```

No momento da criação:
- Tipos numéricos (`int`, `double`) são inicializados com `0` ou `0.0`.  
- Tipos `boolean` são inicializados com `false`.  
- Tipos referência (ex.: `String`) são inicializados com `null`.  

---

<br>

## **3. Acesso aos Elementos**

Para acessar ou atribuir valores em uma matriz, utiliza-se **dois índices**:  

```java
matriz[linha][coluna]
```

### **Exemplo de atribuição:**
```java
matriz[0][0] = 3.5;
matriz[1][2] = 7.5;
```

### **Exemplo de leitura:**
```java
System.out.println(matriz[1][2]);  // Exibe: 7.5
```

---

<br>

## **4. Como Percorrer uma Matriz**

Para percorrer uma matriz e acessar todos os elementos, geralmente utilizamos **laços `for` aninhados**:

- **Laço externo:** Percorre as **linhas**.  
- **Laço interno:** Percorre as **colunas**.  

### **Exemplo de percorrimento:**
```java
for (int i = 0; i < matriz.length; i++) {  // Percorre as linhas
    for (int j = 0; j < matriz[i].length; j++) {  // Percorre as colunas
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();  // Quebra de linha para formatação
}
```

---

## **5. Propriedade `length`**

Em Java, a matriz possui a propriedade `length` para identificar:
- **Número de linhas:** `matriz.length`  
- **Número de colunas em uma linha:** `matriz[i].length`  

### **Exemplo:**
```java
System.out.println("Linhas: " + matriz.length);           // Número de linhas
System.out.println("Colunas na primeira linha: " + matriz[0].length);  // Número de colunas
```

---

<br>

## **6. Exemplo Completo**

```java
package application;

public class MatrizesDemo {
    public static void main(String[] args) {
        double[][] matriz = new double[3][4];

        // Preenchendo a matriz com valores
        matriz[0][0] = 3.5;  matriz[0][1] = 17.0;  matriz[0][2] = 12.3;  matriz[0][3] = 8.2;
        matriz[1][0] = 4.1;  matriz[1][1] = 6.2;   matriz[1][2] = 7.5;   matriz[1][3] = 2.9;
        matriz[2][0] = 11.0; matriz[2][1] = 9.5;   matriz[2][2] = 14.8;  matriz[2][3] = 21.7;

        // Exibindo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
```

### **Saída esperada:**
```
3.5	17.0	12.3	8.2	
4.1	6.2	7.5	2.9	
11.0	9.5	14.8	21.7	
```

---

<br>

## **7. Vantagens e Desvantagens das Matrizes**

### **Vantagens:**
- **Acesso rápido:** Permite acesso direto e eficiente aos elementos pela posição.  
- **Organização:** Ideal para representar tabelas, grades e matrizes matemáticas.  

### **Desvantagens:**
- **Tamanho fixo:** O tamanho deve ser definido no momento da criação.  
- **Dificuldade de inserção/remoção:** Inserir ou remover elementos exige recriar a matriz.  
- **Uso de memória:** Matrizes muito grandes podem consumir muita memória.  

---

## **8. Quando usar matrizes?**

Use matrizes quando:  
- Precisa representar dados em **formato de tabela** (ex.: notas de alunos, mapas de jogos).  
- Precisa de **acesso rápido** aos dados por posição.  
- Os dados possuem **dimensão fixa** e conhecida previamente.  

---