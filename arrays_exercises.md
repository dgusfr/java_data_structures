Segue abaixo o texto reestruturado de forma mais objetiva e didática, mantendo os tópicos e o conteúdo essencial sobre **arrays** em Java:

---

## Arrays

“**O homem esquecerá antes a morte do pai que a perda da propriedade**.”  
Maquiavel

### **Objetivos do capítulo**
- Declarar e instanciar **arrays**  
- Popular e percorrer **arrays**  

---

### **5.1 – O problema inicial**

Quando precisamos armazenar diversas variáveis do mesmo tipo, em vez de criá-las uma a uma:

```java
int idade1;
int idade2;
int idade3;
int idade4;
```

Podemos declarar um **array**:

```java
int[] idades;  // tipo int[]
idades = new int[10]; // array de 10 posições
```

Agora podemos acessar cada posição pelo **índice**, que vai de 0 até `n-1`, onde `n` é o tamanho do array. Por exemplo:

```java
idades[5] = 10; // altera a 6ª posição do array
```

Se tentarmos acessar uma posição fora desse intervalo, ocorrerá um erro de execução (out of bounds).

---

### **5.2 – Arrays de referências**

Quando criamos um **array de objetos**, estamos na verdade criando um array de **referências** (endereços) para objetos. Por exemplo:

```java
Conta[] minhasContas;
minhasContas = new Conta[10];
```

Isso cria 10 espaços para referências a `Conta`, mas **nenhuma Conta é criada** ainda. Se tentarmos acessar `minhasContas[0].saldo` antes de instanciar uma conta, teremos erro em tempo de execução. Precisamos primeiro popular o array:

```java
minhasContas[0] = new Conta();
minhasContas[0].saldo = 1000.0;
```

Ao usar um **array de tipos primitivos**, guardamos valores. Em um **array de objetos**, guardamos apenas as referências.

---

### **5.3 – Percorrendo uma array**

Para percorrer um array, usamos um `for` clássico:

```java
int[] idades = new int[10];
for (int i = 0; i < idades.length; i++) {
    idades[i] = i * 10;
}
for (int i = 0; i < idades.length; i++) {
    System.out.println(idades[i]);
}
```

Note que usamos `idades.length` para descobrir o **tamanho** do array em tempo de execução. Isso é útil quando recebemos um array como parâmetro em um método:

```java
void imprimeArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }
}
```

Também é importante lembrar que os arrays **não mudam de tamanho** após serem criados. Se precisarmos de mais espaço, devemos criar um novo array e copiar o conteúdo do antigo.

---

### **5.4 – Enhanced for (Java 5)**

A partir do Java 5, existe uma forma simplificada de percorrer arrays (e coleções) se não precisarmos do índice:

```java
for (int x : idades) {
    System.out.println(x);
}
```

Esse recurso também funciona quando não conhecemos o tamanho exato do array previamente.

---

### **5.5 – Um pouco mais...**

1. **Arrays multidimensionais**: Podemos criar arrays de duas ou mais dimensões, por exemplo `new int[10][10]`. Em Java, uma array bidimensional é, na prática, uma array de arrays.  
2. **Arrays não retangulares**: Cada “linha” de uma array bidimensional pode ter comprimentos diferentes.  
3. **Array de tamanho zero**: É possível criar `new int[0]`. E se tentarmos `new int[-1]`, ocorre erro em tempo de execução.  
4. **`main(String[] args)`**: O método principal recebe como parâmetro uma array de `String` com argumentos de linha de comando.

---

### **5.6 – Exercícios**

1. **Classe Empresa**  
   Crie uma classe `Empresa` com atributos como **nome**, **cnpj**, e uma **array de `Funcionario`**.  
   ```java
   class Empresa {
       // outros atributos
       Funcionario[] funcionarios;
       String cnpj;
   }
   ```

2. **Método `adiciona`**  
   A `Empresa` precisa de um método:
   ```java
   void adiciona(Funcionario f) {
       // implementa a lógica de guardar Funcionario no array
   }
   ```
   Decida como identificar a próxima posição vazia: usar um **contador** ou **procurar uma posição nula**.

3. **Criar instâncias e adicionar**  
   Em outra classe com `main`, instancie alguns `Funcionario` e adicione-os à `Empresa`. Não se esqueça de **inicializar** a array de `Funcionario` antes, por exemplo:  
   ```java
   empresa.funcionarios = new Funcionario[10];
   ```

4. **Percorrer e imprimir**  
   Percorra a array de `Funcionario` na classe `Empresa` e **imprima** salários, ou chame um método `mostra()` de cada `Funcionario`. Cuidado com posições vazias (`null`).

5. **(Opcional) Método `contem`**  
   Implemente um método para verificar se um determinado `Funcionario` se encontra na array:  
   ```java
   boolean contem(Funcionario f) {
       // loop na array para comparar referências
   }
   ```

6. **(Opcional) Realocação**  
   Se a array estiver cheia ao adicionar um novo `Funcionario`, crie uma **nova array maior** e copie os valores antigos. Isso simula “crescer” dinamicamente.

---

Dessa forma, encerramos o capítulo sobre **arrays** em Java, demonstrando como declarar, instanciar, popular e percorrer arrays, bem como indicando alguns exercícios práticos para fixar os conceitos.