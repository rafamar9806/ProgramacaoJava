import java.util.*;

public class ListaNomes{
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Rafael");
        nomes.add("Daniele");
        nomes.add("Edivaldo");
        nomes.add("Maria");

        Collections.sort(nomes);

        System.out.println(nomes.size());

        nomes.remove(index);
        for (String var : nomes) {
            System.out.println(var);
            
        }

        
    }
}