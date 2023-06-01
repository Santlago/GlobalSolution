package models;

import java.util.ArrayList;
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
        this.paradas = new ArrayList<>();
    }

    // methods
    public void adicionaParada(Endereco endereco) {
        this.paradas.add(endereco);
    }
    public void mostraInfoItinerario() {
        System.out.println("Itinerário: ");
        System.out.print("    Origem: ");
        this.origem.mostraInfoEndereco();
        System.out.print("    Destino: ");
        this.destino.mostraInfoEndereco();
        System.out.println("    Paradas: ");
        for (Endereco parada : this.paradas) {
            System.out.print("      ");
            parada.mostraInfoEndereco();
        }
    }

    // getters and setters
    public Endereco getOrigem() {
        return origem;
    }
    public void setOrigem(Endereco origem) {
        this.origem = origem;
    }
    public Endereco getDestino() {
        return destino;
    }
    public void setDestino(Endereco destino) {
        this.destino = destino;
    }
    public List<Endereco> getParadas() {
        return paradas;
    }
    public void setParadas(List<Endereco> paradas) {
        this.paradas = paradas;
    }    
}
