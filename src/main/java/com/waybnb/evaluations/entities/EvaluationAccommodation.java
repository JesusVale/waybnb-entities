package com.waybnb.evaluations.entities;

import com.waybnb.accomodations.entities.Accommodation;
import com.waybnb.users.entities.User;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "evaluation_accommodations")
public class EvaluationAccommodation {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer evaluationAccommodationId;

    @ManyToOne
    @JoinColumn(name = "evaluator")
    private User evaluator;

    @ManyToOne
    @JoinColumn(name = "accomodation")
    private Accommodation accomodation;

    @Column
    private LocalDate date;

    @Column
    private Float score;

    @Column
    private String comment;

}
