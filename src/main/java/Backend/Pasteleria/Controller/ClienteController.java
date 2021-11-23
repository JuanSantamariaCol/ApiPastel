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

import Backend.Pasteleria.ModelEntity.Cliente;

import Backend.Pasteleria.Service.IClienteService;


@CrossOrigin(origins = "*",allowedHeaders="*")
@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	private IClienteService clienteservice;
	
	@GetMapping("/cliente")
	public List<Cliente> listar(){
		return clienteservice.listar();
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente buscar(@PathVariable Long id) {
		return clienteservice.findById(id);
	}
	
	@PostMapping("/cliente")
	public Cliente guardar(@RequestBody Cliente cliente) {
		return clienteservice.guardar(cliente);
	}
	
	@DeleteMapping("/cliente/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Long id) {
		clienteservice.borrar(id);
	}
	
	@PutMapping("/cliente/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
		Cliente actual  = clienteservice.findById(id);
		actual.setApellido(cliente.getApellido());
		actual.setNombre(cliente.getNombre());
		actual.setEdad(cliente.getEdad());
		return clienteservice.guardar(actual);
	}
	
	
}
