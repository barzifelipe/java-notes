public class Condicionais {
    public static void main(String[] args){

        int idade = 18;
        double nota = 7.5;
        int diaSemana = 3;

        // IF
        if(idade >= 18){
            System.out.println("Maior de idade");
        }

        // IF / ELSE
        if (nota >= 6){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }

        // IF / ELSE IF / ELSE
        if (nota >= 9){
            System.out.println("Conceito A");
        }
        else if (nota >= 7){
            System.out.println("Conceito B");
        }
        else if (nota >= 6) {
            System.out.println("Conceito C");
        }
        else{
            System.out.println("Conceito D");
        }

        // SWITCH
        switch (diaSemana){
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-feira");
                break;

            case 3:
                System.out.println("Terça-feira");
                break;

            case 4:
                System.out.println("Quarta-feira");
                break;

            case 5:
                System.out.println("Quinta-feira");
                break;

            case 6:
                System.out.println("Sexta-feira");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Dia inválido");
        }
    }
}
