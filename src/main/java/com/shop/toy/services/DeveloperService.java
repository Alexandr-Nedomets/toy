package com.shop.toy.services;

import com.shop.toy.models.entity.Developer;
import com.shop.toy.repositories.DeveloperRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperService {

    private final DeveloperRepository developerRepository;

    public DeveloperService(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    public List<Developer> findAll() {
        return developerRepository.findAll();
    }

    public Developer findById(Long id) {
        return developerRepository.findById(id).orElse(new Developer(-100500L, "Not found", "Not found"));
    }

    public Developer save(Developer developer) {
        return developerRepository.save(developer);
    }

    public void deleteById(Long id) {
        developerRepository.deleteById(id);
    }
}
