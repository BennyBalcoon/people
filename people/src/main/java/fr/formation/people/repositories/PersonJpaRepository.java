package fr.formation.people.repositories;

import fr.formation.people.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJpaRepository extends JpaRepository<Person, Long> {
    //
}
