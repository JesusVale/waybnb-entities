package com.waybnb.users.entities;

import com.waybnb.accomodations.entities.Accommodation;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column
    private String name;

    @Column
    private LocalDate birthday;

    @Column
    private Float score;

    @Column
    private String photo;

    @ManyToMany
    @JoinTable(
            name = "user_favorites",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "accommodation_id")
    )
    private Set<Accommodation> favoriteAccommodations;

}
