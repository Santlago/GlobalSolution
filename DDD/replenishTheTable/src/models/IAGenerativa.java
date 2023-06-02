package models;

public class IAGenerativa {
    
    // attributes
    private String url;

    // constructors
    public IAGenerativa(String url) {
        this.url = url;
    }

    // methods
    public void criarItinerario(Estabelecimento estabelecimento, Veiculo veiculo, BancoDeAlimentos bancoDeAlimentos) {
        veiculo.getItinerario().adicionarParada(estabelecimento.getEndereco());
        veiculo.getItinerario().adicionarParada(bancoDeAlimentos.getEndereco());
    }
    public String infoIAGenerativa() {
        return "URL: " + this.url;
    }

    // getters and setters
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    
}
