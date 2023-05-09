package svg.tutorialspoint.petscalendar.service;

import org.springframework.stereotype.Service;
import svg.tutorialspoint.petscalendar.repositories.PetsRepository;

@Service
public class PetsService {

    PetsRepository petsRepository;

    public PetsService(PetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }



}
