import java.math.MathContext;

import static java.lang.Math.pow;

public class Operacion {
    private int numero1;
    private int numero2;
    private double numraiz;

    public Operacion() {

    }

    public Operacion(int numero1, int numero2, double numraiz) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numraiz = numraiz;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public double getNumraiz() {
        return numraiz;
    }

    public void setNumraiz(double numraiz) {
        this.numraiz = numraiz;
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                ", numraiz=" + numraiz +
                '}';
    }

    public int calcularPotencia(int num1, int num2){
        if (num1>num2){
            return (int) Math.pow(num1, num2);
        } else {
            return (int) Math.pow(num2, num1);
        }
    }

    public double calcularRaiz(double num3){
        return (double) Math.sqrt(num3);
    }
}
