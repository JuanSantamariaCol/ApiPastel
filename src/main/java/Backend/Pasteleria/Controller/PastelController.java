package Backend.Pasteleria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Backend.Pasteleria.ModelEntity.Pastel;
import Backend.Pasteleria.Service.IPastelService;

@CrossOrigin(origins = "*",allowedHeaders="*")
@RestController
@RequestMapping("/api")
public class PastelController {
	
	@Autowired
	private IPastelService pastelservice;
	
	@GetMapping("/pastel")
	public List<Pastel> listar(){
		
		return pastelservice.listar();
		
	}
	
	@GetMapping("/pastel/{id}")
	public Pastel buscar(@PathVariable Long id) {
		return pastelservice.findById(id);
	}
	
	
	@PostMapping("/pastel")
	public Pastel guardar(@RequestBody Pastel pastel) {
		return pastelservice.guardar(pastel);
	}
	
	@DeleteMapping("/pastel/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Long id) {
		pastelservice.borrar(id);
	}
	
	@PutMapping("/pastel/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Pastel update(@RequestBody Pastel pastel, @PathVariable Long id) {
		Pastel actual = pastelservice.findById(id);
		actual.setPrecio(pastel.getPrecio());
		actual.setFechaEntrega(pastel.getFechaEntrega());
		actual.setSabor(pastel.getSabor());
		return pastelservice.guardar(actual);
	}
	
	

	
}
