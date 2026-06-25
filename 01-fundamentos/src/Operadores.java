public class Operadores {
    public static void main(String[] args){

        int a = 10;
        int b = 3;

        // Operadores aritméticos
        int soma = a + b;
        int subtracacao = a - b;
        int multiplicacao = a * b;
        int divisao = a/b;
        int modulo = a % b;

        // Operadores relacionais
        System.out.println("a == b" + (a == b));
        System.out.println("a != b" + (a != b));
        System.out.println("a > b" + (a > b));
        System.out.println("a < b" + (a < b));
        System.out.println("a > b" + (a >= b));
        System.out.println("a < b" + (a <= b));

        // Operadores lógicos
        boolean cond1 = true;
        boolean cond2 = false;

        System.out.println("\n=== LÓGICOS ===");
        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("!cond1: " + (!cond1));

        // Operadores de atribuição
        int x = 5;

        x += 2; // x = x + 2
        System.out.println("x += 2: " + x);

        x -= 1; // x = x - 1
        System.out.println("x -= 1: " + x);

        x *= 3; // x = x * 3
        System.out.println("x *= 3: " + x);

        x /= 2; // x = x / 2
        System.out.println("x /= 2: " + x);

        x %= 2; // x = x % 2
        System.out.println("x %= 2: " + x);

        // Operadores de incremento e decremento
        int y = 10;

        System.out.println("y++: " + (y++)); // pós-incremento
        System.out.println("Depois do y++: " + y);

        System.out.println("++y: " + (++y)); // pré-incremento

        System.out.println("y--: " + (y--)); // pós-decremento
        System.out.println("Depois do y--: " + y);

        System.out.println("--y: " + (--y)); // pré-decremento
    }
}
