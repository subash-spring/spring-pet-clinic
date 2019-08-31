package application.services.map;

import application.model.PetType;
import application.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by subash on 8/31/19.
 */

@Service
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {


    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
