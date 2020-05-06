package fr.formation.people.services;

import fr.formation.people.dtos.PersonCreateDto;
import fr.formation.people.dtos.PersonDto;

import java.util.List;

public interface PersonService {
    void create(PersonCreateDto dto);

    void delete(Long id);

    PersonDto get(Long id);

    List<PersonDto> getAll();
}
