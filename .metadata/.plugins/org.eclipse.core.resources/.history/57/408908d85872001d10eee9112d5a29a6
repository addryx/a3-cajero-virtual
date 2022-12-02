package modelo.entitybeans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


/**
 * The persistent class for the movimientos database table.
 * 
 * @Entity significa que es una entidad. 
 * @Table + el nombre de la tabla, para que los relacione. 
 * 
 */
@Entity
@Table(name="movimientos")
public class Movimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	/*
	 * Este valor es un generador de claves así que le ponemos identity, para que sea auto-increment.
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_movimiento")
	private int idMovimiento;

	private double cantidad;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String operacion;

	//bi-directional many-to-one association to Cuenta
	@ManyToOne
	@JoinColumn(name="id_cuenta")
	private Cuenta cuenta;

	public Movimiento() {
	}
	

	public Movimiento(int idMovimiento, double cantidad, Date fecha, String operacion, Cuenta cuenta) {
		super();
		this.idMovimiento = idMovimiento;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.operacion = operacion;
		this.cuenta = cuenta;
	}



	public int getIdMovimiento() {
		return this.idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public double getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getOperacion() {
		return this.operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idMovimiento);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Movimiento))
			return false;
		Movimiento other = (Movimiento) obj;
		return idMovimiento == other.idMovimiento;
	}


	@Override
	public String toString() {
		return "Movimiento [idMovimiento=" + idMovimiento + ", cantidad=" + cantidad + ", fecha=" + fecha
				+ ", operacion=" + operacion + ", cuenta=" + cuenta + "]";
	}

	
}