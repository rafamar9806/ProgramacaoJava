public class ScannerTest{
    public static void main(String[] args) {
        System.out.println("Qual seu nome");

        Teclado.setTexto();
         String nome = Teclado.getTexto();

        System.out.println("Bem vindo " + nome);
    }
}