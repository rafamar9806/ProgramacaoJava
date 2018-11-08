
public class Empresa {

    private String nomeEmp;
    private Departamento[] departamento = new Departamento[10];

    public Empresa() {
    }

    public void setNomeEmp(String nomeEmp) {
        this.nomeEmp = nomeEmp;
    }

    public String getNomeEmp() {
        return this.nomeEmp;
    }

    public void criarDepartamento(String depar) {
        boolean temIgual = false;
        boolean temEspacao = false;
        int posicaoVazia = -1;

        Departamento d = new Departamento(depar);
        for (int i = 0; i < departamento.length; i++) {
            if (departamento[i] != null) {
                if (departamento[i].getdepartamentoNome().equals(d.getdepartamentoNome())) {
                    temIgual = true;
                }

            }
        }

        for (int i = 0; i < departamento.length; i++) {
            if (departamento[i] == null) {
                posicaoVazia = i;
                temEspacao = true;
            }
        }
        if (!temIgual) {
            if (temEspacao) {
                for (int i = 0; i < departamento.length; i++) {
                    departamento[posicaoVazia] = d;
                }
                System.out.println("Setor adicionado!");

            }
            else {
                System.out.println("Capacidade máxima atingida");
            }
            
        }
        else {
            System.out.println("Setor Existente");
        }
    }

    public void removerDepartamento(String antigo, String novo) {
        int pAntigo = -1;
        Departamento depAntigo = new Departamento(antigo);
        boolean setorAntigoExiste = false;

        int pNovo = -1;
        Departamento depNovo = new Departamento(novo);
        boolean setorNovoExiste = false;

        for (int i = 0; i < departamento.length; i++) {
            if (departamento[i] != null) {
                if (departamento[i].getdepartamentoNome().equals(depAntigo.getdepartamentoNome())) {
                    pAntigo = i;
                    setorAntigoExiste = true;
                }
            }

        }

        for (int i = 0; i < departamento.length; i++) {
            if (departamento[i] != null) {
                if (departamento[i].getdepartamentoNome().equals(depNovo.getdepartamentoNome())) {
                    pNovo = i;
                    setorNovoExiste = true;
                }
            }

        }

        if (setorAntigoExiste && setorNovoExiste) {
            for (int i = 0; i < departamento.length; i++) {
                if (departamento[i] != null) {

                    departamento[pNovo] = departamento[pAntigo];
                    departamento[pNovo].setNome(novo);

                }

            }

            for (int i = 0; i < departamento.length; i++) {
                departamento[pAntigo] = null;
            }
        } else {
            System.out.println("Setor Inexistente!");
        }

    }

    public void addEmpregado(String nome, String id, String set) {
        Empregado emp = new Empregado(nome, id);
        int posicao = 0;

        Departamento dep = new Departamento(set);
        for (int i = 0; i < departamento.length; i++) {
            if (departamento[i] != null) {
                if (departamento[i].getdepartamentoNome().equals(dep.getdepartamentoNome())) {
                    departamento[i].adicionarEmpregado(emp);
                    System.out.println("Empregado Adicionado!");

                }
            }
        }

    }

    public void mudarSetor(String nome, String id, String setAntigo, String setNovo) {
        boolean temSetorAntigo = false;
        int posiSetAntigo = -1;
        Departamento dep = new Departamento(setAntigo);
        for (int i = 0; i < departamento.length; i++) {
            if (departamento[i] != null) {
                if (departamento[i].getdepartamentoNome().equals(dep.getdepartamentoNome())) {
                    posiSetAntigo = i;
                    temSetorAntigo = true;
                }
            }
        }

        if (temSetorAntigo) {
            for (int i = 0; i < departamento.length; i++) {
                if (departamento[i] != null) {
                    if (departamento[posiSetAntigo].removerempregado(nome, id)) {
                        addEmpregado(nome, id, setNovo);
                    }

                }
            }
        } else {
            System.out.println("Setor inexistente!");
        }

    }

    public void impEmpr() {
        for (int i = 0; i < departamento.length; i++) {
            if (departamento[i] != null) {
                departamento[i].imprimeEmp();

            }
        }
    }

    public void imprime() {
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Setores");
        for (int i = 0; i < departamento.length; i++) {
            if (departamento[i] != null) {
                System.out.print("Departamento: " + departamento[i].getdepartamentoNome() + "\n");
            }

        }
        System.out.println("-------------------");
    }

}
