package db.springframework.dbpetclinic.repositories;

import db.springframework.dbpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;


public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
