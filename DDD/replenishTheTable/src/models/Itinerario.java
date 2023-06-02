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
    public void adicionarParada(Endereco endereco) {
        this.paradas.add(endereco);
    }
    public void mostrarInfoItinerario() {
        System.out.println("Itinerário: ");
        System.out.print("    Origem: ");
        System.out.println(this.origem.InfoEndereco());
        System.out.print("    Destino: ");
        System.out.println(this.destino.InfoEndereco());
        System.out.println("    Paradas: ");
        for (Endereco parada : this.paradas) {
            System.out.println("        " + parada.InfoEndereco());
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
