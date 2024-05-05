package pessoainterface;

public class PessoaInterface {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Andre", "Sassiente", "11.111.111-11");
        
        System.out.println(cliente.nameLastName());
        System.out.println(cliente.lastNameName());
        System.out.println(cliente.lastNameDocument());
        
    }
    
}
