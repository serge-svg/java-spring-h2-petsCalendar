package svg.tutorialspoint.petscalendar.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "APPOINTMENTS")
public class Appointment {

    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "PET_ID")
    private Pet pet;
    @Column
    private String description;
    @Column(name = "START_DATE")
    private Timestamp starDate;
    @Column(name = "END_DATE")
    private Timestamp endDate;
    @Column
    private String address;
    @Column
    private BigDecimal price;

}