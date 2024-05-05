package tecelagem;

public abstract class Funcionario {
    
    private String nome;
    private String rg;
    private double salarioBase;
    
    public Funcionario(String nome, String rg, double salarioBase) {
        setNome(nome);
        setRg(rg);
        setSalarioBase(salarioBase);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
   public void setRg(String rg) {
       this.rg = rg;
   }
   
   public void setSalarioBase(double salarioBase) {
       this.salarioBase = salarioBase;
   }
   
   public String getNome() { return nome; }
   public String getRg() { return rg; }
   public double getSalarioBase() { return salarioBase; }
   
   
   public abstract double salarioLiquido();
   
   public abstract void novoMes();
   
   public void hollerith() {
       System.out.printf("================== HOLLERITH ==================\n");
       System.out.printf("NOME\t\t\t%s\n", this.getNome());
       System.out.printf("RG\t\t\t%s\n", this.getRg());
       
   }
   
}
