import java.util.Scanner;
import java.lang.Math;
public class Uri_1178 {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  Double [] n = new Double[100];
  Double t = in.nextDouble();
  for (int i=0;i<100;i++){
   n [i] = t/(Math.pow(2, i));
   System.out.printf("N["+ i + "] = %.4f\n",n[i]);
  }
 }
}