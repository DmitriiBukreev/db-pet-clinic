package db.springframework.dbpetclinic.repositories;

import db.springframework.dbpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;


public interface VisitRepository extends CrudRepository<Visit, Long> {
}
