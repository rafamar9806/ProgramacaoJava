import java.util.Scanner;

public class Uri_1116{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numTestes = input.nextInt();
        double num1 = 0;
        double num2 = 0;
        double resulDivisao = 0;

        for (int i = 0; i < numTestes; i++) {
             num1 = input.nextDouble();
             num2 = input.nextDouble();

             if (num2 == 0) {
                 System.out.println("divisao impossivel");
                 
             }
              else{
                  resulDivisao = num1 / num2;
                  System.out.printf("%.1f%n",resulDivisao);
            
        }
    }
}
}