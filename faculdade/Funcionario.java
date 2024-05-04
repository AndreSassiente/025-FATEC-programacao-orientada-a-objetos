package faculdade;

public class Funcionario extends Pessoa {

    private String departamento;
    private double valorFixo = 1500.00;
    private int faltas = 0;
    private double valeCoxinha = 42.00;

    public Funcionario(String nome, String rg, int qtdFilhos, String departamento) {
        super(nome, rg, qtdFilhos);
        setDepartamento(departamento);
    }
    
    // SETTERS
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    // GETTERS
    public String getDepartamento() {
        return departamento;
    }
    
    public double getValorFixo() {
        return valorFixo;
    }
    
    public int getFaltas() {
        return faltas;
    }
    
    public double getValeCoxinha(){
        return valeCoxinha;
    }
    
    // FUNCIONARIO METHODS
    public void registrarFalta(int falta) {
        this.faltas += falta;
    }
    
    // PESSOA METHODS
    public double calcularSalario() {
        return (valorFixo + this.getAuxilioProcriacao() + valeCoxinha) - (valorFixo / 20 * faltas);
    }
    
    public void zerarMes() {
        faltas = 0;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.printf("DEPARTAMENTO\t\t%s\n", departamento);
        System.out.printf("VALOR FIXO\t\t%.2f\n", this.getValorFixo());
        System.out.printf("VALE COXINHA\t\t%.2f\n", this.getValeCoxinha());
        System.out.printf("FALTAS\t\t\t%d\n", faltas);
        System.out.printf("DESCONTO\t\t%.2f\n", (valorFixo / 20 * faltas));
        System.out.printf("SALARIO\t\t\t%.2f\n", this.calcularSalario());
        System.out.printf("\n==============================================\n\n");
    }

}
