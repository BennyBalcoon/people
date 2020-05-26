package fr.formation.people.repositories;

import fr.formation.people.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddressJpaRepository extends JpaRepository<Address, Long> {

    List<Address> findByCity(@Param("city") String city);
}
