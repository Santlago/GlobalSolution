import java.time.LocalDate;

import models.Alimento;
import models.BancoDeAlimentos;
import models.EmpresaTransporte;
import models.Endereco;
import models.Estabelecimento;
import models.IAGenerativa;
import models.Itinerario;
import models.Veiculo;

public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println("---------------------------Cadastrando Estabelecimento---------------------------");

        // Creating Estabelecimento1
        Endereco endereco1 = new Endereco("Rua Campos Salles", 690, "Suzano", "SP", "08674-020");
        Estabelecimento estabelecimento1 = new Estabelecimento("Extra", "(11)4747-7817", "11.441.387/0001-38", endereco1);

        // Creating maçã
        Alimento maca = new Alimento("Maçã", 56, 9.8, LocalDate.of(2023, 7, 26));

        // Creating limão
        Alimento limao = new Alimento("Limão", 29, 1.74, LocalDate.of(2023, 8, 4));

        // Showing Estabelecimento informations
        estabelecimento1.mostrarInfoEstabelecimento();

        System.out.println("---------------------------Ativando Contrato do Estabelecimento---------------------------");

        // Registering Estabalecimento
        estabelecimento1.cadastrar();

        // Showing Estabelecimento informations
        estabelecimento1.mostrarInfoEstabelecimento();
        
        System.out.println("---------------------------Adicionando Alimentos ao estabelecimento---------------------------");

        // Adding maçã and limão to Estabelecimento
        estabelecimento1.adicionarAlimento(maca);
        estabelecimento1.adicionarAlimento(limao);

        // Showing Estabelecimento informations
        estabelecimento1.mostrarInfoEstabelecimento();

        System.out.println("---------------------------Informações dos Alimentos adicionados---------------------------");
        maca.mostrarInfoAlimento();
        limao.mostrarInfoAlimento();

        System.out.println("---------------------------Cadastrando Empresa de Transporte---------------------------");
        // Creating EmpresaTransporte

        Endereco endereco2 = new Endereco("Rua Arquiteto Olavo Redig de Campos", 105, "São Paulo", "SP", "04709-000");
        EmpresaTransporte cocacola = new EmpresaTransporte("Coca-Cola", "0800-727-1100", "49.190.159/0001-05", endereco2);

        // Creating Destino address
        Endereco endereco3 = new Endereco("Av. Morvan Dias de Figueiredo", 6157, "São Paulo", "SP", "02170-901");

        // Creating Itinerario
        Itinerario itinerario1 = new Itinerario(endereco2, endereco3);

        // Adding Paradas to this Itinerario
        Endereco endereco4 = new Endereco("Rua Augusta", 123, "São Paulo", "SP", "01234-567");
        Endereco endereco5 = new Endereco("Avenida Paulista", 456, "São Paulo", "SP", "04567-890");
        Endereco endereco6 = new Endereco("Rua Oscar Freire", 789, "São Paulo", "SP", "07890-123");
        itinerario1.adicionaParada(endereco4);
        itinerario1.adicionaParada(endereco5);
        itinerario1.adicionaParada(endereco6);

        // Creating Veiculo
        Veiculo veiculo1 = new Veiculo("BRA2E19", "Volkswagen Delivery 10.160", 6000, itinerario1);

        // Showing EmpresaTransporte
        cocacola.mostraInfoEmpresaTransporte();

        System.out.println("---------------------------Ativando Contrato Empresa de Transporte---------------------------");

        // Registering EmpresaTranporte
        cocacola.cadastrar();

        // Showing EmpresaTransporte
        cocacola.mostraInfoEmpresaTransporte();

        System.out.println("---------------------------Adicionando Veiculo à Empresa de Transporte---------------------------");
        
        // Adding Veiculo EmpresaTransporte
        cocacola.adicionaVeiculo(veiculo1);

        // Showing EmpresaTransporte
        cocacola.mostraInfoEmpresaTransporte();

        System.out.println("---------------------------Informações do Veiculo adicionado---------------------------");

        // Showing Veiculo Informations
        veiculo1.mostrarInfoVeiculo();

        System.out.println("---------------------------Criando IA Generativa---------------------------");

        // Creating IAGenerativa
        IAGenerativa chatgpt = new IAGenerativa("https://chat.openai.com/");
        
        // Showing IAGenerativa informarion
        chatgpt.mostrarInfoIAGenerativa();

        System.out.println("---------------------------Criando Banco de Alimentos---------------------------");

        Endereco endereco7 = new Endereco("Rua Atibaia", 218, "São Paulo", "SP", "01235-010");
        BancoDeAlimentos bancoDeAlimentos1 = new BancoDeAlimentos("ONG Banco de Alimentos", "(11) 3674-0080", "02.736.449/0001-48", endereco7);

        // Showing BancoDeAlimentos information
        bancoDeAlimentos1.mostrarInfoBancoDeAlimentos();

        System.out.println("---------------------------Alterando Itinerário do Veiculo---------------------------");

        // Modifying Itinerario
        chatgpt.criarItinerario(estabelecimento1, veiculo1, bancoDeAlimentos1);

        // Showing Veiculo informations
        veiculo1.mostrarInfoVeiculo();

        System.out.println("---------------------------Fazendo transporte dos alimentos para o Banco de Alimentos---------------------------");

        // Transporting Alimentos to BancoDeDados
        bancoDeAlimentos1.transportarAlimentos(estabelecimento1);

        // Showing BandoDeAlimentos informations
        bancoDeAlimentos1.mostrarInfoBancoDeAlimentos();
    }
}
