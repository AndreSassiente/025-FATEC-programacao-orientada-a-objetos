package faculdade;

public abstract class Pessoa {

    private String nome;
    private String rg;
    private int qtdFilhos;
    
    
    
    // CONSTRUCTOR
    public Pessoa (String nome, String rg, int qtdFilhos) {
        setNome(nome);
        setRg(rg);
        setQtdFilhos(qtdFilhos);
    }

    
    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setQtdFilhos(int qtdFilhos) {
        this.qtdFilhos = qtdFilhos;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public int getQtdFilhos() {
        return qtdFilhos;
    }
    
    public double getAuxilioProcriacao() {
        return qtdFilhos * 100;
    }
    
    
    // ABSTRACT METHODS
    public abstract double calcularSalario();
    public abstract void zerarMes();
    
    // OTHER METHODS
    public void hollerith() {
        System.out.printf("================= HOLLERITH ==================\n\n");
        System.out.printf("NOME\t\t\t%s\n", this.getNome());
        System.out.printf("RG\t\t\t%s\n", this.getRg());
        System.out.printf("QTD FILHOS\t\t0%d\n", this.getQtdFilhos());
        System.out.printf("AUXILIO PROCRIACAO\t%.2f\n", this.getAuxilioProcriacao());
    };
    
    
}
