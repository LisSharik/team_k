package com.riwi.springboot_filter_teams.api.controllers.basic_controllers;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface GetAllMethodController<RBS> {
    @GetMapping
    public ResponseEntity<Page<RBS>> getAll(
        @RequestParam(defaultValue = "1") int page,
        @RequestParam(defaultValue = "10") int size

    );
}
