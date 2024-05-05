package pessoainterface;

public class Pessoa {

    private String nome, sobrenome, rg;

    public Pessoa(String nome, String sobrenome, String rg) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
