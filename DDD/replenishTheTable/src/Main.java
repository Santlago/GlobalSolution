import java.time.LocalDate;

import models.Alimento;
import models.EmpresaTransporte;
import models.Endereco;
import models.Estabelecimento;
import models.Itinerario;
import models.Veiculo;

public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println("---------------------------Cadastrando estabelecimento---------------------------");
        // Creating Estabelecimento1
        Endereco endereco1 = new Endereco("Rua Campos Salles", 690, "Suzano", "SP", "08674-020");
        Estabelecimento estabelecimento1 = new Estabelecimento("Extra", "(11)4747-7817", endereco1);

        // Creating maçã
        Alimento maca = new Alimento("Maçã", 56, LocalDate.of(2023, 7, 26));
        // Creating limão
        Alimento limao = new Alimento("Limão", 29, LocalDate.of(2023, 8, 4));

        // Adding maçã and limão to Estabelecimento
        estabelecimento1.adicionarAlimento(maca);
        estabelecimento1.adicionarAlimento(limao);

        // Registering Estabalecimento
        estabelecimento1.cadastrar();
        
        // Showing Estabelecimento infromations
        estabelecimento1.mostrarInfoEstabelecimento();

        System.out.println("---------------------------Cadastrando Empresa de Transporte---------------------------");
        // Creating EmpresaTransporte
        Endereco endereco2 = new Endereco("Rua Arquiteto Olavo Redig de Campos", 105, "São Paulo", "SP", "04709-000");
        EmpresaTransporte cocacola = new EmpresaTransporte("Coca-Cola", "0800-727-1100", endereco2);

        // Creating Destino address
        Endereco endereco3 = new Endereco("Av. Morvan Dias de Figueiredo", 6157, "São Paulo", "SP", "02170-901");

        // Creating Itinerario
        Itinerario itinerario1 = new Itinerario(endereco2, endereco3);

        // Creating Veiculo
        Veiculo veiculo1 = new Veiculo("BRA2E19", "Volkswagen Delivery 10.160", 6000, itinerario1);

        // Adding Veiculo EmpresaTransporte
        cocacola.adicionaVeiculo(veiculo1);

        // Registering EmpresaTranporte
        cocacola.cadastrar();

        // Showing EmpresaTransporte
        cocacola.mostraInfoEmpresaTransporte();

    }
}
