package com.waybnb.accomodations.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;

    @Column
    private String country;

    @Column
    private String state;

    @Column
    private String city;

    @Column
    private String street;

}
