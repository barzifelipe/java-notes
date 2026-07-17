public class IntroducaoLambda {
    public static void main(String[] args) {
        Runnable tarefa1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando tarefa");
            }
        };

        tarefa1.run();

        // Com expressão lambda

        Runnable tarefa2 = () -> System.out.println("Executando tarefa...");

        tarefa2.run();

        // Lambda sem parâmetros

        Saudacao saudacao = () -> System.out.println("Olá!");

        saudacao.executar();

        // Lambda com um parâmetro

        Mensagem mensagem = nome -> System.out.println("Olá, " + nome + "!");

        mensagem.exibir("Felipe");

        // Lambda com dois parâmetros e retorno

        Calculadora soma = (a, b) -> a + b;

        System.out.println(soma.calcular(10, 20));

        // Lambda com bloco de código

        Calculadora multiplicacao = (a, b) -> {

            System.out.println("Multiplicando...");

            return a * b;

        };

        System.out.println(multiplicacao.calcular(5, 4));

    }

}

