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
                visualizarContato(solicitaNome());
                break;
            case 3:
                System.out.println("Nome");
                String n = teclado.nextLine();

                System.out.println("Sobrenome");
                String sn = teclado.nextLine();

                System.out.println("Telefone");
                String tel = teclado.nextLine();
                adicionar(n, sn, tel);
                break;
            case 4:
                System.out.println("Nome");
                String n1 = teclado.nextLine();

                System.out.println("Sobrenome");
                String sn1 = teclado.nextLine();

                remover(n1, sn1);
                break;
            case 5:
                Contato r = new Contato();
                r = buscaContatoPorNome();
                System.out.println("Nome Novo");
                String nomeNovo = teclado.nextLine();
                System.out.println("Sobrenome Novo");
                String sobrenomeNovo = teclado.nextLine();
                System.out.println("telefone Novo");
                String telefoneNovo = teclado.nextLine();
                editarContato(r, nomeNovo, sobrenomeNovo, telefoneNovo);
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

    public void adicionar(String nome, String sobrenome, String telefone) {
        Contato cont = new Contato(nome, sobrenome, telefone);

        if (numContatos < contato.length) {
            if (contato[numContatos] == null) {
                contato[numContatos] = cont;
                ++numContatos;
            }
        }

    }

    public String solicitaNome() {
        System.out.println("Nome");
        String c = teclado.nextLine();
        return c;
    }

    public Contato buscaContatoPorNome() {
        System.out.println("Nome Antigo");
        String nomeAntigo = teclado.nextLine();
        System.out.println("Sobrenome Antigo");
        String sobrenomeAntigo = teclado.nextLine();
        System.out.println("telefone Antigo");
        String telefoneAntigo = teclado.nextLine();

        Contato na = new Contato(nomeAntigo, sobrenomeAntigo, telefoneAntigo);
        for (int i = 0; i < contato.length; i++) {
            if (contato[i] != null) {
                if (contato[i].getNome().equals(na.getNome())) {
                    if (contato[i].getSobrenome().equals(na.getSobrenome())) {
                        if (contato[i].getTelefone().equals(na.getTelefone())) {
                            return contato[i];
                        }
                    }
                }
            }
        }

        return null;
    }

    public void visualizarContato(String n) {
        for (int i = 0; i < contato.length; i++) {
            if (contato[i] != null) {
                if (n.equals(contato[i].getNome())) {
                    contato[i].imprimeListaContatos();
                }
            }
        }

    }

    public void visualizarLista() {
        for (int i = 0; i < contato.length; i++) {
            if (contato[i] != null) {
                contato[i].imprimeListaContatos();
            }
        }
    }

    public void remover(String n1, String sn1) {
        for (int i = 0; i < contato.length; i++) {
            if (contato[i] != null) {

                if (n1.equals(contato[i].getNome())) {
                    if (sn1.equals(contato[i].getSobrenome())) {
                        contato[i] = null;
                    }
                }
            }
        }
    }

    public void editarContato(Contato a, String nomeNovo, String sobrenomeNovo, String telefoneNovo) {

        Contato e = new Contato(nomeNovo, sobrenomeNovo, telefoneNovo);

        for (int i = 0; i < contato.length; i++) {
            if (contato[i] != null) {
                if (a.getNome().equals(contato[i].getNome())) {
                    if (a.getSobrenome().equals(contato[i].getSobrenome())) {
                        if (a.getTelefone().equals(contato[i].getTelefone())) {
                            contato[i] = e;
                        } else {
                            System.out.println("Telefone não está na lista");
                        }
                    } else {
                        System.out.println("Sobrenome não está na lista");
                    }
                } else {
                    System.out.println("Nome não está na Lista");
                }
            }
        }
    }
}