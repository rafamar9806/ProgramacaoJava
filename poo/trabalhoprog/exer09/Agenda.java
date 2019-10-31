import java.util.Scanner;

public class Agenda {
    private Contato[] contato;
    private Scanner teclado;
    private static int numContatos = 0;

    public Agenda() {
        contato = new Contato[500];
        teclado = new Scanner(System.in);
    }

    public void interacaoComUsuario() {
        int escolha;

        do {
            escolha = menu();

            switch (escolha) {
            case 1:
                visualizarLista();
                break;
            case 2:
                visualizarContato();
                break;
            case 3:
                adicionar();
                break;
            case 4:
                remover();
                break;

            case 5:
                editarContato();
                break;

            case 0:
                System.out.println("Saindo!");
                break;
            default:
                System.out.println("Opção incorreta. Selecione uma ação válida");
                break;
            }

        } while (escolha != 0);
    }

    public int menu() {
        String escolha;

        System.out.println("Digite a opção:");
        System.out.println("1 - Visualizar agenda");
        System.out.println("2 - Visualizar contato por nome");
        System.out.println("3 - Adicionar contato");
        System.out.println("4 - Remover contato");
        System.out.println("5 - Editar contato");
        System.out.println("0 - Sair");
        escolha = teclado.nextLine();

        return Integer.parseInt(escolha);
    }

    public void adicionar() {
        System.out.println("Nome");
        String nome = teclado.nextLine();

        System.out.println("Sobrenome");
        String sobrenome = teclado.nextLine();

        System.out.println("Telefone");
        String telefone = teclado.nextLine();

        if (Contato.getNumDeContatos() >= 500) {
            System.out.println("Agenda Cheia!");
        } else {
            contato[Contato.getNumDeContatos()] = new Contato(nome, sobrenome, telefone);
            System.out.println("Contato Adicionado!");
        }

    }

    public String solicitaNome() {
        System.out.println("Nome");
        String c = teclado.nextLine();
        return c;
    }

    public Contato buscaContatoPorNome() {
        String nomeBuscado = solicitaNome();
        for (int i = 0; i < Contato.getNumDeContatos(); i++) {
            if (contato[i] != null) {
                if (nomeBuscado.equals(contato[i].getNome())) {
                    return contato[i];
                }
            }
        }
        return null;
    }

    public void visualizarContato() {
        System.out.println("-------------------------");
        Contato.imprimeListaContatos(buscaContatoPorNome());
        System.out.println();
        System.out.println("-------------------------");

    }

    public void visualizarLista() {
        System.out.println("-------------------------");
        System.out.printf("Contatos na Agenda: %d/500\n", Contato.getNumDeContatos());
        for (int i = 0; i < Contato.getNumDeContatos(); i++) {
            if (contato[i] != null) {
                System.out.print((i + 1) + " - ");
                contato[i].imprimeListaContatos();
            }
        }
        System.out.println();
        System.out.println("-------------------------");

    }

    public void remover() {
        int quantidadeContatos = Contato.getNumDeContatos();
        System.out.println("Nome");
        String n1 = teclado.nextLine();

        System.out.println("Sobrenome");
        String sn1 = teclado.nextLine();

        for (int i = 0; i < contato.length; i++) {
            if (contato[i] != null) {

                if (n1.equals(contato[i].getNome())) {
                    if (sn1.equals(contato[i].getSobrenome())) {
                        contato[i] = null;
                        Contato.setNumDeContatos(quantidadeContatos - 1);

                    }
                }
            }
        }
        for (int i = 0; i < contato.length - 1; ++i) {
            if (contato[i] == null) {
                contato[i] = contato[i + 1];
                contato[i + 1] = null;
            }
        }

    }

    public void editarContato() {
        visualizarLista();
        System.out.println("Digite o número referente ao contato que voce deseja editar");
        int numEscolha = teclado.nextInt();
        teclado.nextLine();// limpando buffer
        System.out.println("Voce escolheu");
        Contato.imprimeListaContatos(contato[numEscolha - 1]);

        System.out.println("1 - Editar Nome");
        System.out.println("2 - Editar Sobrenome");
        System.out.println("3 - Editar Telefone");
        System.out.println("4 - Imprimir Contato");
        System.out.println("0 - Sair");

        int escolhaEditar = teclado.nextInt();
        teclado.nextLine();

        do {
            switch (escolhaEditar) {
            case 1:
                System.out.println("Novo Nome");
                String nome = teclado.nextLine();
                contato[numEscolha-1].setNome(nome);
                System.out.println("1 - Editar Nome");
                System.out.println("2 - Editar Sobrenome");
                System.out.println("3 - Editar Telefone");
                System.out.println("4 - Imprimir Contato");
                System.out.println("0 - Sair");
                escolhaEditar = teclado.nextInt();
                teclado.nextLine();

                break;
            case 2:
                System.out.println("Novo Sobrenome");
                String sobrenome = teclado.nextLine();
                contato[numEscolha-1].setSobrenome(sobrenome);
                System.out.println("1 - Editar Nome");
                System.out.println("2 - Editar Sobrenome");
                System.out.println("3 - Editar Telefone");
                System.out.println("4 - Imprimir Contato");
                System.out.println("0 - Sair");
                escolhaEditar = teclado.nextInt();
                teclado.nextLine();

                break;
            case 3:
                System.out.println("Novo Telefone");
                String telefone = teclado.nextLine();
                contato[numEscolha-1].setTelefone(telefone);
                System.out.println("1 - Editar Nome");
                System.out.println("2 - Editar Sobrenome");
                System.out.println("3 - Editar Telefone");
                System.out.println("4 - Imprimir Contato");
                System.out.println("0 - Sair");
                escolhaEditar = teclado.nextInt();
                teclado.nextLine();

                break;
            case 4:
                Contato.imprimeListaContatos(contato[numEscolha - 1]);
                System.out.println("1 - Editar Nome");
                System.out.println("2 - Editar Sobrenome");
                System.out.println("3 - Editar Telefone");
                System.out.println("4 - Imprimir Contato");
                System.out.println("0 - Sair");
                escolhaEditar = teclado.nextInt();
                teclado.nextLine();

                break;
            case 0:
                System.out.println("Saindo...");

                break;

            default:
                System.out.println("Opção inválida");
                System.out.println("1 - Editar Nome");
                System.out.println("2 - Editar Sobrenome");
                System.out.println("3 - Editar Telefone");
                System.out.println("4 - Imprimir Contato");
                System.out.println("0 - Sair");
                escolhaEditar = teclado.nextInt();
                teclado.nextLine();

                break;
            }

        } while (escolhaEditar != 0);

    }
}