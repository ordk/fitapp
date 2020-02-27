package com.ordk.fitapp.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class ProgressInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Person person;

    private LocalDateTime currentDateTime;
    private double bodyWeight;
    private double bodyFatLevel;
    private double bodyMusceLevel;
    private double bodyWaterLevel;
    private double circumNeck;
    private double circumLeftBiceps;
    private double circumRightBiceps;
    private double circumChest;
    private double circumWaist;
    private double circumHips;
    private double circumLeftThigh;
    private double circumRightThigh;
    private double circumLeftCalf;
    private double circumRightCalf;
    private int moodlevel;

}
