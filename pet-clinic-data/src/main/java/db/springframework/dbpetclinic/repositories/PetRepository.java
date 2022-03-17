package db.springframework.dbpetclinic.repositories;

import db.springframework.dbpetclinic.model.Pet;

import org.springframework.data.repository.CrudRepository;


public interface PetRepository extends CrudRepository<Pet, Long> {
}
