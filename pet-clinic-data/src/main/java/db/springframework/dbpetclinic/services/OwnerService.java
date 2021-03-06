package db.springframework.dbpetclinic.services;

import db.springframework.dbpetclinic.model.Owner;


import java.util.List;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
 }
