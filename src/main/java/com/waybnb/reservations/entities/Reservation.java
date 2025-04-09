package com.waybnb.reservations.entities;

import com.waybnb.accomodations.entities.Accommodation;
import com.waybnb.reservations.enums.ReservationStatus;
import com.waybnb.users.entities.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservationId;

    @ManyToOne
    @JoinColumn(name = "accommodation_id")
    private Accommodation accommodation;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDate endDate;

    @Column
    private Integer cost;

    @ManyToOne
    @JoinColumn(name = "guest")
    private User guest;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;

}
