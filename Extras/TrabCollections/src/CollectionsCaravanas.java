import java.util.List;
import java.util.stream.Collectors;

public class CollectionsCaravanas {
	private CaravanasDAO arqCaravanas;
	
	
	public List<Caravanas> getLista() {
		return lista;
	}

	private List<Caravanas> lista;
	
	public CollectionsCaravanas(){
		
	}
	
	public List<Caravanas> getCaravanasByLocalTuristico(String nome){
		lista = arqCaravanas.readFromFile();
		return lista.stream().filter(car -> car.getLocal().getNome().equals(nome)).collect(Collectors.toList());
	}
	
}
