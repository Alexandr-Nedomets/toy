package com.shop.toy.controllers;

import com.shop.toy.models.entity.Developer;
import com.shop.toy.services.DeveloperService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/developers")
public class DeveloperController {

    private final DeveloperService developerService;

    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('read')")
    public List<Developer> findAll() {
        return developerService.findAll();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('read')")
    public Developer findById(@PathVariable(value = "id") Long id) {
        return developerService.findById(id);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('write')")
    public Developer save(@RequestBody Developer developer) {
        return developerService.save(developer);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('write')")
    public void deleteById(@PathVariable(value = "id") Long id) {
        developerService.deleteById(id);
    }
}
