/*
Fazer um programa que leia um número inteiro N, indicando a quantidade de funcionários que serão cadastrados.

Cada funcionário terá os seguintes dados:
- ID (um número inteiro que identifica de forma única cada funcionário).
- Nome (uma string representando o nome completo do funcionário).
- Salário (um valor decimal representando o salário atual do funcionário).

Regras:
- Não pode haver dois funcionários com o mesmo ID. Se o usuário tentar cadastrar um ID repetido, ele deve ser avisado e o cadastro não deve ser realizado.
- O salário de um funcionário não pode ser modificado diretamente. Deve existir um método na classe que permita aumentar o salário com base em uma porcentagem informada pelo usuário.

Após o cadastro, o programa deve:
1. Perguntar qual ID de funcionário terá um aumento de salário.
2. Perguntar a porcentagem de aumento e aplicá-la ao salário do funcionário correspondente.
3. Se o ID informado não existir, o programa deve exibir uma mensagem de erro e não fazer nenhuma alteração.

Por fim, o programa deve imprimir a lista atualizada de funcionários, mostrando os dados (ID, Nome e Salário) de cada um.

Exemplo de entrada e saída:

Entrada:
----------------------------------------
How many employees will be registered? 3

Employee #1:
Id: 333
Name: Maria Brown
Salary: 4000.00

Employee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00

Employee #3:
Id: 772
Name: Bob Green
Salary: 5000.00

Enter the employee id that will have salary increase: 536
Enter the percentage: 10.0

Saída:
----------------------------------------
List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00
772, Bob Green, 5000.00

Caso o usuário informe um ID inexistente:
Entrada:
Enter the employee id that will have salary increase: 776

Saída:
This id does not exist!

Atenção:
- Utilize a técnica de encapsulamento para proteger o atributo salário.
- Para armazenar os funcionários, utilize uma lista (ArrayList).
*/



package entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
