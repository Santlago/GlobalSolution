package models;

public abstract class InformacoesBasicas {
    
    // attributes
    protected String nome;
    protected String telefone;
    protected Endereco endereco;

    // constructors
    public InformacoesBasicas(String nome, String telefone, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // methods
    public void mostraInformacaoBasica() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nome: " + this.telefone);
        this.endereco.mostraEndereco();
    }

    // getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
}
