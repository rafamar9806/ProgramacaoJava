import java.util.Scanner;

public class Lista1_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float tamanhoEscada, alturaQuadro, distancia;

        System.out.println("Digite a altura da esca em centimetros, considerando que deverá ser mais alta do que a altura do quadro");
        tamanhoEscada = teclado.nextFloat();

        System.out.println("Digite a altura do quadro que voce gostaria de pregar na parede, em centimentros");
        alturaQuadro = teclado.nextFloat();

        distancia = tamanhoEscada-alturaQuadro;

        System.out.println("a distancia entre a escada e a parede devera ser de "+distancia+" Centimetros");
    }
}
