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
        this.itinerario.mostrarInfoItinerario();
    }

    // getters and setters
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
    public Itinerario getItinerario() {
        return itinerario;
    }
    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
}
