package br.com.semasantos.cursomc.resources.exceptions;

import java.io.Serializable;

public class ErroPadrao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	private Long instante;
	
	public ErroPadrao(Integer status, String msg, Long instante) {
		super();
		this.status = status;
		this.msg = msg;
		this.instante = instante;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getInstante() {
		return instante;
	}

	public void setInstante(Long instante) {
		this.instante = instante;
	}
	
	
	

}
