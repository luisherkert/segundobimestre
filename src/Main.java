public class Main {
    public static void main(String[] args) {

        int primeiroNumero = 10;
        int segundoNumero = 20;
        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;

         int somaViaFuncao = somarValores (primeiroNumero, segundoNumero);
        System.out.println("valor soma: " + somaViaFuncao);

        int subtracaoFuncao = subtrairValores (-50,30);
        System.out.println("Valor Subtração: "+subtracaoFuncao);

        int multiplicacaoFuncao = multiplicarValores (10,3);
        System.out.println("Valor Multiplicação: "+multiplicacaoFuncao);

        int divisaoFuncao = dividirValores (-10,2);
        System.out.println("Valor Divisão: "+divisaoFuncao);
    }
    //MODIFICADOR DE ACESSO, QUE PODERÁ VER ISSO. PUBLIC(TODOS QUE QUISEREM USAR ESTÁ LIBERADO)
    // E PRIVATE (COMO O NOME JA DIZ SOMENTE QUEM TEM O ACESSO PODERÁ USAR ESSA FUNÇÃO).
    public static int somarValores (int numA, int numB) {
        // toda função que não tem void, tem que ter return;
        //parametros sempre que eu quiser passar uma coisa de um coisa para outra usa-se parametros;
        //exemplo system.in;
        return numA + numB;
    }
    public static int subtrairValores (int numA, int numB) {
        if (numA < 0) {
            numA = numA  * -1;
        }
        return numA - numB;
    }
    public static int multiplicarValores (int numA, int numB) {
        if (numA<0){
            numA = numA + -1;
        }
        return numA * numB;
    }
    public static int dividirValores (int numA, int numB) {
       if (numA<0){
           numA = numA * -1;
       }
        return numA / numB;
    }
}

