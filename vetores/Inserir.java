import java.util.*;

public class Inserir{
    public static void main(String[] args) {
        int [] n = new int [10];

        Arrays.fill(n, 1, 10, 5);
        n[0] = 1;
        for(int e : n){
            System.out.print(e + " ");
        }
        System.out.println();
    }
}