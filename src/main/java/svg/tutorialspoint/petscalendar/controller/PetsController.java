package svg.tutorialspoint.petscalendar.controller;

import org.springframework.web.bind.annotation.*;
import svg.tutorialspoint.petscalendar.entity.Pet;
import svg.tutorialspoint.petscalendar.service.PetsService;

import java.util.List;

@RestController
@RequestMapping(path="/pets")
public class PetsController {

    PetsService petsService;

    public PetsController(PetsService petsService) {
        this.petsService = petsService;
    }

    @GetMapping("")
    public List<Pet> getAll() {
        return null;
    }

    @GetMapping("{id}")
    public List<Pet> getPet(@PathVariable("id") int id) {
        return null;
    }

    @PostMapping
    public void addPet(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "birthDate") String birthDate,
            @RequestParam(name = "ownerEmail") String ownerEmail){

    }

    @DeleteMapping
    public void deletePet(@PathVariable("id") int id) {

    }

    @PutMapping
    public void updatePet(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "birthDate") String birthDate,
            @RequestParam(name = "ownerEmail") String ownerEmail){

    }

}
