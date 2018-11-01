import java.util.*;

public class ComparaArray{
    public static void main(String[] args) {
        
        int [] n = new int [5];
        Arrays.fill(n, 5);

        int [] nCopy = new int [n.length];
        System.arraycopy(n, 0, nCopy, 0, n.length);

        for (int r : n) {
            System.out.print(r + " ");
        }
        System.out.println();
        nCopy[0] = 0;

        for (int r : nCopy) {
            System.out.print(r + " ");
        }
        System.out.println();

        boolean resul = Arrays.equals(n, nCopy);

        System.out.println(resul ? "igual":"nao eh igual");
    }

}