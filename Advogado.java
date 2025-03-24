public class Advogado extends Agente{
    
    private String OAB;

    public Advogado(String OAB) {
        this.OAB = OAB;
    }

    public Advogado(String OAB, String nome, String profissao, boolean modo_agente) {
        super(nome, profissao, modo_agente);
        this.OAB = OAB;
    }

    public String getOAB() {
        return OAB;
    }

    public void setOAB(String OAB) {
        this.OAB = OAB;
    }
    
    
    
    
    @Override
    public void apresentacao(){
        
        System.out.println("Nome: "+ super.getNome());
        System.out.println("Profissao: "+ super.getProfissao());
        System.out.println("OAB: "+ OAB);
        System.out.println("Modo Agente: "+ super.getModo_agente());
        
    }
}