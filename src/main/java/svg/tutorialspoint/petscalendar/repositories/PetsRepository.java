package svg.tutorialspoint.petscalendar.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import svg.tutorialspoint.petscalendar.entity.Pet;

@Repository
public interface PetsRepository extends CrudRepository <Pet, Integer>{
}
