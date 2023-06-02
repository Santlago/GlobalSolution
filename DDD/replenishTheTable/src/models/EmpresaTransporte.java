package models;

import java.util.ArrayList;
import java.util.List;

import enums.Contrato;

public class EmpresaTransporte extends Empresa {

    // constructors
    public EmpresaTransporte(String nome, String telefone, String cnpj, Endereco endereco) {
        super(nome, telefone, cnpj, endereco);
        this.statusContrato = Contrato.INATIVO;
        this.veiculos = new ArrayList<>();

        //TODO Auto-generated constructor stub
    }

    // attributes
    private List<Veiculo> veiculos;
    private Contrato statusContrato;

    // methods
    public void cadastrar() {
        this.statusContrato = Contrato.ATIVO;
    }
    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }
    public void mostrarInfoEmpresaTransporte() {
        this.mostrarInfoEmpresa();
        System.out.println("Contrato: " + this.statusContrato);
        for (Veiculo veiculo : this.veiculos) {
            System.out.println("    " + veiculo.getPlaca());
        }
    } 
}
