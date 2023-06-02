package models;

import java.util.ArrayList;
import java.util.List;

public class BancoDeAlimentos extends Empresa {
    
    // attributes
    private List<Alimento> alimentosRecolhidos;

    // constructor
    public BancoDeAlimentos(String nome, String telefone, String cnpj, Endereco endereco) {
        super(nome, telefone, cnpj, endereco);
        this.alimentosRecolhidos = new ArrayList<>();
        //TODO Auto-generated constructor stub
    }

    // methods
    public void transportarAlimentos(Estabelecimento estabelecimento) {
        for(Alimento alimento : estabelecimento.getAlimentos()) {
            this.alimentosRecolhidos.add(alimento);
        }
    }  
    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println(this.endereco.InfoEndereco());
        System.out.println("Alimentos recebidos: ");
        if (alimentosRecolhidos != null) {
            for (Alimento alimento : this.alimentosRecolhidos) {
                System.out.println("    " + alimento.getNome());
            }
        } else {
            System.out.println("    Ainda não há alimentos disponíveis no banco de alimentos.");
        }
    } 
}
