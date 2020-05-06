package fr.formation.people.repositories;

import fr.formation.people.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressJpaRepository extends JpaRepository<Address, Long> {
    //
}
