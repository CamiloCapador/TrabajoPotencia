import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nCalcular Potencia entre dos números");
        System.out.println("- Numero mayor elevado en el menor\n");

        Operacion oper = new Operacion();
        Random ale = new Random();

        int num1, num2;
        num1 = ale.nextInt(20);
        num2 = ale.nextInt(20);

        oper.setNumero1(num1);
        oper.setNumero2(num2);

        System.out.println("Número 1: "+oper.getNumero1()+"\nNúmero 2: "+oper.getNumero2()+"\nPotencia: "+oper.calcularPotencia(oper.getNumero1(), oper.getNumero2()));
    }
}