package tecelagem;

public class Tecelagem {

    public static void main(String[] args) {

        Administracao adm = new Administracao("Andre", "11.111.111-11", 2500.00);
        adm.registrarFalta();
        adm.registrarFalta();
        adm.hollerith();

        Producao pdc = new Producao("Felipe", "22.222.222-22", 10.00);
        pdc.registrarHorasDiurnas(0);
        pdc.registrarHorasNoturnas(100);
        pdc.hollerith();
        
        Vendas vdn = new Vendas("Leticia", "33.333.333-33", 3000.00);
        vdn.registrarVenda(5000);
        vdn.hollerith();
    }

}
