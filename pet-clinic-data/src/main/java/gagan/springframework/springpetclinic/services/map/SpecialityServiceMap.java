package gagan.springframework.springpetclinic.services.map;

import gagan.springframework.springpetclinic.model.Speciality;
import gagan.springframework.springpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtyService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }
}
