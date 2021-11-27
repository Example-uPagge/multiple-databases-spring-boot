package dev.struchkov.example.multipledatabases.controller;

import dev.struchkov.example.multipledatabases.domain.entity.dbone.Judge;
import dev.struchkov.example.multipledatabases.repository.dbone.JudgeRepository;
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
@RequestMapping("api/judge")
public class JudgeController {
    
    private final JudgeRepository judgeRepository;

    @PostMapping
    public ResponseEntity<Judge> create(@RequestBody Judge judge) {
        return ResponseEntity.ok(judgeRepository.save(judge));
    }

    @GetMapping("{id}")
    public ResponseEntity<Judge> getById(@PathVariable UUID id) {
        return ResponseEntity.ok(judgeRepository.findById(id).orElseThrow());
    }

    @DeleteMapping("{id}")
    public HttpStatus delete(@PathVariable UUID id) {
        judgeRepository.deleteById(id);
        return HttpStatus.OK;
    }

    
}
