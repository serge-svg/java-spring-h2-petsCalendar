package svg.tutorialspoint.petscalendar.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private int petId;
    @Column
    private LocalDate starDate;
    @Column
    private LocalDate endDate;
    @Column
    private String address;
    @Column
    private double price;

}
