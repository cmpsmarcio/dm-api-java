package com.dmapi.app.dmapi.infrastructure.repository;

import com.dmapi.app.dmapi.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface IClientRepository extends JpaRepository<Client, UUID> {

}
