package models;

import java.util.List;

import enums.Contrato;

public class EmpresaTransporte extends InformacoesBasicas {

    // constructors
    public EmpresaTransporte(String nome, String telefone, Endereco endereco) {
        super(nome, telefone, endereco);
        //TODO Auto-generated constructor stub
    }

    // attributes
    private List<Veiculo> veiculos;
    private Itinerario itinerario;
    private Contrato statusContrato;

    // methods
    public void cadastra() {
        this.statusContrato = Contrato.ATIVO;
    }
    public void adicionaVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }
    public void mostraInfoEmpresaTransporte() {
        this.mostraInformacaoBasica();
        System.out.println("Itinerário: " + this.itinerario);
        System.out.println("Contrato: " + this.statusContrato);
        for (Veiculo veiculo : this.veiculos) {
            System.out.println(veiculo.getPlaca());
        }
    }
    
}
