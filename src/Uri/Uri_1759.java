import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 08.02.2016.
 */
public class Uri_1759 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num >= 0 && num <= 1000000) {
            for (int i = 1; i < num; i++) {
                System.out.print("Ho" + " ");
            }
            System.out.println("Ho" + "!");
        }
    }
}