package com.jetherrodrigues.model;

import java.io.Serializable;

import javax.persistence.*;

import com.jetherrodrigues.util.GsonSingleton;

@Entity
@Table(name = "client", uniqueConstraints = { @UniqueConstraint(columnNames = "client_id", name = "pk_client") })
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8732790294987116797L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "client_id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "cpf")
	private String cpf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return GsonSingleton.getInstance().toJson(this);
	}

}
