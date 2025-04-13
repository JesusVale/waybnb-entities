package com.waybnb.accomodations.entities;

import com.waybnb.accomodations.enums.AccommodationStatus;
import com.waybnb.accomodations.enums.PlaceType;
import com.waybnb.users.entities.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "accommodations")
public class Accommodation {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accommodationId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User host;

    @Column
    private Integer costPerNight;

    @Column
    private Integer capacity;

    @Column
    private String photo;

    @Enumerated(EnumType.STRING)
    private PlaceType placeType;

    @Enumerated(EnumType.STRING)
    private AccommodationStatus status;

    @Column
    private Float score;

    @ManyToMany(mappedBy = "favoriteAccommodations")
    private Set<User> likedByUsers = new HashSet<>();

}
