package models;

import java.util.ArrayList;
import java.util.List;

import enums.Contrato;

public class Estabelecimento extends Empresa {
    
    // attributes
    private List<Alimento> alimento;
    private Contrato statusContrato;

    // constructors
    public Estabelecimento(String nome, String telefone, Endereco endereco) {
        super(nome, telefone, endereco);
        this.statusContrato = Contrato.INATIVO;
        this.alimento = new ArrayList<>();
        //TODO Auto-generated constructor stub
    }
    
    // methods
    public void adicionarAlimento(Alimento alimento) {
        this.alimento.add(alimento);
    }
    public void cadastrar() {
        this.statusContrato = Contrato.ATIVO;
    }
    public void mostrarInfoEstabelecimento() {
        this.mostraInformacaoBasica();
        System.out.println("Contrato: " + this.statusContrato);
        System.out.println("Alimentos: ");
        for (Alimento alimento : this.alimento) {
            System.out.println("    " + alimento.getNome());
        }
    }    
}
