package ordenarobjetos;


public class Aluno {
    // rga, nome, curso, media de aproveitamento, porcentagem cursa
    private String nome;
    private String curso;
    private String rga;
    private double mediaAproveitamento;
    private double porcentagemCursada;

    public Aluno(String nome, String curso, String rga, double mediaAproveitamento, double porcentagemCursada) {
        super();
        this.nome = nome;
        this.curso = curso;
        this.rga = rga;
        this.mediaAproveitamento = mediaAproveitamento;
        this.porcentagemCursada = porcentagemCursada;
    }

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRga() {
        return rga;
    }

    public void setRga(String rga) {
        this.rga = rga;
    }

    public double getMediaAproveitamento() {
        return mediaAproveitamento;
    }

    public void setMediaAproveitamento(double mediaAproveitamento) {
        this.mediaAproveitamento = mediaAproveitamento;
    }

    public double getPorcentagemCursada() {
        return porcentagemCursada;
    }

    public void setPorcentagemCursada(double porcentagemCursada) {
        this.porcentagemCursada = porcentagemCursada;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %.0f, %.0f", this.rga, this.nome, this.curso, this.mediaAproveitamento, this.porcentagemCursada);
    }

    public int compareTo(Aluno n) {
        if (this.curso.compareTo(n.getCurso())>0) {
            return 1;
        }
        else if (this.curso.compareTo(n.getCurso())<0){
            return -1;
        }
        else {
            return ordenaByMedia(n);
        }



    }

    private int ordenaByMedia(Aluno n) {
        if (this.mediaAproveitamento < n.getMediaAproveitamento()){
            return 1;
        }else if (this.mediaAproveitamento > n.getMediaAproveitamento()){
            return -1;
        }else{
            return ordenaByPorcentagemCursada(n);
        }
    }

    private int ordenaByPorcentagemCursada(Aluno n) {
        if (this.porcentagemCursada < n.getPorcentagemCursada()){
            return 1;
        }else if (this.porcentagemCursada > n.getPorcentagemCursada()){
            return -1;
        }else if (this.curso.compareTo(n.curso)==0 && this.mediaAproveitamento == n.getMediaAproveitamento() &&
                this.porcentagemCursada == n.getPorcentagemCursada()){
            return ordenaPorNome(n);
        }
        return 0;
    }

    private int ordenaPorNome(Aluno n) {
        if (this.nome.compareTo(n.getNome())>0) {
            return 1;
        }
        else if (this.nome.compareTo(n.getNome())<0){
            return -1;
        }
        else {
            return 0;
        }
    }


}
