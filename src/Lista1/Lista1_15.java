import java.util.Scanner;

public class Lista1_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        float pesoSacoDeRacao, quantidadeFornecidaParaOsCaes, resultadoConversaoQuilosParaGramas, depoisCincoDias;

        System.out.println("Digite a quantidade de raçao em gramas");
        pesoSacoDeRacao = teclado.nextFloat();

        System.out.println("Digite a quantidade de ração que os dois dogs comem, em quantidadeFornecidaParaOsCaes");
        quantidadeFornecidaParaOsCaes = teclado.nextFloat();

        resultadoConversaoQuilosParaGramas = pesoSacoDeRacao*1000;
        depoisCincoDias = resultadoConversaoQuilosParaGramas-(quantidadeFornecidaParaOsCaes*5);
        
        System.out.println("Depois de cinco dias terá sobrado "+depoisCincoDias+" gramas de ração");
            
    }
}
