package models;

import java.util.List;

public class BancoDeAlimentos {
    
    // attributes
    private Endereco endereco;
    private List<Alimento> alimentos;

    // constructors
    public BancoDeAlimentos(Endereco endereco) {
        this.endereco = endereco;
    }
}
