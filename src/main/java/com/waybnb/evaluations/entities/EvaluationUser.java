package com.waybnb.evaluations.entities;

import com.waybnb.users.entities.User;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "evaluation_users")
public class EvaluationUser {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer evaluationUserId;

    @ManyToOne
    @JoinColumn(name = "evaluator")
    private User evaluator;

    @ManyToOne
    @JoinColumn(name = "evaluated")
    private User evaluated;

    @Column
    private LocalDate date;

    @Column
    private Float score;

    @Column
    private String comment;

}
