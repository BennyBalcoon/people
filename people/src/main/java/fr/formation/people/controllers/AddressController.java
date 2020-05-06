package fr.formation.people.controllers;

import javax.validation.Valid;

import fr.formation.people.dtos.AddressDto;
import fr.formation.people.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.formation.people.dtos.AddressCreateDto;

import java.util.List;

@RestController
@RequestMapping("/addresses")
@CrossOrigin
public class AddressController {

	// Injecte une instance de AddressServiceImpl
	// AddressServiceImpl doit être annotée @Service
	// @Autowired ou par constructeur
	private final AddressService service;

	// Injection par constructeur, permet de marquer
	// le champ service comme final (non réassignable)
	public AddressController(AddressService service) {
		this.service = service;
	}

	@DeleteMapping("/{id}") // DELETE "/addresses/1" où 1 correspond à l'id d'une adresse existante en bdd
	public void delete(@PathVariable("/{id}") Long id) {
		service.delete(id);
	}

	@GetMapping("/{id}") // GET "/addresses/1" où 1 correspond à l'id d'une adresse existante en bdd
	public AddressDto get(@PathVariable("id") Long id) {
		return service.get(id);
	}
	
	@PostMapping // POST "/addresses" avec un JSON dans le corps de la requête
	public void create(@RequestBody @Valid AddressCreateDto dto) {
		service.create(dto);
	}

	@GetMapping // Get "/addresses" pas d'id, retourne toute la collection de ressources
	public List<AddressDto> getAll() {
		return service.getAll();
	}
}
