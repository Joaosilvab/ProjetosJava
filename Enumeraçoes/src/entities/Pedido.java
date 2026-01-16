package entities;

import java.util.Date;

import entities.enums.PedidoStatus;

public class Pedido {

	private Integer id;
	private Date moment;
	private PedidoStatus pstatus;
	
	public Pedido() {
	}

	public Pedido(Integer id, Date moment, PedidoStatus pstatus) {
		this.id = id;
		this.moment = moment;
		this.pstatus = pstatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public PedidoStatus getPstatus() {
		return pstatus;
	}

	public void setPstatus(PedidoStatus pstatus) {
		this.pstatus = pstatus;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", moment=" + moment + ", pstatus=" + pstatus + "]";
	}
	
	
	
	
	
	
	
	
	
}


