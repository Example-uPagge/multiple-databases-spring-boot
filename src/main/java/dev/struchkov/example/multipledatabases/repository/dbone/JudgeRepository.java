package dev.struchkov.example.multipledatabases.repository.dbone;

import dev.struchkov.example.multipledatabases.domain.entity.dbone.Judge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JudgeRepository extends JpaRepository<Judge, UUID> {

}