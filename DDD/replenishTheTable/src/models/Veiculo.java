package models;

public class Veiculo {

    // attributes
    private String placa;
    private String modelo;
    private double capacidade;
    private Itinerario itinerario;

    // constructors
    public Veiculo(String placa, String modelo, double capacidade, Itinerario itinerario) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.itinerario = itinerario;
    }

    // methods
    public void mostrarInfoVeiculo() {
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Capacidade: " + this.capacidade + "Kg");
        this.itinerario.mostraInfoItinerario();
    }

    // getters and setters
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
}
