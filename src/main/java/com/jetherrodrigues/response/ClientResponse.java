package com.jetherrodrigues.response;

import com.jetherrodrigues.model.Client;

public final class ClientResponse {
	private String name;
	private String email;
	private String cpf;
	
	public ClientResponse(Client client) {
		this.name = client.getName();
		this.email = client.getEmail();
		this.cpf = client.getCpf();
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}
	
}
