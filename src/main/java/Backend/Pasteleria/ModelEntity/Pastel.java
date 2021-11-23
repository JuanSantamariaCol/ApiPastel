package Backend.Pasteleria.ModelEntity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pastel")
public class Pastel implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idP;
	
	
	@ManyToOne
	@JoinColumn(name = "id")
	private Cliente idCliente;
	
	@Column
	private String sabor;
	
	@Column
	private String fechaEntrega;
	
	@Column
	private int precio;

	
	
	private static final long serialVersionUID = 1L;
	
	public Long getId() {
		return idP;
	}

	public void setId(Long id) {
		this.idP = id;
	}


	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}


}
