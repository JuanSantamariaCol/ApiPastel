package Backend.Pasteleria.ModelDao;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Pasteleria.ModelEntity.Pastel;

public interface IPastelDao extends JpaRepository<Pastel, Long> {

}
