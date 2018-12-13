package poo.agenda;

public class Agenda {
     private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[10];
    }

    public void adicionaContato(String nome, String email) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i]==null) {
                contatos[i].setNome(nome);
                contatos[i].setEmail(email);
            }
        }
    }
}