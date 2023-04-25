package com.example.aiturm.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "patronymic_name")
    private String patronymic_name;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "gender")
    private int gender;

    @Column(name = "speciality ")
    private int speciality;

    @Column(name = "speciality_group")
    private String speciality_group;
}