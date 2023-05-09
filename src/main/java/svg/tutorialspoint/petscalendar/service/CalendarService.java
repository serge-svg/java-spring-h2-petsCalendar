package svg.tutorialspoint.petscalendar.service;

import org.springframework.stereotype.Service;
import svg.tutorialspoint.petscalendar.repositories.AppointmentsRepository;
import svg.tutorialspoint.petscalendar.repositories.PetsRepository;

@Service
public class CalendarService {

    AppointmentsRepository appointmentsRepository;

    public CalendarService(AppointmentsRepository appointmentsRepository) {
        this.appointmentsRepository = appointmentsRepository;
    }


}
