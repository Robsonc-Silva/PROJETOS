public class Variaveis {
    public static void main (String [] args) {
        //declarando variáveis
        int a = 19, b =4;

        //realizando operações com variáveis inteiras
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        //exibindo os resultados das operações
        System.out.println ("soma = " + soma);
        System.out.println ("subtracao = " + subtracao);
        System.out.println ("multiplicacao = " + multiplicacao);
        System.out.println ("divisao = " + divisao);
        System.out.println ("resto = " + resto); //resto é o que sobra quando divide um numero e não da exato
        //trabalhando com variáveis double

        //declaração
        double x = 7.5, y = 0.25;

        //realizando operaaações com variáveis com decimais (números quebrados)
        double somaDouble = x + y;
        double subtracaoDouble = x - y;
        double multiplicacaoDouble = x * y;
        double divisaoDouble = x / y;
        System.out.println (x + " + " + y + " = " + somaDouble);
        System.out.println (x + " - " + y + " = " + subtracaoDouble);
        System.out.println (x + " * " + y + " = " + multiplicacaoDouble);
        System.out.println (x + " / " + y + " = " + divisaoDouble);

        //exemplo de int com double
        double resultado = a * x + b * y;
        System.out.println ("resultado = " + resultado);

        //declaracao de variável texto
        String nome = "Guilherme", sobrenome = "Segatto";
        System.out.println (nome + " " + sobrenome);
        
    }
}