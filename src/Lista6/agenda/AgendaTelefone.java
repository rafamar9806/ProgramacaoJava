package agenda;

public class AgendaTelefone {

    private String[] contatos;
    private String[] telefone;
    private String contatoAchado;

    public String getContatoAchado() {
        return contatoAchado;
    }

    public AgendaTelefone() {
        contatos = new String[5];
        telefone = new String[5];
    }

    public void adicionaContato(String nome) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = nome;
                break;

            }

        }
    }

    public void adicionaTelefone(String tel) {

        int telDigitos = tel.length();

        if (telDigitos == 11) {
            for (int i = 0; i < telefone.length; i++) {
                if (telefone[i] == null) {
                    telefone[i] = tel;
                    break;
                }

            }
        }
    }

    public void listarContatos() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (int i = 0; i < 5; i++) {
            if (contatos[i] != null || telefone[i] != null) {
                System.out.println("Nome: " + contatos[i] + " " + "Telefone: " + telefone[i]);

            }

        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
    public void procurarContato(String contato){
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].equals(contato)) {
                    contatoAchado = telefone[i];
                    
                    
                }
                
            }
            
        }
        
    }

    public void removerContato(String remover) {
        for (int i = 0; i < 5; i++) {
            if (contatos[i] != null) {
                if (contatos[i].equalsIgnoreCase(remover)) {
                    contatos[i] = null;
                    telefone[i] = null;

                }

            }

        }
    }

}
