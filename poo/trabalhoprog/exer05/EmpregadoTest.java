public class EmployeeTest{
    public static void main(String[] args) {
        Employe empregado1 = new Employe("Joao" , "Sicrano", 1000);
        Employe empregado2 = new Employe("Maria" , "Fulana", 2000);

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
