abstract class Agente {
    private String nome,profissao;
    private boolean modo_agente;

    public Agente() {
    }

    public Agente(String nome, String profissao, boolean modo_agente) {
        this.nome = nome;
        this.profissao = profissao;
        this.modo_agente = modo_agente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public boolean getModo_agente() {
        return modo_agente;
    }

    public void setModo_agente(boolean modo_agente) {
        this.modo_agente = modo_agente;
    }

    
   public void modo_agente_on(){
        this.modo_agente = true;
   } 
    
    public  abstract void  apresentacao();
}
