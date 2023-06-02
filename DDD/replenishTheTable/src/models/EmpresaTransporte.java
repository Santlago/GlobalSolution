package models;

import java.util.ArrayList;
import java.util.List;

import enums.Contrato;

public class EmpresaTransporte extends Empresa {

    // attributes
    private List<Veiculo> veiculos;
    private Contrato statusContrato;
    private String detalhesContrato;

    // constructors
    public EmpresaTransporte(String nome, String telefone, String cnpj, Endereco endereco) {
        super(nome, telefone, cnpj, endereco);
        this.statusContrato = Contrato.INATIVO;
        this.veiculos = new ArrayList<>();

        //TODO Auto-generated constructor stub
    }

    // methods
    public void cadastrar() {
        this.statusContrato = Contrato.ATIVO;
    }
    public void cadastrar(String detalhes) {
        this.statusContrato = Contrato.ATIVO;
        this.detalhesContrato = detalhes;
    }
    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println(this.endereco.InfoEndereco());
        System.out.println("Contrato: " + this.statusContrato);
        if(this.statusContrato == Contrato.ATIVO) {
            System.out.println("Detalhes do contrato: " + this.detalhesContrato);
        }
        for (Veiculo veiculo : this.veiculos) {
            System.out.println("    " + veiculo.getPlaca());
        }
    } 
}
