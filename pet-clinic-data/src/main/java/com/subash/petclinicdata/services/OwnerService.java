package com.subash.petclinicdata.services;

import com.subash.petclinicdata.model.Owner;


/**
 * Created by subash on 8/25/19.
 */
public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
