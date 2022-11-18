package com.example.tmdt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="first_name",nullable=false)
    private String first_name;

    @Column(name="last_name", nullable=false)
    private String last_name;

    @Column(name="phone", unique=true, nullable=false)
    private String phone;

    @Column(name="image_url")
    private String image_url;

    @Column(name="address")
    private String address;
}
