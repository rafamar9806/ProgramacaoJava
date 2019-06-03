public class ScannerTest{
    public static void main(String[] args) {
        
        System.out.println("Qual seu nome");
        String nome = Teclado.nextLine();

        System.out.println("Qual sua idade");
        int idade = Teclado.nextInt();

        System.out.println("Qual seu salario");
        double salario = Teclado.nextDouble();

        System.out.printf("Nome: %s Idade: %d Salario: %.2f%n" , nome, idade, salario);
    }
}
