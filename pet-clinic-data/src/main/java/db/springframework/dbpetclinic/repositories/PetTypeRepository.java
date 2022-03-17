package db.springframework.dbpetclinic.repositories;

import db.springframework.dbpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;


public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
