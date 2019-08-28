package com.subash.petclinicdata.services.map;

import com.subash.petclinicdata.model.Owner;
import com.subash.petclinicdata.services.OwnerService;

import java.util.Set;

/**
 * Created by subash on 8/26/19.
 */


public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return null;
    }

    @Override
    public Owner findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
