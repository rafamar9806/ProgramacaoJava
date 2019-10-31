
import java.util.Scanner;

public class AgendaTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AgendaTelefone agenda = new AgendaTelefone();
        System.out.println("Escolha uma opção:\n1 - Adicionar Contato\n2 - Excluir Contato\n3 - Listar Contatos\n0 - Sair");

        int opcao = input.nextInt();
        input.nextLine();
        String addNome = "";
        String addTelefone = "";
        String remover = "";
        String procurar = "";

        do {

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato desejado");
                    addNome = input.nextLine();
                    System.out.println("Digite o telefone");
                    addTelefone = input.next();
                    agenda.adicionaContato(addNome);
                    agenda.adicionaTelefone(addTelefone);

                    System.out.println("Escolha uma opção:\n1 - Adicionar Contato\n2 - Excluir Contato\n3 - Listar Contatos\n0 - Sair");
                    opcao = input.nextInt();
                    input.nextLine();

                    break;

                case 2:
                    System.out.println("Digite o contato que voce deseja excluir");
                    remover = input.nextLine();
                    agenda.removerContato(remover);
                    System.out.println("Escolha uma opção:\n1 - Adicionar Contato\n2 - Excluir Contato\n3 - Listar Contatos\n0 - Sair");
                    opcao = input.nextInt();
                    input.nextLine();

                    break;

                case 3:
                    agenda.listarContatos();
                    System.out.println("Escolha uma opção:\n1 - Adicionar Contato\n2 - Excluir Contato\n3 - Listar Contatos\n0 - Sair");
                    opcao = input.nextInt();
                    input.nextLine();

                    break;

                case 4:
                    System.out.println("Digite o contato que voce deseja procurar");
                    procurar = input.nextLine();
                    agenda.procurarContato(procurar);
                    System.out.println("Contato Achado: " + agenda.getContatoAchado());
                    System.out.println("Escolha uma opção:\n1 - Adicionar Contato\n2 - Excluir Contato\n3 - Listar Contatos\n0 - Sair");
                    opcao = input.nextInt();
                    input.nextLine();

                    break;

            }

        } while (opcao != 0);

    }
}
