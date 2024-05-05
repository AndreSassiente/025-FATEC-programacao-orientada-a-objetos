package tecelagem;

public class Producao extends Funcionario {
    
    private double valorHora;
    private int qtdHoraDiurna;
    private int qtdHoraNoturna;
    
    public Producao(String nome, String rg, double valorHora) {
        super(nome, rg, valorHora);
        setValorHora(valorHora);
    }
    
    public double getValorHora() { return valorHora; }
    public int getQtdHoraDiurna() { return qtdHoraDiurna; }
    public int getQtdHoraNoturna() { return qtdHoraNoturna; }
    
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setQtdHoraDiurna(int qtdHoraDiurna) {
        this.qtdHoraDiurna = qtdHoraDiurna;
    }

    public void setQtdHoraNoturna(int qtdHoraNoturna) {
        this.qtdHoraNoturna = qtdHoraNoturna;
    }
    
    
    public void registrarHorasDiurnas(int horas) {
        this.qtdHoraDiurna += horas;
    }
    
    public void registrarHorasNoturnas(int horas) {
        this.qtdHoraNoturna += horas;
    }
    
    @Override
    public double salarioLiquido() {
       return (qtdHoraDiurna * valorHora) + (qtdHoraNoturna * (valorHora + (valorHora * 0.3))); 
    }
    
    @Override
    public void novoMes() {
        setQtdHoraDiurna(0);
        setQtdHoraNoturna(0);
    }
    
    @Override
    public void hollerith() {
        super.hollerith();
        System.out.printf("VALOR HORA\t\t%.2f\n", this.getValorHora());
        System.out.printf("QTD HORAS DIURNAS\t%d\n", this.getQtdHoraDiurna());
        System.out.printf("QTD HORAS NOTURNAS\t%d\n", this.getQtdHoraNoturna());
        System.out.printf("SALARIO LIQUIDO\t\t%.2f\n", this.salarioLiquido());
        System.out.printf("===============================================\n");

    }
    
}
