package models;

import java.util.List;

public class Itinerario {

    // attributes
    private Endereco origem;
    private Endereco destino;
    private List<Endereco> paradas;

    // constructors
    public Itinerario(Endereco origem, Endereco destino) {
        this.origem = origem;
        this.destino = destino;
    }

    // methods
    public void adicionaParada(Endereco endereco) {
        this.paradas.add(endereco);
    }
    public void mostraInfoItinerario() {
        System.out.println("Origem: " + this.origem);
        System.out.println("Destino: " + this.destino);
        for (Endereco parada : this.paradas) {
            parada.mostraInfoEndereco();
        }
    }
}
