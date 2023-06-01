package models;

import java.time.LocalDate;

public class Alimento {
    
    // attributes
    private String nome;
    private int quantidade;
    private double peso;
    private LocalDate dataValidade;

    // constructors
    public Alimento(String nome, int quantidade, double peso, LocalDate dataValidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.peso = peso;
        this.dataValidade = dataValidade;
    }

    // methods
    public void mostrarInfoAlimento() {
        System.out.println("Nome: " + this.nome);
        System.out.println("    Quantidade: " + this.quantidade);
        System.out.println("    Peso: " + this.peso + "Kg");
        System.out.println("    Data de validade: " + this.dataValidade);
    }

    // getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public LocalDate getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
