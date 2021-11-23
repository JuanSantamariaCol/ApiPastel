package Backend.Pasteleria.Service;

import java.util.List;

import Backend.Pasteleria.ModelEntity.Cliente;

public interface IClienteService {

	public List<Cliente> listar();
	public Cliente guardar (Cliente cliente);
	public void borrar(Long id);
	public Cliente findById(Long id);
	
}
