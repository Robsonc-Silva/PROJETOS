//declarar uma variável inteira, uma double e uma string
//a inteira representa a idade de uma pessoa
//a string é o seu nome
//a double é a sua altura
//atribui valores
//exibir a seguinte frase
//fulano, voce tem x anos e y de altura

public class Exercicio {
    public static void main (String [] args) {
        int idade = 18;
        double altura = 1.81;
        String nome = "Guilherme", sobrenome = "Segatto";

        System.out.println (nome + " " + sobrenome + ", " + "você tem" + " " + idade + " " + "anos e" + " " + altura + "m" + " " + "de altura");
    }
}