public class Programa{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("rafael", "rua rogerio", "0123");
        Cliente cliente2 = new Cliente("dani", "rua marco", "432423");
        cliente1.imprimirInformacoes();
        cliente2.imprimirInformacoes();
    }
}