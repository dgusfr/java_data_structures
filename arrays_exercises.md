# **Exercícios**

## 1. **Classe Empresa**  
   Crie uma classe `Empresa` com atributos como **nome**, **cnpj**, e uma **array de `Funcionario`**.  
   ```java
   class Empresa {
       // outros atributos
       Funcionario[] funcionarios;
       String cnpj;
   }
   ```

## 2. **Método `adiciona`**  
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
