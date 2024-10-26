public class FabricaCaminhao implements InterfaceFabrica {
    @Override
    public InterfaceVeiculo criarVeiculo() {
        return new Caminhao();
    }
}