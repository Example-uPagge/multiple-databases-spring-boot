package dev.struchkov.example.multipledatabases.repository.dbtwo;

import dev.struchkov.example.multipledatabases.domain.entity.dbtwo.Lawyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LawyerRepository extends JpaRepository<Lawyer, UUID> {

}
