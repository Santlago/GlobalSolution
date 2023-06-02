package models;

import java.util.ArrayList;
import java.util.List;

import enums.Contrato;

public class Estabelecimento extends Empresa {
    
    // attributes
    private List<Alimento> alimentos;
    private Contrato statusContrato;

    // constructors
    public Estabelecimento(String nome, String telefone, String cnpj, Endereco endereco) {
        super(nome, telefone, cnpj, endereco);
        this.statusContrato = Contrato.INATIVO;
        this.alimentos = new ArrayList<>();
        //TODO Auto-generated constructor stub
    }
    
    // methods
    public void adicionarAlimento(Alimento alimento) {
        this.alimentos.add(alimento);
    }
    public void cadastrar() {
        this.statusContrato = Contrato.ATIVO;
    }
    public void mostrarInfoEstabelecimento() {
        this.mostrarInfoEmpresa();
        System.out.println("Contrato: " + this.statusContrato);
        System.out.println("Alimentos: ");
        for (Alimento alimento : this.alimentos) {
            System.out.println("    " + alimento.getNome());
        }
    }

    // getters and setters
    public List<Alimento> getAlimentos() {
        return alimentos;
    }
    public void setAlimentos(List<Alimento> alimento) {
        this.alimentos = alimento;
    }
    public Contrato getStatusContrato() {
        return statusContrato;
    }
    public void setStatusContrato(Contrato statusContrato) {
        this.statusContrato = statusContrato;
    }   
}
