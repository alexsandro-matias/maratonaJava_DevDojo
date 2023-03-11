//Aula 40 - Construtores e sobrecarga de construtores parte 02
//Aula 41 - Construtores e sobrecarga de construtores parte 02
package br.com.abc.javacore.parte05_sobrecargaconstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula; // adicionado o atributo depois

    // construtores não possuem retorno
    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

//    Caso seja necessário alterar a regra de negócio e ser inserido o campo de data de matrícula do Estudante,
//    teria que ser adicionado ao construtor. Uma das formas é através da sobrecarga do construtor:

//    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
//        this.matricula = matricula;
//        this.nome = nome;
//        this.notas = notas;
//        this.dataMatricula;
//    }

//    Porém a abordagem é uma péssima implementação, devido à repetição de código, então,
//    em Java é possível usar um construtor para construir outro através da palavra reservada this.


    // Para chamar um construtor dentro de outro construtor, usamos a palavra
    // reservada this.segue as regras:
    // 1. Um construtor dentro de outro construtor só pode ser chamado dentro de
    // outro construtor, e não dentro de métodos.
    // 2. Esse construtor deve ser a primeira linha dentro do outro construtor;

    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        // 2. Esse construtor deve ser a primeira linha dentro do outro
        // construtor, ou seja, passando a responsabilidade de código para outro
        // construtor. Passado na mesma ordem, ou seja, mesma assinatura.
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
        // Com essa construção já é possível apagar os outros métodos "init"

    }



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }*/

    public void imprime() {
        System.out.println(this.getNome());
        System.out.println(this.getMatricula());
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota: " + notas[i]);
        }
        System.out.println(dataMatricula);
    }
}
