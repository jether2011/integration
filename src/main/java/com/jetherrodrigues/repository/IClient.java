package com.jetherrodrigues.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jetherrodrigues.model.Client;

public interface IClient extends JpaRepository<Client, Long>{

}
