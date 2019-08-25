package services;

import model.Owner;

import java.util.Set;

/**
 * Created by subash on 8/25/19.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
