package com.ordk.fitapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@EqualsAndHashCode(exclude = "id")
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private int height;
    private double activityLevel;
    private LocalDate dateOfRegistration;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "person")
    private List<ProgressInfo> progressInfos;

}
