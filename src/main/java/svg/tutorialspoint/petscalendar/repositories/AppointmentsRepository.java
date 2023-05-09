package svg.tutorialspoint.petscalendar.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import svg.tutorialspoint.petscalendar.entity.Appointment;

@Repository
public interface AppointmentsRepository extends CrudRepository <Appointment, Integer>{
}
