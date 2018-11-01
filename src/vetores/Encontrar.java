import java.util.*;

public class Encontrar{
    public static void main(String[] args) {
        int [] n = {1,2,2,6,9,5};

        for (int r : n) {
            System.out.print(r + " ");
        }
        System.out.println();

        int loc = Arrays.binarySearch(n, 6);

        System.out.println("encontrei 6 na posição " + loc);
    }
}