package application.services;

import application.model.Owner;


/**
 * Created by subash on 8/25/19.
 */

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
