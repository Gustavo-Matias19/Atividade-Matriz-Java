public class Empresario extends Agente{
   
    
    private String empresa;

    public Empresario(String empresa) {
        this.empresa = empresa;
    }

    public Empresario(String empresa, String nome, String profissao, boolean
            modo_agente) {
        super(nome, profissao, modo_agente);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    


    @Override
    public void apresentacao(){
        
        System.out.println("Nome: "+ super.getNome());
        System.out.println("Profissao: "+ super.getProfissao());
        System.out.println("Empresa: "+ empresa);
        System.out.println("Modo Agente: "+ super.getModo_agente());
        
    }
    
}

