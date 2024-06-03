# Benchmarking Algorithms Sort

## Descrição
Benchmarking Algorithms Sort é um programa em Java que permite ao usuário medir e
comparar o desempenho de diferentes algoritmos de ordenação (Bubble Sort, Selection Sort e Merge Sort)
usando uma lista de itens lida de um arquivo Excel. O programa oferece uma interface
interativa onde o usuário pode inserir a quantidade de itens a serem ordenados e
visualizar o tempo de execução de cada algoritmo.

## Funcionalidades

- Leitura de dados de um arquivo Excel.
- Ordenação de itens utilizando Bubble Sort, Selection Sort e Merge Sort.
- Medição do tempo de execução dos algoritmos de ordenação.
- Interface interativa que permite ao usuário inserir a quantidade de itens, voltar ao menu ou sair do programa.

## Pré-requisitos

- Java JDK 17 ou superior
- Apache POI (biblioteca para manipulação de arquivos Excel)

## Como executar o programa

1. Clone o repositório:
    ```
    git clone https://github.com/SeuUsuario/BenchmarkingAlgorithmsSort.git
    ```

2. Navegue até o projeto:
    ```
    cd BenchmarkingAlgorithmsSort
    ```
   
3. Compile o projeto:
    ```
    javac -cp .:lib/poi-5.2.3.jar:lib/poi-ooxml-5.2.3.jar:lib/poi-ooxml-schemas-5.2.3.jar:lib/xmlbeans-5.1.1.jar:lib/commons-compress-1.21.jar:lib/commons-math3-3.6.1.jar:lib/commons-codec-1.15.jar:lib/curvesapi-1.07.jar src/*.java
    ```

4. Execute o programa:
    ```
    java -cp .:lib/poi-5.2.3.jar:lib/poi-ooxml-5.2.3.jar:lib/poi-ooxml-schemas-5.2.3.jar:lib/xmlbeans-5.1.1.jar:lib/commons-compress-1.21.jar:lib/commons-math3-3.6.1.jar:lib/commons-codec-1.15.jar:lib/curvesapi-1.07.jar src.Main
    ```

## Uso

1. Execute o programa conforme descrito na seção de execução.
2. O menu inicial será exibido:
    ```
   +================= Benchmarking Algorithms Sort ===================+

   1. Run Benchmarking
   2. Exit

   Choose an option:
    ```

3. Escolha a opção 1 para inserir o total de itens.
4. Insira a quantidade de itens e pressione Enter.
5. O programa lerá os dados do arquivo Excel, ordenará os itens usando Bubble Sort, Selection Sort e Merge Sort, e exibirá o tempo de execução de cada algoritmo.
6. Pressione Enter para voltar ao menu principal.
7. Escolha a opção 2 para sair do programa.

## Exemplos de uso

### Exemplo 1: Inserindo 1000 itens

    +================= Benchmarking Algorithms Sort ===================+
    
    1. Run Benchmarking
    2. Exit
    
    Choose an option: 1
    
    Enter total items: 1000
    
    Performing Bubble Sort...
    Bubble Sort duration: 33/ms

    Performing Selection Sort...
    Selection Sort duration:: 13/ms
    
    Performing Merge Sort...
    Merge Sort duration: 1/ms
    
    Press enter to back to the menu...

### Exemplo 2: Saindo do Programa

    +================= Benchmarking Algorithms Sort ===================+
    
    1. Run Benchmarking
    2. Exit
    
    Choose an option: 2
    
    Exiting the program.

