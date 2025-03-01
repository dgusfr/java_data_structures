
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