package models;

public class Veiculo {

    // attributes
    private String placa;
    private String modelo;
    private double capacidade;

    // constructors
    public Veiculo(String placa, String modelo, double capacidade) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    // methods
    public void mostraInfoVeiculo() {
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Capacidade: " + this.capacidade + "Kg");
    }

    // getters and setters
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
}
