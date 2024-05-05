package tecelagem;

public class Vendas extends Funcionario {

    private double valorVendas;

    public Vendas(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void registrarVenda(double valor) {
        this.valorVendas += valor;
    }

    @Override
    public double salarioLiquido() {
        return super.getSalarioBase() + (valorVendas * 0.03);
    }

    @Override
    public void novoMes() {
        this.valorVendas = 0;
    }

    @Override
    public void hollerith() {
        super.hollerith();
        System.out.printf("SALARIO BASE\t\t%.2f\n", super.getSalarioBase());
        System.out.printf("VENDAS ACUMULADAS\t%.2f\n", this.getValorVendas());
        System.out.printf("SALARIO LIQUIDO\t\t%.2f\n", this.salarioLiquido());
        System.out.printf("===============================================\n");

    }

}
