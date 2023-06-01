package models;

import java.util.ArrayList;
import java.util.List;

import enums.Contrato;

public class EmpresaTransporte extends Empresa {

    // constructors
    public EmpresaTransporte(String nome, String telefone, Endereco endereco) {
        super(nome, telefone, endereco);
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
    public void adicionaVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }
    public void mostraInfoEmpresaTransporte() {
        this.mostraInformacaoBasica();
        System.out.println("Contrato: " + this.statusContrato);
        for (Veiculo veiculo : this.veiculos) {
            System.out.println("    " + veiculo.getPlaca());
        }
    } 
}
