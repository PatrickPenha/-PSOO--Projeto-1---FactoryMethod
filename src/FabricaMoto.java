public class FabricaMoto implements InterfaceFabrica {
    @Override
    public InterfaceVeiculo criarVeiculo() {
        return new Moto();
    }
}