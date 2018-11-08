public class EmpregadoTest{
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Joao" , "Sicrano", 1000);
        Empregado empregado2 = new Empregado("Maria" , "Fulana", 2000);

        empregado1.exibeInfo();
        empregado2.exibeInfo();
        
        System.out.println();

        System.out.println("Salario Anual empregado1: " + empregado1.getSalario()*12);
        System.out.println("Salario Anual empregado2: " + empregado2.getSalario() * 12);

        System.out.println();

        System.out.println("Dando aumento aos funcionarios");
        System.out.println();
        
        empregado1.aumentarSalario();
        empregado1.exibeInfo();

        empregado2.aumentarSalario();
        empregado2.exibeInfo();
    }
}