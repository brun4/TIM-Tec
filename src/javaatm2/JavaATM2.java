package javaatm2;

public class JavaATM2 {
    public static void main(String[] args) {

        int originalAmount = 53;
        int amount = originalAmount;

        System.out.println("Dividindo R$ " + originalAmount + " em notas de R$100, R$50, R$20, R$10, R$5, R$2 e R$1");

        int [] billValues = {100, 50, 20, 10, 5, 2, 1};
        int [] numberOfBills = new int[billValues.length];
    }
}
