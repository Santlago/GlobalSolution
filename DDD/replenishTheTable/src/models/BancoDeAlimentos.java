package models;

import java.util.ArrayList;
import java.util.List;

public class BancoDeAlimentos extends Empresa {
    
    // attributes
    private List<Alimento> alimentos;

    // constructor
    public BancoDeAlimentos(String nome, String telefone, String cnpj, Endereco endereco) {
        super(nome, telefone, cnpj, endereco);
        this.alimentos = new ArrayList<>();
        //TODO Auto-generated constructor stub
    }

    // methods
    public void mostrarInfoBancoDeAlimentos() {
        this.mostrarInfoEmpresa();
        System.out.println("Alimentos recebidos: ");
        
        if (alimentos != null) {
            for (Alimento alimento : this.alimentos) {
                System.out.println("    " + alimento.getNome());
            }
        } else {
            System.out.println("    Ainda não há alimentos disponíveis no banco de alimentos.");
        }
    } 
    public void transportarAlimentos(Estabelecimento estabelecimento) {
        for(Alimento alimento : estabelecimento.getAlimento()) {
            this.alimentos.add(alimento);
        }
    }  
}
