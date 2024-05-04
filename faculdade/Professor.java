package faculdade;

public class Professor extends Pessoa {
    
    private String curso;
    private double valorHoraAula = 54.90; 
    private int quantidadeAulas = 0;
    
    
    public Professor(String nome, String rg, int qtdFilhos, String curso) {
        super(nome, rg, qtdFilhos);
        setCurso(curso);
    }
    
    // SETTERS
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // GETTERS 
    public String getCurso() {
        return curso;
    }
    
    public double getValorHoraAula() {
        return valorHoraAula;
    }
    
    public int getQuantidadeAulas() {
        return quantidadeAulas;
    }
    
    // PROFESSOR METHODS
    public void registrarAulas(int quantidadeAulas) {
        this.quantidadeAulas += quantidadeAulas;
    }
    
    // OTHER METHODS
    public double calcularSalario() {
        return (quantidadeAulas * valorHoraAula) + this.getAuxilioProcriacao();
    }
    
    @Override
    public void hollerith() {
        super.hollerith();
        System.out.printf("CURSO\t\t\t%s\n", this.getCurso());
        System.out.printf("VALOR HORA AULA\t\t%.2f\n", this.getValorHoraAula());
        System.out.printf("QUANTIDADE AULAS\t%d\n", this.getQuantidadeAulas());
        System.out.printf("SALARIO\t\t\t%.2f\n\n", this.calcularSalario());
        System.out.printf("\n==============================================\n\n");
    }
    
    public void zerarMes() {
        quantidadeAulas = 0;
    }
    
    
    
}
