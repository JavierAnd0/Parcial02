package co.edu.usco.pw.springboot_crud01.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String userName;

    @Size(max = 6, message = "Enter at least 6 characters...")
    private String description;

    private Date targetDate;
    
    
    @DateTimeFormat(pattern = "HH:mm:ss")
    @Column(name = "horaEntrada", nullable = false)
    private Time horaEntrada;

    @DateTimeFormat(pattern = "HH:mm:ss")
    @Column(name = "horaSalida", nullable = false)
    private Time horaSalida;

    @Column(name = "ubicacion", nullable = false)
    private String ubicacion;

    @Column(name = "tipoVehiculo", nullable = false)
    private String tipoVehiculo;

    public Todo() {
        
    }
    
    public Todo(String user, String desc, Date targetDate, boolean isDone, Time horaEntrada, Time horaSalida, String ubicacion, String tipoVehiculo) {
		super();
		this.userName = user;
		this.description = desc;
		this.targetDate = targetDate;
		//falta terminar
	}
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
}
