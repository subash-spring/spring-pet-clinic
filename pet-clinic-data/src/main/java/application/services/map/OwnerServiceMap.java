package application.services.map;

import application.model.Owner;
import application.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by subash on 8/26/19.
 */

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
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
