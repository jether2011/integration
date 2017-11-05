package com.jetherrodrigues.resources;

import static com.jetherrodrigues.util.VersionUtil.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jetherrodrigues.model.Client;
import com.jetherrodrigues.response.ClientResponse;
import com.jetherrodrigues.service.ClientService;

@RestController
@RequestMapping(value = { REST_APP + VERSION_V1 + CLIENT })
public class ClientResource {
	@Autowired
	private ClientService clientService;

	@GetMapping
	public ResponseEntity<List<Client>> getAllClient() {
		return ResponseEntity.status(HttpStatus.OK).body(clientService.findAll());
	}
	
	@GetMapping("cpf/{cpf}")
	public ResponseEntity<ClientResponse> getClientByCpf(@PathVariable String cpf) {
		return ResponseEntity.status(HttpStatus.OK).body(new ClientResponse(clientService.findByCpf(cpf)));
	}
	
	@PostMapping
	public ResponseEntity<?> insertClientInDataBaseAndValidateCPFBefore(@RequestBody Client client){
		clientService.save(client);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
