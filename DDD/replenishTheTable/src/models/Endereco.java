package models;

public class Endereco {
    
    // attributes
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

    // constructors
    public Endereco(String rua, String numero, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    // methods
    public String InfoEndereco() {
        return "Endereço: " + this.rua + ", " + this.numero + ", " + this.cidade + ", " + this.estado + ", " + this.cep;
    }

    // getters and setters
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
}
