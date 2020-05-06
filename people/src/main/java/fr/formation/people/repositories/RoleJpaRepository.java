package fr.formation.people.repositories;

import fr.formation.people.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleJpaRepository extends JpaRepository<Role, Long> {

    // récupérer le rôle par défaut
    // select * from roles where default_role = true;
    // pas besoin d'implémenter la méthode, tout est déduit du nom de sa déclaration

    Role findByDefaultRoleTrue();
}
