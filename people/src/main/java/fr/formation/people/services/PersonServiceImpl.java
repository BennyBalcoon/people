package fr.formation.people.services;

import fr.formation.people.dtos.PersonCreateDto;
import fr.formation.people.dtos.PersonDto;
import fr.formation.people.entities.Person;
import fr.formation.people.repositories.AddressJpaRepository;
import fr.formation.people.repositories.PersonJpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonJpaRepository personRepository;

    private final AddressJpaRepository addressRepository;

    public PersonServiceImpl(PersonJpaRepository personRepository, AddressJpaRepository addressRepository) {
        this.personRepository = personRepository;
        this.addressRepository = addressRepository;
    }


    @Override
    public void create(PersonCreateDto dto) {
        Person person = new Person();
        person.setFirstName(dto.getFirstName());
        person.setLastName(dto.getLastName());
        person.setBirthDate(dto.getBirthDate());
        person.setAddress(addressRepository.getOne(dto.getAddressId()));
        personRepository.save(person); // insert into persons values (dto...)
    }

    @Override
    public void delete(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public PersonDto get(Long id) {
         Person person = personRepository.findById(id).get();
         return convertFrom(person);
    }

    @Override
    public List<PersonDto> getAll() {
        List<Person> persons = personRepository.findAll();
        List<PersonDto> dtos = new ArrayList<>();
        for (Person person :
                persons) {
            PersonDto dto = convertFrom(person);
            dtos.add(dto);
        }
        return dtos;
    }

    private PersonDto convertFrom(Person person) {
        PersonDto dto = new PersonDto();
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        return dto;
    }
}
