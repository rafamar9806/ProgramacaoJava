import java.io.IOException;

import java.util.Scanner;

public class Uri_1099 {

 

    public static void main(String[] args) throws IOException {

 

        int N;

        int x,y;

        Scanner input =new Scanner(System.in);

         

        N =input.nextInt();

        for (int i = 1; i <= N; i++) {

            int total_impares = 0;

            x = input.nextInt();

            y = input.nextInt();

            if (x > y) {

                for (int j = x-1; j > y; j--) {

                    if (j % 2 != 0) {

 

                        total_impares+=j;

                    }

                }

            }else if(x < y){

                for (int j = x + 1; j < y; j++) {

                    if (j % 2 != 0) {

 

                        total_impares+=j;

                    }

                    }

                 

                }else {

                    total_impares = 0;

                }

 

            System.out.print(total_impares+"\n");

        }

         

         

 

    }

}