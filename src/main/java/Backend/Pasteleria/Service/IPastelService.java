package Backend.Pasteleria.Service;

import java.util.List;

import Backend.Pasteleria.ModelEntity.Pastel;

public interface IPastelService {

	public List<Pastel> listar();
	public Pastel guardar(Pastel pastel);
	public void borrar(Long id);
	public Pastel findById(Long id);
}
