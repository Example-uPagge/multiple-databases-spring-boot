package dev.struchkov.example.multipledatabases.controller;

import dev.struchkov.example.multipledatabases.domain.entity.dbtwo.Lawyer;
import dev.struchkov.example.multipledatabases.repository.dbtwo.LawyerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/lawyer")
public class LawyerController {

    private final LawyerRepository lawyerRepository;

    @PostMapping
    public ResponseEntity<Lawyer> create(@RequestBody Lawyer lawyer) {
        return ResponseEntity.ok(lawyerRepository.save(lawyer));
    }

    @GetMapping("{id}")
    public ResponseEntity<Lawyer> getById(@PathVariable UUID id) {
        return ResponseEntity.ok(lawyerRepository.findById(id).orElseThrow());
    }

    @DeleteMapping("{id}")
    public HttpStatus delete(@PathVariable UUID id) {
        lawyerRepository.deleteById(id);
        return HttpStatus.OK;
    }

}
