package Backend.Pasteleria.ModelDao;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Pasteleria.ModelEntity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente , Long> {
	
	
}
