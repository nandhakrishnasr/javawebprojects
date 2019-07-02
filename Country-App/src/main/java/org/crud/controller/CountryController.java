package org.crud.controller;

import java.util.Optional;

import org.crud.entity.Country;
import org.crud.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	CountryRepository countryRepository;

	@PostMapping("/add")
	public Country addCountry(@RequestBody Country country) {

		return countryRepository.save(country);
	}

	@GetMapping("/all")
	public Iterable<Country> allCountry() {

		return countryRepository.findAll();
	}

	
	@GetMapping("/{countryId}")
	public Optional<Country> countryById(@PathVariable("countryId") int countryId) {

		return countryRepository.findById(countryId);
	}

	
	@PutMapping("/update")
	public Country updateCountry(@RequestBody Country country) {

		return countryRepository.save(country);
	}

	@DeleteMapping("/{countryId}")
	public void deleteCountry(@PathVariable("countryId") int countryId) {

		countryRepository.deleteById(countryId);
	}
}
