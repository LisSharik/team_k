package com.riwi.springboot_filter_teams.api.controllers.basic_controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public interface DeleteMethodController {

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a", description = "Devuelve todos los usuarios.")
    public ResponseEntity<Void> delete(@PathVariable Long id);
}
