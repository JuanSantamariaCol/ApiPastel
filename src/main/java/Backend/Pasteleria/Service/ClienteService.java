package Backend.Pasteleria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.Pasteleria.ModelDao.IClienteDao;
import Backend.Pasteleria.ModelEntity.Cliente;

@Service
public class ClienteService implements IClienteService {

	@Autowired
	private IClienteDao clientedao;
	
	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return clientedao.findAll();
	}

	@Override
	public Cliente guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		return clientedao.save(cliente);
	}

	@Override
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return clientedao.findById(id).orElse(null);
	}

	@Override
	public void borrar(Long id) {
		// TODO Auto-generated method stub
		clientedao.deleteById(id);
	}

}
