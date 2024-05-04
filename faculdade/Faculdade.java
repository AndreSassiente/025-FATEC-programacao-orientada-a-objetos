package faculdade;

public class Faculdade {

    public static void main(String[] args) {
        Professor prof1 = new Professor("Friend", "11.111.111-11", 2, "Geografia");
        
        prof1.registrarAulas(50);
        prof1.hollerith();
        
        Funcionario funcionario = new Funcionario("Enemy", "22.222.222-22", 4, "Limpeza");
        funcionario.registrarFalta(3);
        funcionario.hollerith();
    }
    
}
