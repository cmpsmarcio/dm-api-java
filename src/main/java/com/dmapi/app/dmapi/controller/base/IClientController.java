package com.dmapi.app.dmapi.controller.base;

import com.dmapi.app.dmapi.domain.Client;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("v1/client")
public interface IClientController {
    @Operation(summary = "Seleciona a lista de clientes")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode="200",
                    description = "Retorna lista de todos os clientes",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Client[].class)
                            )
                    }),
            @ApiResponse(
                    responseCode = "404",
                    description = "Cadastro não encontrado",
                    content = @Content
            )
    })
    @GetMapping
    List<Client> getClient();

    @Operation(summary = "Seleciona o cliente pelo ID")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Retorna o cadastro do cliente",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Client.class)
                            )
                    }
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "Cadastro não encontrado",
                    content = @Content
            )
    })
    @GetMapping(value = "/{Id}")
    Optional<Client> getClientById(@PathVariable("Id") UUID Id);


}
