package pessoainterface;

public class Cliente extends Pessoa implements NameFormatInterface {
    
    public Cliente(String nome, String sobrenome, String rg) {
        super(nome, sobrenome, rg);
    }
    
    @Override
    public String nameLastName() { return super.getNome() + " " + super.getSobrenome(); }
    
    @Override
    public String lastNameName() { return super.getSobrenome() + ", " + super.getNome(); }
    
    @Override
    public String lastNameDocument() { return super.getSobrenome() + ": " + super.getRg(); }
    
}
