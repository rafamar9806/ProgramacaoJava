import java.util.Scanner;

public class VetorTeste {

    static Scanner input;
    static int op;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        System.out.println("Digite o tamanho vetor");
        int tamanhoVetor = input.nextInt();
        Vetor vetor = new Vetor(tamanhoVetor);
        vetor.addVetor();

        operacoes();
        selecioanarOperacao();

        do {
            switch (op) {
            case 1:
                System.out.println("Qual número você deseja encontrar");
                int numFind = input.nextInt();
                vetor.find(numFind);

                if (vetor.find(numFind) == -1) {
                    System.out.println("Número não Encontrado");
                } else {
                    System.out.printf("Encontrado na posicão [%d]%n", vetor.find(numFind));
                }
                operacoes();
                selecioanarOperacao();

                break;
            case 2:
                System.out.println("Digite o valor que voce deseja substituir");
                int substituido = input.nextInt();
                System.out.println("Digite o seu subistituto");
                int substituto = input.nextInt();

                if (vetor.find(substituido) == -1) {
                    System.out.println("Número não Encontrado");
                } else {
                    vetor.replace(substituido, substituto);
                }

                operacoes();
                selecioanarOperacao();

                break;
            case 3:
                operacoes();
                selecioanarOperacao();

                break;
            case 4:
                operacoes();
                selecioanarOperacao();

                break;
            case 5:
                operacoes();
                selecioanarOperacao();

                break;
            case 6:
                vetor.print();
                operacoes();
                selecioanarOperacao();

                break;
            case 7:
                operacoes();
                selecioanarOperacao();

                break;
            case 8:
                operacoes();
                selecioanarOperacao();

                break;

            default:
                System.out.println("------Operacao Invalida, digite outra válida");
                operacoes();
                selecioanarOperacao();
                break;
            }

        } while (op != 0);

    }

    public static void operacoes() {
        System.out.println("Digite a operacao desejada");
        System.out.println("0 - Sair");
        System.out.println("1 - find");
        System.out.println("2 - replace");
        System.out.println("3 - swap");
        System.out.println("4 - replaceAll");
        System.out.println("5 - invert");
        System.out.println("6 - print");
        System.out.println("7 - priprodutoEscalar");
        System.out.println("8 - produtoEscalarVetor");

    }

    public static int selecioanarOperacao() {
        System.out.println("Teste");
        op = input.nextInt();

        return op;
    }
}