import java.util.Arrays;
public class CopiandoVetor{
    public static void main(String[] args) {
        int [] vet1 = {1,2,3,4};
        int [] vetCopy = new int[vet1.length];
        
        System.out.println("Conteudo vet1");
        for (int vet : vet1) {
            System.out.print(vet + " ");
            
        }
        System.out.println();

        System.out.println("Conteudo vetCopy Antes");
        for (int vetC : vetCopy) {
            System.out.print(vetC + " ");
            
        }
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
       
        System.arraycopy(vet1, 0, vetCopy, 0, vet1.length);
        System.out.println("Conteudo vet1");
        for (int vet : vet1) {
            System.out.print(vet + " ");
            
        }
        System.out.println();

        System.out.println("Conteudo vetCopy Depois");
        for (int vetC : vetCopy) {
            System.out.print(vetC + " ");
            
        }
        System.out.println();

        boolean igual = Arrays.equals(vet1, vetCopy);

        if (igual) {
            System.out.println("Mesmo conteúdo");
            
        }

        Arrays.fill(vetCopy, 7);

        System.out.println("Conteudo vetCopy Depois");
        for (int vetC : vetCopy) {
            System.out.print(vetC + " ");
            
        }
        System.out.println();

        int c = Arrays.binarySearch(vet1, 2);

        if (c == 1) {
            System.out.println("Igual a 2");
            
        }

    }
}