package tecelagem;

public class Administracao extends Funcionario {
    
    private double salarioFixo = super.getSalarioBase();
    private int qtdFaltas;
    
    public Administracao(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
    }
    
    public int getQtdFaltas() { return qtdFaltas; }
    
    public void registrarFalta() { qtdFaltas++; }
    
    @Override
    public double salarioLiquido() {
        return salarioFixo - ((salarioFixo / 30) * qtdFaltas);
    }
    
    @Override
    public void novoMes() { qtdFaltas = 0; }
    
    @Override
    public void hollerith() {
        super.hollerith();
        System.out.printf("SALARIO BASE\t\t%.2f\n", this.getSalarioBase());
        System.out.printf("QTD FALTAS\t\t%d\n", this.getQtdFaltas());
        System.out.printf("SALARIO LIQUIDO\t\t%.2f\n", this.salarioLiquido());
        System.out.printf("===============================================\n");
        
    }
}
