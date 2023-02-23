import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ejericios Math");
        System.out.println("\nCalcular Potencia");
        System.out.println("- Número mayor elevado en el menor\n");

        Operacion oper = new Operacion();
        Random ale = new Random();

        int num1, num2;
        num1 = ale.nextInt(20);
        num2 = ale.nextInt(20);

        oper.setNumero1(num1);
        oper.setNumero2(num2);

        System.out.println("Número 1: "+oper.getNumero1()+"\nNúmero 2: "+oper.getNumero2()+"\nPotencia: "+oper.calcularPotencia(oper.getNumero1(), oper.getNumero2()));
        System.out.println("\nCalcular Raiz");
        System.out.println("- Raiz de número mayor entre menor\n");
        System.out.println("Número 1: "+oper.getNumero1()+"\nNúmero 2: "+oper.getNumero2()+"\nRaiz: "+oper.calcularRaiz(oper.getNumero1(), oper.getNumero2()));
    }
}