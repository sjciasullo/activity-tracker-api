package com.example.springapi.models;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "ACTIVITIES")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ACTIVITY_NAME")
    private String activityName;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "DATE")
    private java.sql.Date date;

    @Column(name = "TOTAL_MINUTES")
    private Integer totalMinutes;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "LONGITUDE")
    private Double longitude;
}
