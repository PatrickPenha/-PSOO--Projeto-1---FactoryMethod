public class FabricaCarro implements InterfaceFabrica {
    @Override
    public InterfaceVeiculo criarVeiculo() {
        return new Carro();
    }
}