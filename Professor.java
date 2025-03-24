public class Professor extends Agente{
   
    private String escola;

    public Professor(String escola) {
        this.escola = escola;
    }

    public Professor(String escola, String nome, String profissao, boolean modo_agente) {
        super(nome, profissao, modo_agente);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
    
    @Override
    public void apresentacao(){
        System.out.println("Nome: "+ super.getNome());
        System.out.println("Profissao: "+ super.getProfissao());
        System.out.println("Escola: "+ escola);
        System.out.println("Modo Agente: "+ super.getModo_agente());
    
    }
}
