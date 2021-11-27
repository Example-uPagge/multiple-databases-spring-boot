package dev.struchkov.example.multipledatabases.domain.entity.dbone;

import dev.struchkov.example.multipledatabases.domain.Person;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
@Getter
@Setter
public class Judge extends Person {

}
