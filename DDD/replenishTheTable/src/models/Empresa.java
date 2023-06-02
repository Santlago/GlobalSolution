package models;

public abstract class Empresa {
    
    // attributes
    protected String nome;
    protected String telefone;
    protected String cnpj;
    protected Endereco endereco;

    // constructors
    public Empresa(String nome, String telefone, String cnpj, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    // methods
    public void mostrarInfoEmpresa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("CNPJ: " + this.cnpj);
        this.endereco.mostrarInfoEndereco();
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
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    

    
}
