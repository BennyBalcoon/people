package fr.formation.people.services;

import fr.formation.people.dtos.AddressCreateDto;
import fr.formation.people.dtos.AddressDto;

import java.util.List;

public interface AddressService {
    void create(AddressCreateDto dto);

    void delete(Long id);

    AddressDto get(Long id);

    List<AddressDto> getAll();

    List<AddressDto> getAllByCity(String city);

}
