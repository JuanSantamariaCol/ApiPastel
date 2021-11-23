package Backend.Pasteleria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.Pasteleria.ModelDao.IPastelDao;
import Backend.Pasteleria.ModelEntity.Pastel;

@Service
public class PastelService implements IPastelService {

	@Autowired
	private IPastelDao pasteldao;
	
	
	@Override
	public List<Pastel> listar() {
		// TODO Auto-generated method stub
		return pasteldao.findAll();
	}


	@Override
	public Pastel guardar(Pastel pastel) {
		// TODO Auto-generated method stub
		return pasteldao.save(pastel);
	}


	@Override
	public void borrar(Long id) {
		// TODO Auto-generated method stub
		pasteldao.deleteById(id);
	}


	@Override
	public Pastel findById(Long id) {
		// TODO Auto-generated method stub
		return pasteldao.findById(id).orElse(null);
	}

}
