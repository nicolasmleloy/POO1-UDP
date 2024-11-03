package visao;

import java.util.ArrayList;

import dominio.Veiculo;
import servico.VeiculoServico;

public class VeiculoMenu extends BaseMenu {

    private VeiculoServico servico;

    public VeiculoMenu(){
        super();
        this.servico = new VeiculoServico();
    }

    public void ImprimirPorLinha(Veiculo veiculo){
        String impressao = "";
        impressao += "Veiculo: ";
        impressao += "Código: " + veiculo.getCodigo() + " | ";
        impressao += "Marca: " + veiculo.getMarca() + " | ";
        impressao += "Modelo: " + veiculo.getModelo() + " | ";
        impressao += "Ano de fabricação: " + veiculo.getAnoFabricacao() + " | ";
        impressao += "Preço: " + veiculo.getPreco() + " | ";
        System.out.println(impressao);
    }

    @Override
    public void ExibirMenu() {
        while (true) {
            try {
            int opcao = 0;
        
                do {
                    Util.LimparConsole();
                    System.out.println("Bem vindo ao sistema de CADADSTRO DE VEICULOS:");
                    System.out.println("1 - Listar");
                    System.out.println("2 - Localizar");
                    System.out.println("3 - Adicionar");
                    System.out.println("4 - Atualizar");
                    System.out.println("5 - Deletar");
                    System.out.println("6 - Sair");
        
                    System.out.print("Selecione uma opção: ");
                    opcao = this.scanner.nextInt();
        
                    switch (opcao) {
                        case 1:
                            this.Listar();
                            break;
                        case 2:
                            this.Localizar();
                            break;
                        case 3:
                            this.Adicionar();
                            break;
                        case 4:
                            this.Atualizar();
                            break;
                        case 5:
                            this.Deletar();
                            break;
                        case 6:
                            System.out.println("Saindo do sistema...");
                            break;
                        default:
                            System.out.println("Opçao inválida!");
                            break;
                    }
                } while (opcao != 6);
                break;
            } catch(Exception e) {
                System.out.println("Ocorreu uma excessão, tente novamente!");
                this.scanner.nextLine();
            }
        }
    }

    @Override
    public void Listar() {
        Util.LimparConsole();
        System.out.println("Listando...");

        ArrayList<Veiculo> lista = this.servico.Navegar();
        for (Veiculo veiculo : lista) {
            this.ImprimirPorLinha(veiculo);
        }

        System.out.println("Clique <ENTER> para continuar!");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Localizar() {
        Util.LimparConsole();
        System.out.println("Localizando...");

        System.out.print("Informe o codigo do veículo: ");
        int codigo = this.scanner.nextInt();
        Veiculo veiculo = this.servico.Ler(codigo);

        if(veiculo != null){
            this.ImprimirPorLinha(veiculo);
        }else{
            System.out.println("Veiculo não encontrado...");
        }

        System.out.println("Clique <ENTER> para continuar!");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Adicionar() {
        Util.LimparConsole();
        System.out.println("Adicionando...");

        Veiculo veiculo = new Veiculo();
        System.out.print("Informe a MARCA: ");
        String marca = this.scanner.next();
        veiculo.setMarca(marca);

        System.out.print("Informe a MODELO: ");
        String modelo = this.scanner.next();
        veiculo.setModelo(modelo);

        System.out.print("Informe o ANO DE FABRICAÇÃO: ");
        int anoDeFabricacao = this.scanner.nextInt();
        veiculo.setAnoFabricacao(anoDeFabricacao);

        System.out.print("Informe o PREÇO: ");
        Double preco = this.scanner.nextDouble();
        veiculo.setPreco(preco);

        if(this.servico.Adicionar(veiculo) != null){
            System.out.println("Veiculo adicionado com sucesso!");
        }else{
            System.out.println("Problema - Houve um erro ao adicionar um veiculo...");
        }

        System.out.println("Clique <ENTER> para continuar!");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Atualizar() {
        Util.LimparConsole();
        System.out.println("Atualizando...");

        ArrayList<Veiculo> lista = this.servico.Navegar(); //Mostrando os veiculos
        for (Veiculo veiculo : lista) {
            this.ImprimirPorLinha(veiculo);
        }

        System.out.print("Informe o CÓDIGO do veiculo que deseja atualizar: ");
        int codigo = this.scanner.nextInt();
        Veiculo veiculo = this.servico.Ler(codigo);

        if(veiculo != null){
            while (true) {
                try{
                    System.out.println("Informe o que deseja alterar: ");
                    System.out.println("1 - Marca");
                    System.out.println("2 - Modelo");
                    System.out.println("3 - Ano de fabricação");
                    System.out.println("4 - Preço");
                    System.out.print("Opção: ");
                    int opcao = this.scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.print("Informe a nova MARCA: ");
                            String marca = this.scanner.next();
                            veiculo.setMarca(marca);
                            break;
                        case 2:
                            System.out.print("Informe o novo MODELO: ");
                            String modelo = this.scanner.next();
                            veiculo.setModelo(modelo);
                            break;
                        case 3:
                            System.out.print("Informe o novo ANO DE FABRICAÇÃO: ");
                            int anoDeFabricacao = this.scanner.nextInt();
                            veiculo.setAnoFabricacao(anoDeFabricacao);
                            break;
                        case 4:
                            System.out.print("Informe o novo PREÇO: ");
                            double preco = this.scanner.nextDouble();
                            veiculo.setPreco(preco);
                        default:
                            break;
                    }
                    break;
                }catch(Exception e){
                    System.out.println("Ocorreu uma excessão, tente novamente!");
                    this.scanner.nextLine();
                }
            }
            if(this.servico.Editar(veiculo) != null){
                System.out.println("Alteração realizada com sucesso!");
            }else{
                System.out.println("Problema - veiculo não encontrado!");
            }
        }else{
            System.out.println("Problema - veiculo não encontrado!");
        }

        System.out.println("Clique <ENTER> para continuar!");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Deletar() {
        Util.LimparConsole();
        System.out.println("Removendo...");

        ArrayList<Veiculo> lista = this.servico.Navegar(); 
        for (Veiculo veiculo : lista) {
            this.ImprimirPorLinha(veiculo); //Mostrando os veiculos
        }

        System.out.print("Informe o veiculo no qual deseja DELETAR: ");
        int codigo = this.scanner.nextInt();
        Veiculo veiculo = this.servico.Ler(codigo);

        if(veiculo != null){
            if(this.servico.Deletar(codigo) != null){
                System.out.println("Veiculo excluído com sucesso!");
            }else{
                System.out.println("Problema - Houve um erro ao excluír um veiculo...");
            }
        }else{
            System.out.println("Problema - Veículo não encontrado!");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }
    
}
