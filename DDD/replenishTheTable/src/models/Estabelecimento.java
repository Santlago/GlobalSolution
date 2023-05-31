package models;

import java.util.List;

import enums.Contrato;

public class Estabelecimento extends InformacoesBasicas {
    
    // attributes
    private static int quantidadeEstabelecimentos;
    private int id;
    private List<Alimento> alimento;
    private Contrato statusContrato;

    // constructors
    public Estabelecimento(String nome, String telefone, Endereco endereco) {
        super(nome, telefone, endereco);
        Estabelecimento.quantidadeEstabelecimentos += 1;
        this.id = Estabelecimento.quantidadeEstabelecimentos;
        //TODO Auto-generated constructor stub
    }
    
    // methods
    public void adicionaAlimento(Alimento alimento) {
        this.alimento.add(alimento);
    }
    public void cadastra() {
        this.statusContrato = Contrato.ATIVO;
    }
    public void mostraInfoEstabelecimento() {
        this.mostraInformacaoBasica();
        System.out.println("Contrato: " + this.statusContrato);
        System.out.println("Alimentos:");
        for (Alimento alimento : this.alimento) {
            System.out.println(alimento.getNome());
        }
    }    
}
