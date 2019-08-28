package com.subash.petclinicdata.services;

import java.util.Set;

/**
 * Created by subash on 8/26/19.
 */
public interface CrudService<T,ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
