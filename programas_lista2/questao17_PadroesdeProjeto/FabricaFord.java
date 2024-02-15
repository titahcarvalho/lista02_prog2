package questao17_PadroesdeProjeto;

public class FabricaFord extends FabricaDeCarro {
	@Override
	public CarroPopular criarCarroPopular() {
		return new FiestaSedan();
	}
	@Override
	public CarroSedan criarCarroSedan() {
		return new Fiesta();
	}
}
