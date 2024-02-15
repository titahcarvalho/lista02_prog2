package questao17_PadroesdeProjeto;

public class FabricaFiat extends FabricaDeCarro {
	
	@Override
	public CarroSedan criarCarroSedan() {
			return new Siena(); //IMPORTANTE
	}
	@Override
	public CarroPopular criarCarroPopular() {
		return new Palio();
		
	}

}
