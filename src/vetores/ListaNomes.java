import java.util.*;

public class ListaNomes{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

       for (int i = 0; i < 5; i++) {
        String nome = input.nextLine();
        nomes.add(nome);
           
       }
       Collections.sort(nomes);
       System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
       for (String var : nomes) {
           System.out.println(var);
       }
        
    }
}