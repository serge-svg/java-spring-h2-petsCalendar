package svg.tutorialspoint.petscalendar.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Pet {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private LocalDate birthDate;
    @Column
    private String ownerEmail;
}
