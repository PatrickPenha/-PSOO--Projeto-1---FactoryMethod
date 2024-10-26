public class Main {
    public static void main(String[] args) {
        InterfaceFabrica fabricaCarro = new FabricaCarro();
        InterfaceVeiculo carro = fabricaCarro.criarVeiculo();
        carro.exibirInfo();

        InterfaceFabrica fabricaMoto = new FabricaMoto();
        InterfaceVeiculo moto = fabricaMoto.criarVeiculo();
        moto.exibirInfo();

        InterfaceFabrica fabricaCaminhao = new FabricaCaminhao();
        InterfaceVeiculo caminhao = fabricaCaminhao.criarVeiculo();
        caminhao.exibirInfo();
    }
}